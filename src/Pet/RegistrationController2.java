package Pet;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class RegistrationController2 implements Initializable {
	
	@FXML TextField txtName, txtWeight, txtAge, txtBreed, txtPhone, txtHost;
	@FXML ComboBox<String> comboGender, comboNuet;
	@FXML DatePicker dateBirth;
	
	Connection conn;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,"hr","hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnRegAction(ActionEvent e) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String sql = "INSERT INTO registration1(id,pet_name,"
					+ "pet_age,pet_birthdate,pet_gender,pet_breed,"
					+ "pet_weight,pet_nuet,host_name,host_phone) "
					+ "VALUES(pet_id_seq.nextval,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, txtName.getText());
			pstmt.setString(2, txtAge.getText());
			pstmt.setString(3, dateBirth.getValue().format(formatter));
			pstmt.setString(4, comboGender.getValue());
			pstmt.setString(5, txtBreed.getText());
			pstmt.setString(6, txtWeight.getText());
			pstmt.setString(7, comboNuet.getValue());
			pstmt.setString(8, txtHost.getText());
			pstmt.setString(9, txtPhone.getText());
			
			int r = pstmt.executeUpdate();
			System.out.println(r+"건 입력됨");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}
	
}
