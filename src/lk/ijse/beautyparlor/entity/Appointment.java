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
public class Appointment {
    private String appointmentId;
    private String selectedDate;
    private String service;

    public Appointment() {
    }

    public Appointment(String appointmentId, String selectedDate, String service) {
        this.appointmentId = appointmentId;
        this.selectedDate = selectedDate;
        this.service = service;
    }

    /**
     * @return the appointmentId
     */
    public String getAppointmentId() {
        return appointmentId;
    }

    /**
     * @param appointmentId the appointmentId to set
     */
    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    /**
     * @return the selectedDate
     */
    public String getSelectedDate() {
        return selectedDate;
    }

    /**
     * @param selectedDate the selectedDate to set
     */
    public void setSelectedDate(String selectedDate) {
        this.selectedDate = selectedDate;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Appointment{" + "appointmentId=" + appointmentId + ", selectedDate=" + selectedDate + ", service=" + service + '}';
    }

    
    
    
    
}
