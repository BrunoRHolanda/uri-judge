package com.gibhub.brunorholanda.uri.judge.iniciante.bee1010.calculosimples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        List<List<String>>  produtos = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            String[] temp = reader.readLine().split(" ");

            produtos.add(new ArrayList<>());

            for (String attr : temp) {

                produtos.get(produtos.size() - 1).add(attr);
            }
        }

        double result = Result.total(produtos);

        System.out.printf("VALOR A PAGAR: R$ %s\n", String.format("%.2f", result));
    }
}

class Result {
    public static double total(List<List<String>>  produtos) {
        AtomicReference<Double> total = new AtomicReference<>(0.0);

        produtos.forEach((List<String> p) -> {
            total.updateAndGet(v -> v + (Integer.parseInt(p.get(1)) * Double.parseDouble(p.get(2))));
        });

        return total.get();
    }
}
