/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.main.java.pl.edu.ur.oopl10;
import java.util.Scanner;

/**
 *
 * @author lokyiec
 */

public class Main {
    private static void Zad_1() {
        WprowadzZKonsoli getFromConsole = new WprowadzZKonsoli();
        getFromConsole.wprowadzInt();
    }

    private static void Zad_2(){
        ArrayIndexOOBE ArrayIndexOOBE = new ArrayIndexOOBE();
        ArrayIndexOOBE.test();
    }

    private static void Zad_3(){
        ThrowTest ett = new ThrowTest();
        ett.test();
    }

    private static void Zad_4(){
        RandomNumber RandomNumber = new RandomNumber();
        RandomNumber.random();
    }

    private static void Zad_5(){

    }

    public static void main(String[] args) {
        int wybor;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(" [ 1 ] Zadanie 1");
            System.out.println(" [ 2 ] Zadanie 2");
            System.out.println(" [ 3 ] Zadanie 3");
            System.out.println(" [ 4 ] Zadanie 4");
            System.out.println(" [ 0 ] Wyjscie");
            System.out.print("Wybierz > ");
            wybor = scanner.nextInt();

            switch(wybor){
                case 1: Zad_1();
                    break;
                case 2: Zad_2();
                    break;
                case 3: Zad_3();
                    break;
                case 4: Zad_4();
                    break;
                case 5: Zad_5();
                    break;
                case 0: break;
            }
        } while(wybor!=0);
    }

}
