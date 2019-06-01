/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.beautyparlor.common;

import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class RestoreController {
    public static int restoreBackUp(String path) throws IOException, InterruptedException{
        String[] exCmd=new String[]{"mysql","BPMgt","--password=1234","-e","source"+path};
        Process runTime=Runtime.getRuntime().exec(exCmd);
        int res=runTime.waitFor();
        return res;
    }
    
}
