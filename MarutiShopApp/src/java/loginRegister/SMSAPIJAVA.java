/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginRegister;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URL; 

/**
 *
 * @author MKS
 */
public class SMSAPIJAVA {

    /**
     * @param args the command line arguments
     */
    public static void send(String mno) {
        // TODO code application logic here
        String testurl="https://smsapi.engineeringtgr.com/send/?Mobile=9424857401&Password=Good2019Good&Message=MarutiOnlineStore&To=+mno+&Key=prakhujR4mMpNAD3dI6wL";
        try {
            URL url = new URL(testurl);
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            String response="";
            while ((i = stream.read()) != -1) {
                response+=(char)i;
            }
            if(response.contains("success")){
                System.out.println("Successfully send SMS");
                //your code when message send success
            }else{
                System.out.println(response);
                //your code when message not send
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
