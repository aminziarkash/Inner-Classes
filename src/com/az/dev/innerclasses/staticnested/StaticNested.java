package com.az.dev.innerclasses.staticnested;

import com.az.dev.innerclasses.App;

/**
 * Created by aziarkash on 26-5-2016.
 */
public class StaticNested {

    public static void staticNestedClasses() {
        App app = new App();
        app.objectiveString = "Static Nested Classes";
        System.out.println("\033[1m" + app.objectiveString + "\033[0m");
        app.addSub(app.objectiveString);

        StaticNestedOuter.StaticNested nest = new StaticNestedOuter.StaticNested(); // new Outer.new Inner in normal inner classes
        nest.go();

        app.addSeparator();
    }
}

// Static nested classes
class StaticNestedOuter {

    static int i = 187;

    static class StaticNested {
        void go() {
            System.out.println("int 'i' from static nested class\t:\t" + i);
        }
    }
}
