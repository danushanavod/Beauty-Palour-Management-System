/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.beautyparlor.dao.CrudUtil;
import lk.ijse.beautyparlor.dao.custom.StylistDAO;

import lk.ijse.beautyparlor.entity.Services;
import lk.ijse.beautyparlor.entity.Stylist;

/**
 *
 * @author ASUS
 */
public class StylistDAOImpl implements StylistDAO {

    @Override
    public boolean save(Stylist stylist) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Stylist VALUES(?,?,?,?,?,?,?)", stylist.getStylistId(), stylist.getCategory(), stylist.getStylistName(), stylist.getCharge(), stylist.getServiceId(), stylist.getDate())>0;
    }

    @Override
    public boolean update(Stylist entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Stylist SET category=?, stylistName=?, charge=?, serviceId=?, date=? WHERE stylistId=?", entity.getCategory(), entity.getStylistName(), entity.getCharge(), entity.getServiceId(), entity.getStylistId())>0;
    }

    @Override
    public boolean delete(String stylistId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Stylist WHERE stylistId=?", stylistId)>0;
    }

    @Override
    public Stylist search(String stylistId) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Stylist WHERE stylistId=?", stylistId);
        if(rst.next()){
            return new Stylist(rst.getString("stylistId"), rst.getString("category"), rst.getString("stylistName"), rst.getDouble("charge"), rst.getString("serviceId"), rst.getString("date"));
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Stylist> getAll() throws Exception {
        ArrayList<Stylist> allStylist=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Stylist");
        while(rst.next()){
            allStylist.add(new Stylist(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5), rst.getString(6)));
            
        }
        return allStylist;
    }

}