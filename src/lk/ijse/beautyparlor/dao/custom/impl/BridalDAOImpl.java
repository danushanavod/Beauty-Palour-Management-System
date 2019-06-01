/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.beautyparlor.dao.CrudDAO;
import lk.ijse.beautyparlor.dao.CrudUtil;
import lk.ijse.beautyparlor.dao.custom.BridalDAO;
import lk.ijse.beautyparlor.entity.Bridal;

/**
 *
 * @author ASUS
 */
public class BridalDAOImpl implements BridalDAO{

    @Override
    public boolean save(Bridal bridal) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Bridal VALUES(?,?,?,?,?,?)", bridal.getPackageId(), bridal.getCategory(), bridal.getPackageName(), bridal.getCharge(), bridal.getServiceId(), bridal.getDate())>0;
    }

    @Override
    public boolean update(Bridal entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Bridal SET category=?, packageName=?, charge=?, serviceId=?, date=? WHERE bridalId=?", entity.getCategory(), entity.getPackageName(), entity.getCharge(), entity.getServiceId(), entity.getDate(), entity.getPackageId())>0;
    }

    @Override
    public boolean delete(String packageId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Bridal WHERE packageId=?", packageId)>0;
    }

    @Override
    public Bridal search(String packageId) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Bridal WHERE packageId=?", packageId);
        if(rst.next()){
            return new Bridal(rst.getString("packageId"), rst.getString("category"), rst.getString("packageName"),rst.getDouble("charge"), rst.getString("serviceId"), rst.getString("date"));
            
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Bridal> getAll() throws Exception {
        ArrayList<Bridal> allBridals=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM Bridal");
        while(rst.next()){
            new Bridal(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5), rst.getString(6));
        }
        return allBridals;
        
    }
    
}
