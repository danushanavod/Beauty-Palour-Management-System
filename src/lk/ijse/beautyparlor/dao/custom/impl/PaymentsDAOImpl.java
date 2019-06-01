/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.beautyparlor.dao.CrudUtil;
import lk.ijse.beautyparlor.dao.custom.PaymentsDAO;
import lk.ijse.beautyparlor.entity.Payments;

/**
 *
 * @author ASUS
 */
public class PaymentsDAOImpl implements PaymentsDAO{

    @Override
    public boolean save(Payments payments) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Payments VALUES(?,?,?,?,?,?,?,?)", payments.getPaymentId(), payments.getDate(), payments.getAppointmentCharge(), payments.getStylistCharge(), payments.getBridalCharge(), payments.getRentCharge(), payments.getMethod(), payments.getFullAmount())>0;
    }

    @Override
    public boolean update(Payments entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Payments SET date=?, appointmentCharge=?, stylistCharge=?, brdalCharge=, rentCharge=?, method=?, fullAmount=? WHERE paymentId=?", entity.getDate(), entity.getAppointmentCharge(), entity.getStylistCharge(), entity.getBridalCharge(), entity.getRentCharge(), entity.getMethod(), entity.getFullAmount(), entity.getPaymentId())>0;
    }

    @Override
    public boolean delete(String paymentId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Payments VALUES WHERE paymentId=?", paymentId)>0;
    }

    @Override
    public Payments search(String paymentId) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Payments WHERE paymentId=?", paymentId);
        if(rst.next()){
            return new Payments(rst.getString("paymentId"), rst.getString("date"), rst.getDouble("appointmentCharge"), rst.getDouble("stylistCharge"), rst.getDouble("bridalCharge"), rst.getDouble("rentCharge"), rst.getString("method"), rst.getDouble("fullAmount") );
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Payments> getAll() throws Exception {
        ArrayList<Payments> allPayments=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Payments");
        while(rst.next()){
            allPayments.add(new Payments(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6), rst.getString(7), rst.getDouble(8)));
        }
        return allPayments;
    }
    
}
