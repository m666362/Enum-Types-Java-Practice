package org.richit.enum_types_lib;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.util.Calendar;

public class MyClass {
    static String dot = "----------------";
    private static void startProgramme() {
        String start = "Programme started";
        System.out.println();
        System.out.println(dot+start+dot);
        System.out.println();
    }
    public static void endProgramme(){

        String end = "Programme ended";
        System.out.println();
        System.out.println(dot+end+dot);
        System.out.println();
    }

    public static void main(String[] args) {
        startProgramme();

        switchCase();
        enim();

        endProgramme();
    }

    private static void enim() {
        Animal animal = Animal.CAT;
        switch (animal) {
            case DOG:
                System.out.println("dog");
                break;
            case CAT:
                System.out.println("cat");
                break;
            case MOUSE:
                System.out.println("mouse");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }

    private static void switchCase() {

        final int DOG = 0;
        final int CAT = 1;
        final int MOUSE = 2;
        int animal = MOUSE;
        switch (animal){
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
