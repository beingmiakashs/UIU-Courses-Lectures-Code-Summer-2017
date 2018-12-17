package com.sa.NineLab;

import java.io.*;
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
        String ins = scanner.nextLine();
        out.println(ins);

        String res = in.readLine();
        System.out.println(res);

    }
}












