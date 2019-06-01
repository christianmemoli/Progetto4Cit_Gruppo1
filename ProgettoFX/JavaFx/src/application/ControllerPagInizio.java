package application;

import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerPagInizio  
{

@FXML private Button accedi;

@FXML
public void initialize(){
	



accedi.addEventHandler(ActionEvent.ACTION,ActionEvent -> {
	try 
	{
		Scene home =accedi.getParent().getScene();
		
	
		
		Parent node2= FXMLLoader.load(getClass().getResource("login.fxml"));
		Scene scena2 = new Scene(node2);
		home.getWindow().getOnCloseRequest();
	/*	Stage primary = 
		primary.setScene(scena2);*/
	
		
		
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
});



/*.addEventHandler(
	MouseEvent.MOUSE_CLICKED,
	new EventHandler<MouseEvent>()
	{
		@Override
		public void handle(MouseEvent event) 
		{
			// TODO Auto-generated method stub
			
		}
		  public void start(Stage primaryStage) 
		   {
		    	
		    	primaryStage.setTitle("Login");
		    	try {
					Parent rootNode= FXMLLoader.load(getClass().getResource("login.fxml"));
					Scene home = new Scene(rootNode);
					
					primaryStage.setScene(home);
					primaryStage.show();
				    }
		    	catch (IOException e) 
		    	{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		   }

		
	
		
	
	}
	);*/
	}
	
	
	
	
	
}


