/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.beautyparlor.dao.CrudUtil;
import lk.ijse.beautyparlor.dao.custom.RentoutsDAO;
import lk.ijse.beautyparlor.entity.Rentouts;

/**
 *
 * @author ASUS
 */
public class RentoutsDAOImpl implements RentoutsDAO{

    @Override
    public boolean save(Rentouts rentout) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Rentouts VALUEAS(?,?,?,?,?,?)", rentout.getRentId(), rentout.getCategory(), rentout.getItemName(), rentout.getCharge(), rentout.getServiceId(), rentout.getDate())>0;
    }

    @Override
    public boolean update(Rentouts entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Rentouts SET category=?, itemName=?, charge=?, serviceId=?, date=? WHERE rentId=?", entity.getCategory(), entity.getItemName(), entity.getCharge(), entity.getServiceId(), entity.getServiceId(), entity.getDate(), entity.getRentId())>0;
    }

    @Override
    public boolean delete(String rentId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Rentouts WHERE rentId=?", rentId)>0;
    }

    @Override
    public Rentouts search(String rentId) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Rentouts WHERE rentId=?", rentId);
        if(rst.next()){
            return new Rentouts(rst.getString("rentId"), rst.getString("category"), rst.getString("itemName"), rst.getDouble("charge"), rst.getString("serviceId"), rst.getString("date"));
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Rentouts> getAll() throws Exception {
        ArrayList<Rentouts> allRentouts=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Rentouts");
        while(rst.next()){
            allRentouts.add(new Rentouts(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5), rst.getString(6)));
        }
        return allRentouts;
    }
    
}
