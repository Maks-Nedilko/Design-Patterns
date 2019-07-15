/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerNet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author makst
 */
public class MyClient {
    
    private static final int PORT = 10;
    private static final String HOST = "localhost";
    private static final String MESSAGE = "How are you server???";
    
    public static void main(String[] args) throws IOException {
        
        Socket socket = null;
        
        try{
           socket = new Socket(HOST, PORT); 
        }catch(UnknownHostException ex){
            System.out.println("НЕ могу определить хост");
        }catch(IOException ex){
             System.out.println("Не удаеться создать сокет");
        }
        
        try(InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();){
            
            os.write(MESSAGE.getBytes());
            os.flush();
            
            System.out.println("Wait...");
            byte[] array = new byte[32*1024];
            is.read(array);
            System.out.println("Server response" + new String(array));
            
        }catch(IOException ex){
            ex.printStackTrace();
             System.out.println("error read");
        }
        
    }
    
}
