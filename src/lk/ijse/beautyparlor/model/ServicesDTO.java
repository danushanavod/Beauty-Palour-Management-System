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
public class ServicesDTO {
    private String serviceId;
    private String paymentId;

    public ServicesDTO() {
    }

    public ServicesDTO(String serviceId, String paymentId) {
        this.serviceId = serviceId;
        this.paymentId = paymentId;
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

    @Override
    public String toString() {
        return "ServicesDTO{" + "serviceId=" + serviceId + ", paymentId=" + paymentId + '}';
    }
    
    
    
}
