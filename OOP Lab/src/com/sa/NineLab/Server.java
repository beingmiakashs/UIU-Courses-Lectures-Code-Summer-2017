package com.sa.NineLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by akashs on 8/6/17.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5050);
        //192.168.122.1
//        while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client request accepted");
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );
            out.println("Welcome to my server");

            String ins = in.readLine();
            String res = ins.toUpperCase();
            out.println(res);
//        }
    }
}












