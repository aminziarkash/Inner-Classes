package com.az.dev.innerclasses.anonymous;

import com.az.dev.innerclasses.App;

/**
 * Created by aziarkash on 26-5-2016.
 */
public class AnonymousInner {

    public static void argumentDefinedAnonymousInnerClasses() {
        App app = new App();
        app.objectiveString = "Argument Defined Anonymous Inner Classes";
        System.out.println("\033[1m" + app.objectiveString + "\033[0m");
        app.addSub(app.objectiveString);

        Animal animal = new Animal();
        animal.doStuff(new LivingThing() {
            @Override
            public void move() {
                System.out.println("Moving from Argument-Defined Anonymous Inner interface");
            }
        });

        app.addSeparator();
    }

    public static void anonymousInnerClasses() {
        App app = new App();
        app.objectiveString = "Anonymous Inner Classes";
        System.out.println("\033[1m" + app.objectiveString + "\033[0m");
        app.addSub(app.objectiveString);

        App newApp = new App() { // Polymorphism happening here (Anonymous inner class 'new App(){};' is the subclass of App)
            private void showApp() {
                System.out.println("Anonymous App");
            }

            @Override
            public void methodForAnonymousInnerClass() { // // The whole point of making an Anonymous inner class is to override superclass methods
                System.out.println("Message from overridden method of the anonymous inner class");
            }
        };
        newApp.methodForAnonymousInnerClass();

        app.addSeparator();
    }
}

// Anonymous flavour 2
interface Cookable {

    void cook();

    class Food {
        Cookable c = new Cookable() {
            @Override
            public void cook() {
                System.out.println("Anonymous cookable implementer");
            }
        };
    }
}

// Argument-defined Anonymous Inner Classes
interface LivingThing {

    void move();

}

class Animal {

    void doStuff(LivingThing livingThing) {
        System.out.println("Doing stuff from Animal");
        livingThing.move();
    }
}
