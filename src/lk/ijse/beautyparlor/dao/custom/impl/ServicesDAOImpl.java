/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.beautyparlor.dao.CrudUtil;
import lk.ijse.beautyparlor.dao.custom.ServicesDAO;
import lk.ijse.beautyparlor.entity.Services;

/**
 *
 * @author ASUS
 */
public class ServicesDAOImpl implements ServicesDAO{

    @Override
    public boolean save(Services services) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Services VALUES(?,?)", services.getServiceId(),services.getPaymentId())>0;
    }

    @Override
    public boolean update(Services entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Services SET paymentId=? WHERE serviceId=?", entity.getPaymentId(), entity.getServiceId())>0;
    }

    @Override
    public boolean delete(String serviceId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Services WHERE serviceId=?",serviceId)>0;
    }

    @Override
    public Services search(String serviceId) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Services WHERE serviceId=?", serviceId);
        if(rst.next()){
            return new Services(rst.getString("serviceId"), rst.getString("paymentId"));
            
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Services> getAll() throws Exception {
        ArrayList<Services> allServices=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Services");
        while(rst.next()){
            allServices.add(new Services(rst.getString(1), rst.getString(2)));
            
        }
        return allServices;
    }
    
}
