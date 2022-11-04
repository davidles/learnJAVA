/*
Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */

package exercises;

public class Funciones {

    public static void main(String[] args) {

        double totalPrice = getPrice(21);

        System.out.println(totalPrice);
    }

    private static double getPrice(double price) {
        return price * 1.21;
    }

}
