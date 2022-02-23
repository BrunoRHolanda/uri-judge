package com.gibhub.brunorholanda.uri.judge.iniciante.bee1006.media2;

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
        String c = reader.readLine();

        double result = Result.media(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));

        System.out.printf("MEDIA = %s\n", String.format("%.1f", result));
    }
}

class Result {
    public static double media(double a, double b, double c) {
        return ((a*2) + (b*3) + (c*5)) / 10;
    }
}
