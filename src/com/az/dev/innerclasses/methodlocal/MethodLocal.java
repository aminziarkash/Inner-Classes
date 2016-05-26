package com.az.dev.innerclasses.methodlocal;

import com.az.dev.innerclasses.App;

/**
 * Created by aziarkash on 26-5-2016.
 */
public class MethodLocal {

    private static String outerString = "Outer String Variable";

    public static void methodLocalInnerClasses() {
        App app = new App();
        app.objectiveString = "Method Local Inner Classes";
        System.out.println("\033[1m" + app.objectiveString + "\033[0m");
        app.addSub(app.objectiveString);

        String inMethodString = "Local String variable";
        int i = 23;
        class InMethodClass {
            public void seeOuter() {
                System.out.println("Outer x is\t\t\t\t:\t" + outerString);
                System.out.println("Local String variable\t:\t" + inMethodString);
            }
        }
        InMethodClass inMethodClass = new InMethodClass(); // MUST BE AFTER CLASS DECLARATION!!
        inMethodClass.seeOuter();

        app.addSeparator();
    }

}
