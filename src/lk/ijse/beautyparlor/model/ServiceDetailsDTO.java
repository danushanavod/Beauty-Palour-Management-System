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
public class ServiceDetailsDTO {
    private String serviceDetailsId;
    private String customerId;
    private String serviceId;

    public ServiceDetailsDTO() {
    }

    public ServiceDetailsDTO(String serviceDetailsId, String customerId, String serviceId) {
        this.serviceDetailsId = serviceDetailsId;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    /**
     * @return the serviceDetailsId
     */
    public String getServiceDetailsId() {
        return serviceDetailsId;
    }

    /**
     * @param serviceDetailsId the serviceDetailsId to set
     */
    public void setServiceDetailsId(String serviceDetailsId) {
        this.serviceDetailsId = serviceDetailsId;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
        return "ServiceDetailsDTO{" + "serviceDetailsId=" + serviceDetailsId + ", customerId=" + customerId + ", serviceId=" + serviceId + '}';
    }
    
    
    
}
