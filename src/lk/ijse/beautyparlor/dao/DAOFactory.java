/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.dao;

import lk.ijse.beautyparlor.dao.custom.impl.AppointmentDAOImpl;
import lk.ijse.beautyparlor.dao.custom.impl.BridalDAOImpl;
import lk.ijse.beautyparlor.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.beautyparlor.dao.custom.impl.PaymentsDAOImpl;
import lk.ijse.beautyparlor.dao.custom.impl.RentoutsDAOImpl;
import lk.ijse.beautyparlor.dao.custom.impl.ServiceDetailsDAOImpl;
import lk.ijse.beautyparlor.dao.custom.impl.ServicesDAOImpl;
import lk.ijse.beautyparlor.dao.custom.impl.StylistDAOImpl;

/**
 *
 * @author ASUS
 */
public class DAOFactory {
    
    public enum DAOTypes{
        CUSTOMER, SERVICEDETAILS, SERVICES, APPOINTMENTDETAILS, APPOINTMENT, STYLIST, BRIDAL, RENTOUTS, PAYMENTS;
    }
    
    private static DAOFactory dAOFactory;
    
    public static DAOFactory getInstance(){
        if(dAOFactory==null){
            dAOFactory=new DAOFactory();
        }
        return dAOFactory;
    }
    
    public <T extends SuperDAO> T getDAO(DAOTypes daoTypes){
        switch(daoTypes){
            case CUSTOMER:
                return(T) new CustomerDAOImpl();
            case SERVICEDETAILS:
                return(T) new ServiceDetailsDAOImpl();
            case SERVICES:
                return(T) new ServicesDAOImpl();
            case APPOINTMENT:
                return(T) new AppointmentDAOImpl();
            case STYLIST:
                return(T) new StylistDAOImpl();
            case BRIDAL:
                return(T) new BridalDAOImpl();
            case RENTOUTS:
                return(T) new RentoutsDAOImpl();
            case PAYMENTS:
                return(T) new PaymentsDAOImpl();
            default:
                return null;
        }
    }
    
    
}
