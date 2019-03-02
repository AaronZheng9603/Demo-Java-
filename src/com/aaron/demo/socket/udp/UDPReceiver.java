package com.aaron.demo.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10010);
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive(dp);
        byte[] bys2 = dp.getData();
        int length = bys2.length;
        String data = new String(bys2, 0, length);
        System.out.println(data.trim());
        ds.close();
    }
}
