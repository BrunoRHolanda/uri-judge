package com.gibhub.brunorholanda.uri.judge.iniciante.bee1001.extremamentebasico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String a  = reader.readLine();
        String b = reader.readLine();

        int result = Result.sum(Integer.parseInt(a), Integer.parseInt(b));

        System.out.printf("X = %d\n", result);
    }
}

class Result {
    public static int sum(int a, int b) {
        return a + b;
    }
}
