package com.az.dev.innerclasses.regular;

import com.az.dev.innerclasses.App;

/**
 * Created by aziarkash on 25-5-2016.
 */
public class MyOuter {

    private int x = 7;

    public static void regularInnerClasses() {
        App app = new App();
        app.objectiveString = "Regular Inner Class";
        System.out.println("\033[1m" + app.objectiveString + "\033[0m");
        app.addSub(app.objectiveString);

        MyOuter outer = new MyOuter();
        MyOuter.MyInner inner = outer.new MyInner();
        // MyOuter.MyInner inner = new MyOuter().new MyInner(); // can also be used
        inner.seeOuter();

        app.addSeparator();
    }

    // inner class definition
    class MyInner { // can be also static and/or private like any other class fields
        public void seeOuter() {
            System.out.println("Outer x is\t\t\t:\t" + x); // accessing private member 'x' of the outer class
            System.out.println("Inner class ref is\t:\t" + this);
            System.out.println("Outer class ref is\t:\t" + MyOuter.this);
        }
    } // close inner class definition
} // close outer class
