/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author 62018-16-01
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char reponse;
        System.out.println("CALCULATRICE");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez entrer un chiffre : ");
            double firstNumber = sc.nextDouble();
            sc.nextLine();
            System.out.println("Veuillez saisir un second chiffre : ");
            double secondNumber = sc.nextDouble();
            sc.nextLine();
            char signe;
            do {
                System.out.println("Quel opération voulez-vous réaliser ? (+ , -, *, /)");
                String operation = sc.nextLine();
                signe = operation.charAt(0);
                double division = firstNumber / secondNumber;
                double arrondi = arrondi(division, 2);
                
                if (secondNumber == 0 && signe =='/'){
                    System.out.println("On ne peut pas diviser par 0 !");
                    break;
                }

                switch (signe) {
                    case '+':
                        System.out.println("Le calcul " + (int) firstNumber + " + " + (int) secondNumber + " est égal à " + (int) (firstNumber + secondNumber));
                        break;
                    case '-':
                        System.out.println("Le calcul " + (int) firstNumber + " - " + (int) secondNumber + " est égal à " + (int)(firstNumber - secondNumber));
                        break;
                    case '*':
                        System.out.println("Le calcul " + (int) firstNumber + " * " + (int) secondNumber + " est égal à " + (int)(firstNumber * secondNumber));
                        break;
                    case '/':
                        System.out.println("Le calcul " + (int) firstNumber + " / " + (int) secondNumber + " est égal à " + arrondi);
                        break;
                    default :
                        System.out.println("Vous n'avez pas saisi une des opérations possibles");
                }
            } while (signe != '+' && signe != '-' && signe != '*' && signe != '/');
            
            System.out.println("Tapez la lettre O pour éxecuter une nouvelle opération ou toute autre touche pour quitter ?");
            reponse = sc.nextLine().toUpperCase().charAt(0);
            
        } while (reponse == 'O');

        System.out.println("Au revoir !");

    }

    public static double arrondi(double A, int B) {
        return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

}
