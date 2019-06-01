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
public class Stylist {
    private String stylistId;
    private String category;
    private String stylistName;
    private double charge;
    private String serviceId;
    private String date;

    public Stylist() {
    }

    public Stylist(String stylistId, String category, String stylistName, double charge, String serviceId, String date) {
        this.stylistId = stylistId;
        this.category = category;
        this.stylistName = stylistName;
        this.charge = charge;
        this.serviceId = serviceId;
        this.date = date;
    }

    /**
     * @return the stylistId
     */
    public String getStylistId() {
        return stylistId;
    }

    /**
     * @param stylistId the stylistId to set
     */
    public void setStylistId(String stylistId) {
        this.stylistId = stylistId;
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
     * @return the stylistName
     */
    public String getStylistName() {
        return stylistName;
    }

    /**
     * @param stylistName the stylistName to set
     */
    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
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
        return "Stylist{" + "stylistId=" + stylistId + ", category=" + category + ", stylistName=" + stylistName + ", charge=" + charge + ", serviceId=" + serviceId + ", date=" + date + '}';
    }

    
    
    
}
