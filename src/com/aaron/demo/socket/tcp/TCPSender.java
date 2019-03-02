package com.aaron.demo.socket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPSender {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("Aaron", 8888);
        byte[] bys = "This is TCP.".getBytes();
        OutputStream os = socket.getOutputStream();
        os.write(bys);
        socket.close();
    }
}
