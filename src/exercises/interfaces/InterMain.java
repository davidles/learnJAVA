package exercises.interfaces;

import java.util.List;

public class InterMain {

    public static void main(String[] args) {

        CocheCRUD sedan = new CocheCRUDImpl();

        CocheCRUD sport = new CocheCRUDImpl();

        sedan.save("Logan");
        sedan.save("Kwid");

        List autos = sedan.findAll();

        System.out.println(autos);

        List autoDelete = sedan.delete("Logan");

        System.out.println(autos);

    }
}
