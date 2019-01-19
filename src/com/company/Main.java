package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        String str;
        try (BufferedReader BR = new BufferedReader(new FileReader("test.txt"))) {
            while ((str = BR.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException io_exc) {
            System.out.println("Ошибка ввода-вывода: " + io_exc);
        }
    }
}