package com.champlain.oop2lab1;

/**
 * Representing a person with name, phone number and email address.
 */
public class Person {
    /**
     * Storing the name of the person.
     */
    private String aName;

    /**
     * Storing the phone number of the person.
     */
    private String aPhoneNumber;

    /**
     * Storing the email address of the person.
     */
    private String aEmailAddress;

    /**
     * Storing whether a parking pass was purchased or not.
     */
    private boolean aPurchasedParkingPass;

    /**
     * Constructor of the class person, creating a new empty instance of a Person.
     */
    public Person () {
        aName = "";
        aPhoneNumber = "";
        aEmailAddress = "";
        aPurchasedParkingPass = false;
    }

    /**
     * Gets the name of the person.
     * @return String name of the person.
     */
    public String getName() {
        return aName;
    }

    /**
     * Sets the name of the person.
     * @param aName String name of the person.
     */
    public void setName(String aName) {
        this.aName = aName;
    }

    /**
     * Gets the phone number of the person.
     * @return String phone number of the person.
     */
    public String getPhoneNumber() {
        return aPhoneNumber;
    }

    /**
     * Sets the phone number of the person.
     * @param aPhoneNumber String phone number of the person.
     */
    public void setPhoneNumber(String aPhoneNumber) {
        this.aPhoneNumber = aPhoneNumber;
    }

    /**
     * Gets the email address of the person.
     * @return String email address of the person.
     */
    public String getEmailAddress() {
        return aEmailAddress;
    }

    /**
     * Sets the email address of the person.
     * @param aEmailAddress String email address of the person.
     */
    public void setEmailAddress(String aEmailAddress) {
        this.aEmailAddress = aEmailAddress;
    }

    /**
     * Shows whether a parking pass was purchased or not.
     * @return boolean whether a parking pass was purchased or not.
     */
    public boolean isPurchasedParkingPass() {
        return aPurchasedParkingPass;
    }

    /**
     * Purchases a parking pass for the person.
     * The <tt>parkingPassPurchased</tt> value changes from true to false.
     * @return true if purchase was successful, false if the pass was already bought.
     */
    public boolean PurchaseParkingPass()
    {
        // Determines if Person has purchased a parking pass.
        if (!aPurchasedParkingPass)
        {
            aPurchasedParkingPass = true;
            return true;
        }
        return false;
    }
}
