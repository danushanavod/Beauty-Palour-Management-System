/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.business.custom;

import java.util.ArrayList;
import lk.ijse.beautyparlor.business.SuperBO;
import lk.ijse.beautyparlor.model.PaymentsDTO;

/**
 *
 * @author ASUS
 */
public interface PaymentsBO extends SuperBO{
    public boolean addPayments(PaymentsDTO payments) throws Exception;
    public boolean deletePayments(String paymentId) throws Exception;
    public boolean updatePayments(PaymentsDTO payments) throws Exception;
    public boolean searchPayments(String paymentId) throws Exception;
    public ArrayList<PaymentsDTO> allPayments() throws Exception;
    public ArrayList<String> allPaymentsIDs() throws Exception;
     
}
