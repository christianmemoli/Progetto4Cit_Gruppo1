package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class GraficaImport extends Application{

	
	  @Override
	   public void start(Stage primaryStage) {
	    	
	    	primaryStage.setTitle("Homa Page");
	    	try {
				Parent rootNode= FXMLLoader.load(getClass().getResource("paginaInizio.fxml"));
				Scene home = new Scene(rootNode);
				
				primaryStage.setScene(home);
				primaryStage.show();
			}
	    	catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	   
	 
}
	       public static void main(String[] args) {
	            launch(args);
	        }
	        
	  
}
