package com.gibhub.brunorholanda.uri.judge.iniciante.bee1002.areadocirculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String raio = reader.readLine();

        double result = Result.area(Double.parseDouble(raio));

        System.out.println("A=" + String.format("%.4f", result));
    }
}

class Result {

    public static double area(double r) {
        return 3.14159 * (r * r);
    }
}

