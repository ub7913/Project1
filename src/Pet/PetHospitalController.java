package Pet;

import java.awt.print.Book;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

<<<<<<< HEAD
import javafx.fxml.FXML;
=======
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
>>>>>>> branch 'master' of https://github.com/ub7913/Project1.git
import javafx.fxml.Initializable;
<<<<<<< HEAD
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
=======
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
>>>>>>> branch 'master' of https://github.com/ub7913/Project1.git

<<<<<<< HEAD
public class PetHospitalController implements Initializable{
@FXML GridPane grid;
@FXML TextField te;
=======
public class PetHospitalController implements Initializable {

	@FXML
	Button btnPetList;
	@FXML
	Button btnReservationList;
	@FXML
	Button btnTreatmentList;
//	@FXML
////	TableView<Treatment> diagTable;
//	@FXML
////	CheckBox gender;

>>>>>>> branch 'master' of https://github.com/ub7913/Project1.git
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
<<<<<<< HEAD
		
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
				
=======

		btnTreatmentList.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				treatList();
			}
		});
>>>>>>> branch 'master' of https://github.com/ub7913/Project1.git
		
		btnPetList.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				petList();
			}
		});
		
	}
	
	public void petList() {
		Stage addStage1 = new Stage(StageStyle.UTILITY);
		addStage1.initModality(Modality.WINDOW_MODAL);
		addStage1.initOwner(btnPetList.getScene().getWindow());
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("RegistrationChart.fxml"));
			Scene scene = new Scene(parent);
			addStage1.setScene(scene);
			addStage1.setResizable(false);
			addStage1.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void treatList() {
		Stage addStage = new Stage(StageStyle.UTILITY);
		addStage.initModality(Modality.WINDOW_MODAL);
		addStage.initOwner(btnTreatmentList.getScene().getWindow());
		
		Pet p = new Pet("20060901","김설마","진료중","김깜돌", "12", true, true, "17/08/01", "3.5", "01042680210", "김자바");
		ObservableList<Pet> scores = FXCollections.observableArrayList();
		scores.add(p);
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("dddd.fxml"));
			Scene scene = new Scene(parent);
			addStage.setScene(scene);
			addStage.setResizable(false);
			addStage.show();
			Button btnSave = (Button) parent.lookup("#save");
			Button btnReset = (Button) parent.lookup("#btnReset");
			Button back = (Button) parent.lookup("#btnBack");
			TableView<Pet> diagTable = (TableView) parent.lookup("#diagTable");

			TableColumn<Pet, ?> tcCode = diagTable.getColumns().get(0);
			tcCode.setCellValueFactory(new PropertyValueFactory("diagNo"));
			TableColumn<Pet, ?> tcName = diagTable.getColumns().get(1);
			tcName.setCellValueFactory(new PropertyValueFactory("id"));
			TableColumn<Pet, ?> tcWriter = diagTable.getColumns().get(2);
			tcWriter.setCellValueFactory(new PropertyValueFactory("name"));
			TableColumn<Pet, ?> tcPrice = diagTable.getColumns().get(3);
			tcPrice.setCellValueFactory(new PropertyValueFactory("doctor"));
			TableColumn<Pet, ?> tcRate = diagTable.getColumns().get(4);
			tcRate.setCellValueFactory(new PropertyValueFactory("status"));

			diagTable.setItems(scores);

			TextField txtPetNum = (TextField) parent.lookup("#txtName");
			TextField txtName = (TextField) parent.lookup("#txtName1");
			TextField txtWeight = (TextField) parent.lookup("#gender");
			TextField txtDiagNum = (TextField) parent.lookup("#neut");
			CheckBox gender = (CheckBox) parent.lookup("#gender");

			txtPetNum.setText(diagTable.getItems().get(0).getId());
			txtName.setText(diagTable.getItems().get(0).getName());
			txtWeight.setText(diagTable.getItems().get(0).getWeight());
			txtDiagNum.setText(diagTable.getItems().get(0).getHostName());
			txtPetNum.setText(diagTable.getItems().get(0).getName());

//			diagTable.setOnMouseClicked( EventHandler<MouseEvent>() {
//				@Override
//				public void handle(MouseEvent event) {
//					if (event.getClickCount() == 2) {
//						cl();
//					} else {
//						return;
//					}
//				}
//			});

			btnReset.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					addStage.close();
				}
			});
			btnSave.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					TextField txtCode = (TextField) parent.lookup("#txtCode");
					TextField txtName = (TextField) parent.lookup("#txtName");
					TextField txtWriter = (TextField) parent.lookup("#txtWriter");
					TextField txtPrice = (TextField) parent.lookup("#txtPrice");
					TextField txtRate = (TextField) parent.lookup("#txtRate");

					addStage.close();
				}

			});

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
