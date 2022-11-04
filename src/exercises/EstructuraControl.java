/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
 */

package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EstructuraControl {

    public static void main(String[] args) {
//        createString();
        createStringWhile();

    }

    private static void createString() {

        String[] nombres = {"Juan", "Mario", "Roberto", "Sam"};
        String textList ="";

        for(String nombre : nombres){
            textList += nombre + " ";
        }
        System.out.println(textList);

    }

    /*
    private static void createStringWhile() {

        String textList ="";
        String esc = "esc";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra - *esc para finallizar");

        int input = sc.nextInt();


        while(input != 10){

            System.out.println("Ingrese una palabra - *esc para finallizar");

            input = sc.nextInt();
        }


    }

     */


}
