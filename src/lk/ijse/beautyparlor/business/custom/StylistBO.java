/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.business.custom;

import java.util.ArrayList;
import lk.ijse.beautyparlor.business.SuperBO;
import lk.ijse.beautyparlor.model.StylistDTO;

/**
 *
 * @author ASUS
 */
public interface StylistBO extends SuperBO{
    public boolean addStylist(StylistDTO stylist) throws Exception;
    public boolean deleteStylist(String stylist) throws Exception;
    public boolean updateStylist(StylistDTO stylist) throws Exception;
    public StylistDTO searchStylist(String stylist) throws Exception;
    public ArrayList<StylistDTO> getAllStylists() throws Exception;
    public ArrayList<String> getAllStylistIds() throws Exception;
    
    
}
