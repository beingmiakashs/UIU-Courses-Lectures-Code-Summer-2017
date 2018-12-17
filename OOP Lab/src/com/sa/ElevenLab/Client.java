package com.sa.ElevenLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by akashs on 8/6/17.
 */
    public class Client {
        public static void main(String[] args) throws IOException {
            Socket clientSocket = new Socket("127.0.0.1", 5050);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );

            String s = in.readLine();
            System.out.println(s);

            Scanner scanner = new Scanner(System.in);

            while(true) {
                String ins = scanner.nextLine();
                out.println(ins);
                if(ins.equals("end")) break;

                String res = in.readLine();
                System.out.println(res);
            }

        }
    }












