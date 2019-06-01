/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.business;

import lk.ijse.beautyparlor.business.custom.impl.AppointmentBOImpl;
import lk.ijse.beautyparlor.business.custom.impl.BridalBOImpl;
import lk.ijse.beautyparlor.business.custom.impl.CustomerBOImpl;
import lk.ijse.beautyparlor.business.custom.impl.PaymentsBOImpl;
import lk.ijse.beautyparlor.business.custom.impl.RentoutsBOImpl;
import lk.ijse.beautyparlor.business.custom.impl.ServicesBOImpl;
import lk.ijse.beautyparlor.business.custom.impl.StylistBOImpl;

/**
 *
 * @author ASUS
 */
public class BOFactory {
    public enum BOTypes{
        CUSTOMER, SERVICES, APPOINTMENT, STYLIST, BRIDAL, PAYMENT, RENTOUTS;
    }
    
    private static BOFactory boFactory;

    public BOFactory() {
    }
    
    public static BOFactory getIstance(){
        if(boFactory==null){
            boFactory=new BOFactory();
        }
        return boFactory;
    }
    
    public <T extends SuperBO>T getBO(BOTypes boTypes){
        switch(boTypes){
            case CUSTOMER:
                return(T) new CustomerBOImpl();
            case SERVICES:
                return(T) new ServicesBOImpl();
            case APPOINTMENT:
                return(T) new AppointmentBOImpl();
            case STYLIST:
                return(T) new StylistBOImpl();
            case BRIDAL:
                return(T) new BridalBOImpl();
            case PAYMENT:
                return(T) new PaymentsBOImpl();
            case RENTOUTS:
                return(T) new RentoutsBOImpl();
            default:
                return null;     
        }
    }
}
