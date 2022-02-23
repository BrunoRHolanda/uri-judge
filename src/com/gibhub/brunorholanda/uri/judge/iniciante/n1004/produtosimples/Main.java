package com.gibhub.brunorholanda.uri.judge.iniciante.n1004.produtosimples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String a = reader.readLine();
        String b = reader.readLine();

        int result = Result.produto(Integer.parseInt(a), Integer.parseInt(b));

        System.out.printf("PROD = %d\n", result);
    }
}

class Result {

    public static int produto(int a, int b) {
        return a * b;
    }
}
