package Model;

public class Model {

	public boolean confirmLogin(String tf_ID, String tf_PW) {
		if(tf_ID.equals("20180434") && tf_PW.equals("1234"))
			return true;
		else
			return false;
	}
}
