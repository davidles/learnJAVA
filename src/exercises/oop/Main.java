package exercises.oop;

import exercises.oop.Clases.SmartDevice;
import exercises.oop.Subclase.SmartPhone;
import exercises.oop.Subclase.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone tcl = new SmartPhone("TCL", "T90", 300.00,"red", "3GB", "32Mb", false,"32px",
                "16px", false);


        System.out.println(tcl);

        SmartWatch Saphire = new SmartWatch("Samsung","Saphire", 81000.00, "white", "1.4", 14, true, true, true,
                true);

        System.out.println("SmartWatch: " + Saphire);



    }
}
