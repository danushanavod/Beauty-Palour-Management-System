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
public class BackupController {
    public static int wrightBackUp(String path) throws IOException, InterruptedException{
        Runtime runtime=Runtime.getRuntime();
        Process runPro=runtime.exec("mysql|dump BeautyParlor -h localhost -u root -p1234 -r"+path);
        int res=runPro.waitFor();
        return res;
    }
    
}
