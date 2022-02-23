package com.gibhub.brunorholanda.uri.judge.iniciante.n1005.media1;

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

        double result = Result.media(Double.parseDouble(a), Double.parseDouble(b));

        System.out.printf("MEDIA = %s\n", String.format("%.5f", result));
    }
}

class Result {

    public static double media(double a, double b) {
        return ((a*3.5) + (b*7.5)) / 11;
    }
}
