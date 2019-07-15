/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerNet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author makst
 */
public class Server {
    
    private static final int PORT = 19_000;
    private static final String MESSAGE = "Hello, Hello my dear client!";
    
    public static void main(String[] args) throws IOException {
        
    ServerSocket serverSocket = null;
    Socket socket = null;
    
        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException ex) {
        
            System.out.println("Не удалось создать серверный сокет");
        return;
        }
    
        try {
            System.out.println("Ожидаем сообщение от клиента...");
            socket = serverSocket.accept();//блокирующий вызов
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ошибка ввода.вывода в сокете");
        }
    
        try(InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();){
            
            byte[] array = new byte[32*1024];
            is.read(array);
            String clientText = new String(array);
            System.out.println("Client say : " + clientText);
            
            os.write(MESSAGE.getBytes());
            os.flush();
            
            
        }catch(IOException ex){
            ex.printStackTrace();
            System.out.println("Ошибка ввода.вывода в сокете");
        }
    }
    
}
