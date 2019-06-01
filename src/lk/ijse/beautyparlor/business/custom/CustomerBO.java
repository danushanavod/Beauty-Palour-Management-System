/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.business.custom;

import java.util.ArrayList;
import lk.ijse.beautyparlor.business.SuperBO;
import lk.ijse.beautyparlor.model.CustomerDTO;

/**
 *
 * @author ASUS
 */
public interface CustomerBO extends SuperBO{
    public boolean addCustomer(CustomerDTO customer) throws Exception;
    public boolean deleteCustomer(String custId) throws Exception;
    public boolean updateCustomer(CustomerDTO customer) throws Exception;
    public CustomerDTO searchCustomer(String custId) throws Exception;
    public ArrayList<CustomerDTO> getAllcustomers() throws Exception;
    public ArrayList<CustomerDTO> getAllCustomerIds() throws Exception;
}
