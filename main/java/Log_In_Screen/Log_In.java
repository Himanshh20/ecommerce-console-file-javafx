package Log_In_Screen;

import java.net.URL;
import java.nio.file.Paths;

import Common.StageHolder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Log_In extends Application  {    
	public static void main(String[] args) {
		Application.launch(args);

	}
 
    public void start (  Stage  stageCreatedByJavafx) throws Exception {
				
				StageHolder.stage=stageCreatedByJavafx;
				
				URL fxmlurl = Paths
						.get("F:\\Log-In-Page\\src\\main\\java\\Log_In_Screen\\LogInPage.fxml") 
						.toUri().toURL();

				Parent actorGroup = FXMLLoader.load(fxmlurl);

				((Stage) StageHolder.stage).setTitle("E-Commerce Login");

				Scene scene = new Scene(actorGroup, 600, 400);

				(StageHolder.stage).setScene(scene);
				( StageHolder.stage).show();

			} 
    
		
	}


	 
	 
	 


