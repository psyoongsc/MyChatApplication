package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class Controller {
	Model model = new Model();
	
	@FXML
	private TextField tf_ID;
	@FXML
	private TextField tf_PW;

	@FXML
	private void login(ActionEvent event) {
		boolean isSuccess = false;
		isSuccess = model.confirmLogin(tf_ID.getText(), tf_PW.getText());
		
		if(isSuccess) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("로그인 성공");
			alert.setHeaderText("로그인에 성공하셨습니다.");
			alert.showAndWait();
		}
		else
		{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("로그인 실패");
			alert.setHeaderText("아이디가 존재하지 않거나 패스워드가 틀렸습니다.");
			alert.showAndWait();
		}
	}
}

//Alert alert = new Alert(AlertType.INFORMATION);
//alert.setTitle("Message Here...");
//alert.setHeaderText("Look, an Information Dialog");
//alert.setContentText("I have a great message for you!");
//alert.showAndWait().ifPresent(rs -> {
//    if (rs == ButtonType.OK) {
//        System.out.println("Pressed OK.");
//    }
//});