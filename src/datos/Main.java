/*
Para este primer ejercicio tendréis que realizar lo siguiente:

Crea un proyecto de Java desde 0

Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.

Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */

package datos;

public class Main {
    public static void main(String[] args) {

        int entero = 30;
        long enteroLogn = 100;
        double doubleNum = 31.21d;
        float floatNum = 25.3f;
        boolean boolenTrue = true;
        boolean boolenFalse = false;
        String text = "Primera entrega";

        System.out.println("***************** Datos primitivos *****************");
        System.out.println(entero);
        System.out.println(enteroLogn);
        System.out.println(doubleNum);
        System.out.println(boolenTrue);
        System.out.println(text);
        System.out.println(floatNum);
        System.out.println(boolenFalse);

    }
}
