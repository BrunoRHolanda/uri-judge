package com.gibhub.brunorholanda.uri.judge.iniciante.bee1007.diferenca;

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
        String d = reader.readLine();

        int result = Result.diff(
                Integer.parseInt(a),
                Integer.parseInt(b),
                Integer.parseInt(c),
                Integer.parseInt(d)
        );

        System.out.printf("DIFERENCA = %d\n", result);
    }
}

class Result {
    public static int diff(int a, int b, int c, int d) {
        return a*b - c*d;
    }
}
