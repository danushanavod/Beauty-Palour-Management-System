/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.beautyparlor.dao.CrudUtil;
import lk.ijse.beautyparlor.dao.custom.AppointmentDAO;
import lk.ijse.beautyparlor.entity.Appointment;

/**
 *
 * @author ASUS
 */
public class AppointmentDAOImpl implements AppointmentDAO{

    @Override
    public boolean save(Appointment appointment) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Appointment VALUES(?,?,?)", appointment.getAppointmentId(), appointment.getSelectedDate(), appointment.getService())>0;
    }

    @Override
    public boolean update(Appointment entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Appointment SET selectedDate=?, service=? WHERE appointmentId=?", entity.getSelectedDate(), entity.getService(),entity.getAppointmentId())>0;
    }

    @Override
    public boolean delete(String appointmentId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Appointment WHERE appointmentId=?", appointmentId)>0;
    }

    @Override
    public Appointment search(String appointmentId) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Appointment WHERE appointmentId=?", appointmentId);
        if(rst.next()){
            return new Appointment(rst.getString("appointmentId"), rst.getString("selectedDate"), rst.getString("service"));
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Appointment> getAll() throws Exception {
        ArrayList<Appointment> allAppointments=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT* FROM Appointment");
        while(rst.next()){
            allAppointments.add(new Appointment(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return allAppointments;
    }
    
}
