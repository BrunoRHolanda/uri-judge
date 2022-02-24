package com.gibhub.brunorholanda.uri.judge.iniciante.bee1012.area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String[] entrada = reader.readLine().split(" ");

        double a = Double.parseDouble(entrada[0]);
        double b = Double.parseDouble(entrada[1]);
        double c = Double.parseDouble(entrada[2]);

        System.out.printf("TRIANGULO: %s\n", String.format("%.3f", Result.areaTriangulo(a, c)));
        System.out.printf("CIRCULO: %s\n", String.format("%.3f", Result.areaCirculo(c)));
        System.out.printf("TRAPEZIO: %s\n", String.format("%.3f", Result.areaTrapezio(c, a, b)));
        System.out.printf("QUADRADO: %s\n", String.format("%.3f", Result.areaQuadrado(b)));
        System.out.printf("RETANGULO: %s\n", String.format("%.3f", Result.areaRetangulo(a, b)));
    }
}

class Result {
    public static double areaTriangulo(double b, double h) {
        return (b * h)/2;
    }

    public static double areaCirculo(double r) {
        return 3.14159 * (r*r);
    }

    public static double areaTrapezio(double h, double b1, double b2) {
        return (1.0/2) * h * (b1 + b2);
    }

    public static double areaQuadrado(double l) {
        return (l*l);
    }

    public static double areaRetangulo(double a, double b) {
        return (a*b);
    }
}
