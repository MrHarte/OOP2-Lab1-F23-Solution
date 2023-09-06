package com.champlain.oop2lab1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PersonViewController {
    /**
     * Label displaying the parking pass status.
     */
    @FXML
    private Label aParkingPassLabel;

    /**
     * Text box to enter and display the name.
     */
    @FXML
    private TextField aNameTextField;

    /**
     * Text box to enter and display the phone number.
     */
    @FXML
    private TextField aPhoneNumberTextField;

    /**
     * Text box to enter and display the email address.
     */
    @FXML
    private TextField aEmailAddressTextField;

    /**
     * Stores the used person instance.
     */
    private Person aPerson;

    /**
     * Save button method. Creates a new person instance, if none exists.
     * Sets all attributes and displays the information.
     * Confirms action with success alert box.
     */
    @FXML
    protected void onSaveButtonClick() {
        // Making sure there is a Person object to work with.
        if (this.aPerson == null) {
            this.aPerson = new Person();
        }
        this.aPerson.setName(aNameTextField.getText());
        this.aPerson.setEmailAddress(aEmailAddressTextField.getText());
        this.aPerson.setPhoneNumber(aPhoneNumberTextField.getText());
        this.displayPerson(this.aPerson);
        Alert errorAlert = new Alert(Alert.AlertType.CONFIRMATION, "Entered data saved successfully!");
        errorAlert.showAndWait();
    }

    /**
     * Load example button method. Replaces existing person instance with one with example data for demonstration.
     */
    @FXML
    protected void onLoadExampleButtonClick() {
        this.aPerson = new Person();
        this.aPerson.setName("John Doe");
        this.aPerson.setPhoneNumber("(819) 555-0123");
        this.aPerson.setEmailAddress("john@gmail.com");
        this.displayPerson(this.aPerson);
    }

    /**
     * Buy parking pass button method. Buys parking pass for person and shows error alert if it was already purchased.
     */
    @FXML
    protected void onBuyPassButtonClick() {
        // Making sure there is a Person object to work with.
        if (this.aPerson == null) {
            this.aPerson = new Person();
        }

        // Changing the value and displaying it.
        boolean purchaseResult = this.aPerson.PurchaseParkingPass();
        this.displayPerson(this.aPerson);
        if (!purchaseResult) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR, "This person already had a parking pass! Don't waste my money!");
            errorAlert.showAndWait();
        }
    }

    /**
     * Displays the given person instance in text boxes and lable.
     * @param person Person instance to display.
     */
    private void displayPerson(Person person) {
        aNameTextField.setText(aPerson.getName());
        aPhoneNumberTextField.setText(aPerson.getPhoneNumber());
        aEmailAddressTextField.setText(aPerson.getEmailAddress());
        if (person.isPurchasedParkingPass()) {
            aParkingPassLabel.setText("This person has a parking pass!");
            aParkingPassLabel.setTextFill(Color.color(0, 1, 0));
        } else {
            aParkingPassLabel.setText("This person does not have a parking pass!");
            aParkingPassLabel.setTextFill(Color.color(1, 0, 0));
        }
    }
}