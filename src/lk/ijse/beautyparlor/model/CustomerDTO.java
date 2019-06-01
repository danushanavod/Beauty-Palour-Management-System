/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.model;

/**
 *
 * @author ASUS
 */
public class CustomerDTO {
    private String custId;
    private String fullName;
    private String date;
    private String NIC;
    private String mobileNo;
    private String landNo;
    private String address;

    public CustomerDTO() {
    }

    public CustomerDTO(String custId, String fullName, String date, String NIC, String mobileNo, String landNo, String address) {
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
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the landNo
     */
    public String getLandNo() {
        return landNo;
    }

    /**
     * @param landNo the landNo to set
     */
    public void setLandNo(String landNo) {
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
        return "CustomerDTO{" + "custId=" + custId + ", fullName=" + fullName + ", date=" + date + ", NIC=" + NIC + ", mobileNo=" + mobileNo + ", landNo=" + landNo + ", address=" + address + '}';
    }
    
    
    
}
