package com.sa.ElevenLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by akashs on 8/6/17.
 */

class ClientHandler extends Thread{
    Socket clientSocket;
    int clientNo;

    public ClientHandler(Socket clientSocket, int clientNo) {
        this.clientSocket = clientSocket;
        this.clientNo = clientNo;
    }

    public void run() {
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );

            out.println("Welcome to my server");

            while (true) {
                String ins = in.readLine();
                System.out.println("Client No "+clientNo+": "+ins);
                if(ins.equals("end")) break;

                String res = ins.toUpperCase();
                out.println(res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5050);

        int clientNo = 1;
        while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client request accepted for ClientNo "+clientNo);
            ClientHandler clientHandler = new ClientHandler(clientSocket, clientNo);
            clientHandler.start();

            clientNo++;
        }
    }
}















