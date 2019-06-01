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
public class AppointmentDetailsDTO {
    private String appointmentDetailsId;
    private String appointmentId;
    private String serviceId;

    public AppointmentDetailsDTO() {
    }

    public AppointmentDetailsDTO(String appointmentDetailsId, String appointmentId, String serviceId) {
        this.appointmentDetailsId = appointmentDetailsId;
        this.appointmentId = appointmentId;
        this.serviceId = serviceId;
    }

    /**
     * @return the appointmentDetailsId
     */
    public String getAppointmentDetailsId() {
        return appointmentDetailsId;
    }

    /**
     * @param appointmentDetailsId the appointmentDetailsId to set
     */
    public void setAppointmentDetailsId(String appointmentDetailsId) {
        this.appointmentDetailsId = appointmentDetailsId;
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

    @Override
    public String toString() {
        return "AppointmentDetailsDTO{" + "appointmentDetailsId=" + appointmentDetailsId + ", appointmentId=" + appointmentId + ", serviceId=" + serviceId + '}';
    }
    
    
    
}
