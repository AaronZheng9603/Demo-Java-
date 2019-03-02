package com.aaron.demo.socket.udp;

import java.io.IOException;
import java.net.*;

public class UDPSender {

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "This is UDP.".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("Aaron"), 10010);
        ds.send(dp);
        ds.close();
    }
}
