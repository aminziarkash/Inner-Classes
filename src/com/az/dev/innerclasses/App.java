package com.az.dev.innerclasses;

import com.az.dev.innerclasses.anonymous.AnonymousInner;
import com.az.dev.innerclasses.methodlocal.MethodLocal;
import com.az.dev.innerclasses.regular.MyOuter;
import com.az.dev.innerclasses.staticnested.StaticNested;

/**
 * Created by aziarkash on 24-5-2016.
 */
public class App {

    public String objectiveString;

    public static void main(String[] args) {

        // regular
        MyOuter.regularInnerClasses();

        // methodLocal
        MethodLocal.methodLocalInnerClasses();

        // anonymous;
        AnonymousInner.anonymousInnerClasses();

        // argument-defined anonymous
        AnonymousInner.argumentDefinedAnonymousInnerClasses();

        // top-level and nested classes (not inner classes)
        StaticNested.staticNestedClasses();

    }

    public void methodForAnonymousInnerClass() {
        System.out.println("Method For Anonymous Inner Class from Outer class");
    }

    public void addSub(String objectiveString) {
        for (int i = 0; i < objectiveString.length(); i++) {
            System.out.print("-");
        }
        System.out.println("\n");
    }

    public void addSeparator() {
        System.out.println("\n\033[1m**************************************************************************************************************\033[0m");
    }
}
