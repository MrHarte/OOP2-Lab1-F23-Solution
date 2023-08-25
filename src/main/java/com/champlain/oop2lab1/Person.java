package com.champlain.oop2lab1;

public class Person {
    private String aName;
    private String aPhoneNumber;
    private String aEmailAddress;



    private boolean aPurchasedParkingPass;

    public Person () {
        aName = "";
        aPhoneNumber = "";
        aEmailAddress = "";
        aPurchasedParkingPass = false;
    }

    public String getName() {
        return aName;
    }

    public void setName(String aName) {
        this.aName = aName;
    }

    public String getPhoneNumber() {
        return aPhoneNumber;
    }

    public void setPhoneNumber(String aPhoneNumber) {
        this.aPhoneNumber = aPhoneNumber;
    }

    public String getEmailAddress() {
        return aEmailAddress;
    }

    public void setEmailAddress(String aEmailAddress) {
        this.aEmailAddress = aEmailAddress;
    }

    public boolean isPurchasedParkingPass() {
        return aPurchasedParkingPass;
    }

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
