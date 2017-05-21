package rocket.app.view;

import eNums.eAction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import rocket.app.MainApp;
import rocketCode.Action;
import rocketData.LoanRequest;

public class MortgageController {

	ObservableList<String> options = FXCollections.observableArrayList("15 Year Fixed Rate", "30 Year Fixed Rate");

	@FXML
	TextField txtIncome;
	@FXML
	TextField txtExpenses;
	@FXML
	TextField txtCreditScore;
	@FXML
	TextField txtHouseCost;
	@FXML
	TextField txtDownPayment;
	@FXML
	Label lablMortgagePayment;
	@FXML
	ComboBox<String> cmbTerm;

	private MainApp mainApp;

	@FXML
	private void initialize() {
		cmbTerm.setItems(options);
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	public void btnCalculatePayment(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Message Here...");
		alert.setHeaderText("Look, an Information Dialog");
		alert.setContentText(txtNew.getText());
		alert.showAndWait().ifPresent(rs -> {
			if (rs == ButtonType.OK) {
				System.out.println("Pressed OK.");
			}
		});
	}

	public void HandleLoanRequestDetails(LoanRequest lRequest) {
		// TODO - RocketClient.HandleLoanRequestDetails
		// lRequest is an instance of LoanRequest.
		// after it's returned back from the server, the payment (dPayment)
		// should be calculated.
		// Display dPayment on the form, rounded to two decimal places

		double amount = lRequest.getIncome() * 0.28;
		double income = lRequest.getIncome() * 0.36 - lRequest.getExpenses();

		if (amount < income) {
			double pay = Math.round(lRequest.getdPayment());
			System.out.printf("Payment is %.2f", pay);
		} else {
			double pay = Math.round(lRequest.getdPayment());
			System.out.printf("Payment is %.2f", pay);
			
		}

	}
}