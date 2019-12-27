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
			alert.setTitle("�α��� ����");
			alert.setHeaderText("�α��ο� �����ϼ̽��ϴ�.");
			alert.showAndWait();
		}
		else
		{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("�α��� ����");
			alert.setHeaderText("���̵� �������� �ʰų� �н����尡 Ʋ�Ƚ��ϴ�.");
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