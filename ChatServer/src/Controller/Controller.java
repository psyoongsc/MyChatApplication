package Controller;

import Model.Model;
import Model.Server;
import Model.UserThread;

import java.net.ServerSocket;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {
	private Model model = new Model();
	private Server server = new Server();
	
	@FXML
	private Button btn_service;
	@FXML
	private Rectangle rec_status;
	
	@FXML
	private void service(ActionEvent event) {
		
		if (btn_service.getText().equals("Start")) {
			btn_service.setDisable(true);
			model.serviceStart();
			
			btn_service.setText("Stop");
			rec_status.setFill(Color.web("#21ff9429"));
			btn_service.setDisable(false);
		} 
		else {
			btn_service.setDisable(true);
			model.serviceStop();
			
			btn_service.setText("Start");
			rec_status.setFill(Color.web("#ff000093"));
			btn_service.setDisable(false);
		}
	}
}
