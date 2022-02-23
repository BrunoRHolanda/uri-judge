package com.gibhub.brunorholanda.uri.judge.iniciante.bee1009.salariocombonus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String nome = reader.readLine();
        double salario = Double.parseDouble(reader.readLine());
        double vendas =  Double.parseDouble(reader.readLine());

        double result = Result.bonifica(salario, vendas);

        System.out.printf("TOTAL = R$ %s\n", String.format("%.2f", result));
    }
}

class Result {
    public static double bonifica(double salario, double vendas) {
        return salario + (vendas*0.15);
    }
}
