package Pet;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PetHospitalController implements Initializable{
@FXML GridPane grid;
@FXML TextField te;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Date date= new Date();
		date.setTime(9);
//		date.setHours(9);
		Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				
		
		
		
		
		for(int i = 0;i<32;i++) {
			for(int j = 0;j<32;j++) {
				te.setText(cal.getTime().toString());
				cal.add(cal.MINUTE, 20);
				grid.add(te, i, j);
			}
		}
				
		
		
		
	}

}
