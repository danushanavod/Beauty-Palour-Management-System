/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.business.custom;

import java.util.ArrayList;
import lk.ijse.beautyparlor.business.SuperBO;
import lk.ijse.beautyparlor.model.ServicesDTO;

/**
 *
 * @author ASUS
 */
public interface ServicesBO extends SuperBO{
    public boolean addServices(ServicesDTO services) throws Exception;
    public boolean deleteServices(String serviceId) throws Exception;
    public boolean updateServices(ServicesDTO services) throws Exception;
    public ServicesDTO searchServices(String serviceId) throws Exception;
    public ArrayList<ServicesDTO> getAllServices() throws Exception;
    public ArrayList<String> getAllServiceIds() throws Exception;
    
    
    
}
