/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.beautyparlor.business.custom.CustomerBO;
import lk.ijse.beautyparlor.dao.DAOFactory;
import lk.ijse.beautyparlor.dao.custom.CustomerDAO;
import lk.ijse.beautyparlor.entity.Customer;
import lk.ijse.beautyparlor.model.CustomerDTO;

/**
 *
 * @author ASUS
 */
public class CustomerBOImpl implements CustomerBO{
    private CustomerDAO custtomerDAO;

    public CustomerBOImpl() {
        this.custtomerDAO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    }
    

    @Override
    public boolean addCustomer(CustomerDTO customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCustomer(String custId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCustomer(CustomerDTO customer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerDTO searchCustomer(String custId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerDTO> getAllcustomers() throws Exception {
        ArrayList<Customer> customers=custtomerDAO.getAll();
        ArrayList<CustomerDTO> dtos=new ArrayList<>();
        for(Customer e: customers){
         //   dtos.add(new CustomerDTO(e.getCustId(), e.getFullName(), e.getDate(), e.getNIC(), e.getMobileNo(), e.getLandNo(), e.getAddress()));
        }
        return dtos;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomerIds() throws Exception {
        return null;
     //   ArrayList<Customer> allCustomers=CustomerDAO.getAll();
        
    }
    
}
