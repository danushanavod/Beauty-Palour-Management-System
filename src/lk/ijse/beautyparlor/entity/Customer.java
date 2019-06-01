/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.entity;

/**
 *
 * @author ASUS
 */
public class Customer {
    private String custId;
    private String fullName;
    private String date;
    private String NIC;
    private int mobileNo;
    private int landNo;
    private String address;

    public Customer() {
    }

    public Customer(String custId, String fullName, String date, String NIC, int mobileNo, int landNo, String address) {
        this.custId = custId;
        this.fullName = fullName;
        this.date = date;
        this.NIC = NIC;
        this.mobileNo = mobileNo;
        this.landNo = landNo;
        this.address = address;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the mobileNo
     */
    public int getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the landNo
     */
    public int getLandNo() {
        return landNo;
    }

    /**
     * @param landNo the landNo to set
     */
    public void setLandNo(int landNo) {
        this.landNo = landNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", fullName=" + fullName + ", date=" + date + ", NIC=" + NIC + ", mobileNo=" + mobileNo + ", landNo=" + landNo + ", address=" + address + '}';
    }

    
    
    
}
