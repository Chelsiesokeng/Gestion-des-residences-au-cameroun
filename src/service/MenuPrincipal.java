package service;

import utils.*;

import java.util.Scanner;

public class MenuPrincipal {
    Scanner sc = new Scanner(System.in);

    public MenuPrincipal() {
        super();
        this.choix();
    }

    public int choix() {
        int a;
        System.out.println("**************BIENVENUE SUR LE MENU PRINCIPALE*****************");
        System.out.println("[1] Gestion des profils utilisateurs");
        System.out.println("[2] gestion des Utilisateurs");
        System.out.println("[3] Gestion des residences");
        System.out.println("[4] Gestion des unite de residences");
        System.out.println("[5] Gestion des clients");
        System.out.println("[6] Gestion des prestations de services");
        System.out.println("***********SELECTIONNER VOTRE MENU************");
        System.out.print("Choisir l'action : ");

        a = sc.nextInt();
        switch (a) {
            case 1:
                new Gestion_Profils_Utilisateurs();
                break;
            case 2:
                new Gestion_Utilisateurs();
                break;
            case 3:
                new Gestion_Residences();
                break;
            case 4:
                new Gestion_Unites_Residences();
                break;
            case 5:
                new Gestion_client();
                break;
            case 6:
                new Gestion_Prestations_Services();
                break;
            default:
                System.out.println("Choix inexistant!");
                choix();
                break;
        }
        return a;
    }
}
