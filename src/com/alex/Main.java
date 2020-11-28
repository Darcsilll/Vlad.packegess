package com.alex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfElements = Integer.parseInt(reader.readLine());
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
            if (ints[i] % 2 == 0) {
                System.out.println("четное:" + " ");
                System.out.println(ints[i]);


            }
        }
    }
}