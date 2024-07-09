package Home_Screen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import Common.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public  class HomeScreen { 
	 public  static void show()  {
			
			URL fxmlurl;
			try {
				fxmlurl = Paths
						.get("F:\\Log-In-Page\\src\\main\\java\\Home_Screen\\HomeScreen.fxml") 
						.toUri().toURL(); 
				Parent actorGroup = FXMLLoader.load(fxmlurl);

		         Scene scene = new Scene(actorGroup, 600, 400);
		          StageHolder.stage.setTitle("HomeScreen"); 
		          StageHolder.stage.setScene(scene);
				  StageHolder.stage.show();


			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}



}
