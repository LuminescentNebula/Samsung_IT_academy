package ru.LuminescentNebula;

import java.util.Scanner;

public class E1_4_1 {
    public static void E_1_4_1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println(a & (Integer.MAX_VALUE-3));

    }
}
