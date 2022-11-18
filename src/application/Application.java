package application;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("----- Salut cher Camerounais -----");
        Scanner sc = new Scanner(System.in);
        new service.MenuPrincipal();
    }
}