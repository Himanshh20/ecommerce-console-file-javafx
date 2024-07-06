package Home_Screen;

import java.awt.Button;

import javafx.fxml.FXML;

public class HomeScreenControler { 
	 @FXML 
	   private Button addproductonClick  ; 
	 @FXML 
	  private Button adduseronClick ; 
	 @FXML 
	  private Button logoutonClick ;  
	 
	 

		public void addproductonClick() {
			System.out.println("Welcome to Product Management");

		} 
		public void  adduseronClick(){
			System.out.println(" Welcome to User Management")  ; 
		 
		} 


		public void  logoutonClick(){
			System.out.println("Logout");

		}


}
