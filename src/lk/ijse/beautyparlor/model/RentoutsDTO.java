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
public class RentoutsDTO {
    private String rentId;
    private String category;
    private String itemName;
    private double charge;
    private String serviceId;
    private String date;

    public RentoutsDTO() {
    }

    public RentoutsDTO(String rentId, String category, String itemName, double charge, String serviceId, String date) {
        this.rentId = rentId;
        this.category = category;
        this.itemName = itemName;
        this.charge = charge;
        this.serviceId = serviceId;
        this.date = date;
    }

    /**
     * @return the rentId
     */
    public String getRentId() {
        return rentId;
    }

    /**
     * @param rentId the rentId to set
     */
    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the charge
     */
    public double getCharge() {
        return charge;
    }

    /**
     * @param charge the charge to set
     */
    public void setCharge(double charge) {
        this.charge = charge;
    }

    /**
     * @return the serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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

    @Override
    public String toString() {
        return "RentoutsDTO{" + "rentId=" + rentId + ", category=" + category + ", itemName=" + itemName + ", charge=" + charge + ", serviceId=" + serviceId + ", date=" + date + '}';
    }
    
    
    
}
