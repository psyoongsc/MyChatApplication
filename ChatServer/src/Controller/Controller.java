package Controller;

import Model.Model;
import Model.UserThread;

import java.net.ServerSocket;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {
	private Model model = new Model();
	private UserThread clients[] = new UserThread[50];
	private int clientCount = 0;
	private ServerSocket server = null;
	private Thread thread = null;
	
	@FXML
	private Button btn_service;
	@FXML
	private Rectangle rec_status;
	
	@FXML
	private void service(ActionEvent event) {
		if (thread == null) {
			thread = new Thread(model);
			thread.start();
		}
		
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
