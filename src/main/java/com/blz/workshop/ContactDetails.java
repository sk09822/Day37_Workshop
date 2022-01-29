package com.blz.workshop;
public class ContactDetails {
    public String mobileNumber;
    public String landLineNo;

    public ContactDetails(String landLineNo,String mobileNumber) {
        this.landLineNo= landLineNo;
        this.mobileNumber = mobileNumber;
    }

    public String getLandLineNo() {
        return landLineNo;
    }

    public void setLandLineNo(String landLineNo) {
        this.landLineNo = landLineNo;
    }

    public String getmobileNumber() {
        return mobileNumber;
    }

    public void setmobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}