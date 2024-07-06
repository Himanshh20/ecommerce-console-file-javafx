package Log_In_Screen;

import Home_Screen.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class login_controler  { 
	 @FXML 
	 TextField loginname ; 
	  
	 @FXML 
	 TextField password ;  
	  @FXML 
	   Label errr0rMessage ; 
	 
	 public void clickonButton() {
	
		   
		// String userFromDB =  "Admin"; 
		//  String passFromDB = " Admin";  
		   
	//	   if ( loginname.getText().equals(userFromDB) && password.getText().equals(passFromDB)) {
			 //  errr0rMessage.setText("Login Sucessfull");  
			   
		   errr0rMessage.setText("login sucessful"); 

			   HomeScreen.show();   
		  // } 
		//   else {
			  
		   }//

	 }



