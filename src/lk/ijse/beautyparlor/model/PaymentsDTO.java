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
public class PaymentsDTO {
    private String paymentId;
    private String date;
    private double appointmentCharge;
    private double stylistCharge;
    private double bridalCharge;
    private double rentCharge;
    private String method;
    private double fullAmount;

    public PaymentsDTO() {
    }

    public PaymentsDTO(String paymentId, String date, double appointmentCharge, double stylistCharge, double bridalCharge, double rentCharge, String method, double fullAmount) {
        this.paymentId = paymentId;
        this.date = date;
        this.appointmentCharge = appointmentCharge;
        this.stylistCharge = stylistCharge;
        this.bridalCharge = bridalCharge;
        this.rentCharge = rentCharge;
        this.method = method;
        this.fullAmount = fullAmount;
    }

    /**
     * @return the paymentId
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
     * @return the appointmentCharge
     */
    public double getAppointmentCharge() {
        return appointmentCharge;
    }

    /**
     * @param appointmentCharge the appointmentCharge to set
     */
    public void setAppointmentCharge(double appointmentCharge) {
        this.appointmentCharge = appointmentCharge;
    }

    /**
     * @return the stylistCharge
     */
    public double getStylistCharge() {
        return stylistCharge;
    }

    /**
     * @param stylistCharge the stylistCharge to set
     */
    public void setStylistCharge(double stylistCharge) {
        this.stylistCharge = stylistCharge;
    }

    /**
     * @return the bridalCharge
     */
    public double getBridalCharge() {
        return bridalCharge;
    }

    /**
     * @param bridalCharge the bridalCharge to set
     */
    public void setBridalCharge(double bridalCharge) {
        this.bridalCharge = bridalCharge;
    }

    /**
     * @return the rentCharge
     */
    public double getRentCharge() {
        return rentCharge;
    }

    /**
     * @param rentCharge the rentCharge to set
     */
    public void setRentCharge(double rentCharge) {
        this.rentCharge = rentCharge;
    }

    /**
     * @return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return the fullAmount
     */
    public double getFullAmount() {
        return fullAmount;
    }

    /**
     * @param fullAmount the fullAmount to set
     */
    public void setFullAmount(double fullAmount) {
        this.fullAmount = fullAmount;
    }

    @Override
    public String toString() {
        return "PaymentsDTO{" + "paymentId=" + paymentId + ", date=" + date + ", appointmentCharge=" + appointmentCharge + ", stylistCharge=" + stylistCharge + ", bridalCharge=" + bridalCharge + ", rentCharge=" + rentCharge + ", method=" + method + ", fullAmount=" + fullAmount + '}';
    }
    
    
    
}
