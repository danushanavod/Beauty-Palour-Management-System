/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.business.custom;

import java.util.ArrayList;
import lk.ijse.beautyparlor.business.SuperBO;
import lk.ijse.beautyparlor.model.RentoutsDTO;

/**
 *
 * @author ASUS
 */
public interface RentoutsBO extends SuperBO{
    public boolean addRentouts(RentoutsDTO rentouts) throws Exception;
    public boolean deleteRentouts(String rentoutsId) throws Exception;
    public boolean updateRentouts(RentoutsDTO rentouts) throws Exception;
    public RentoutsDTO searchRentouts(String rentouts) throws Exception;
    public ArrayList<RentoutsDTO> getAllRentouts() throws Exception;
    public ArrayList<RentoutsDTO> getAllRentoutIds() throws Exception;
    
    
}
