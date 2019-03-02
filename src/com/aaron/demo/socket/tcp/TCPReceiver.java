package com.aaron.demo.socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int length = is.read(bys);
        String data = new String(bys, 0, length);
        System.out.println(data.trim());
        socket.close();
    }
}
