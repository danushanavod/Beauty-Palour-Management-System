/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.business.custom;

import java.util.ArrayList;
import lk.ijse.beautyparlor.model.AppointmentDTO;

/**
 *
 * @author ASUS
 */
public interface AppointmentBO {
    public boolean addAppointment(AppointmentDTO appointment) throws Exception;
    public boolean deleteAppointment(String appointmentId) throws Exception;
    public boolean updateAppointment(AppointmentDTO appointment) throws Exception;
    public AppointmentDTO searchAppointment(String appointmentId) throws Exception;
    public ArrayList<AppointmentDTO> getAllAppointments() throws Exception;
    public ArrayList<AppointmentDTO> getAllAppointmentIds() throws Exception;
    
    
}
