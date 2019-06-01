/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.beautyparlor.dao.CrudUtil;
import lk.ijse.beautyparlor.dao.custom.CustomerDAO;
import lk.ijse.beautyparlor.entity.Customer;

/**
 *
 * @author ASUS
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public boolean save(Customer customer) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?)", customer.getCustId(), customer.getFullName(), customer.getDate(), customer.getNIC(), customer.getMobileNo(), customer.getLandNo(), customer.getAddress())>0;
    }

    @Override
    public boolean update(Customer entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET fullName=?, date=?, NIC=?, mobileNo=?, landNo=?, address=? WHERE custId=?",entity.getFullName(), entity.getNIC(), entity.getMobileNo(), entity.getLandNo(), entity.getAddress(), entity.getCustId())>0;
    }

    @Override
    public boolean delete(String custId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE custId=?", custId)>0;
    }

    @Override
    public Customer search(String custId) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Customer WHERE custId?", custId);
        if(rst.next()){
            return new Customer(rst.getString("custId"), rst.getString("fullName"), rst.getString("date"), rst.getString("NIC"), rst.getInt("mobileNo"), rst.getInt("landNo"), rst.getString("address"));
            
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Customer> getAll() throws Exception {
        ArrayList<Customer> allCustomers=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Customer");
        while(rst.next()){
            allCustomers.add(new Customer(rst.getString(1),rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5), rst.getInt(6), rst.getString(7)));
            
        }
        return allCustomers;
    }
    
}
