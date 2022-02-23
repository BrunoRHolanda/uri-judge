package com.gibhub.brunorholanda.uri.judge.iniciante.bee1011.esfera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        double r = Double.parseDouble(reader.readLine());

        double result = Result.volume(r);

        System.out.printf("VOLUME = %s\n", String.format("%.3f", result));
    }
}

class Result {
    public static double volume(double r) {
        return Math.pow(r, 3) * 3.14159 * (4.0/3);
    }
}
