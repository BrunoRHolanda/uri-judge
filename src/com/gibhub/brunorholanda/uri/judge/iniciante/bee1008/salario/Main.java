package com.gibhub.brunorholanda.uri.judge.iniciante.bee1008.salario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String id = reader.readLine();
        int horasTrabalhadas = Integer.parseInt(reader.readLine());
        double valorHora = Double.parseDouble(reader.readLine());

        double result = Result.salario(horasTrabalhadas, valorHora);

        System.out.printf("NUMBER = %s\n", id);
        System.out.printf("SALARY = U$ %s\n", String.format("%.2f", result));
    }
}

class Result {
    public static double salario(int horasTrabalhadas, double valorHora) {
        return horasTrabalhadas*valorHora;
    }
}
