package org.richit.enum_types_lib;

import javax.jws.soap.SOAPBinding;

public class MyClass {
    static String dot = "----------------";

    private static void headingProgram(String heading) {
        System.out.println();
        System.out.println(dot+heading+dot);
        System.out.println();
    }

    public static void main(String[] args) {
        headingProgram("Start Programme");

        switchCase();
        enim();
        randomTest();
        advanceTest();

        headingProgram("End Programme");
    }

    private static void advanceTest() {
        headingProgram( "Advance Test" );
        Rayhan rayhan = Rayhan.DECENT;
        System.out.println(rayhan);
        System.out.println(Rayhan.ENGINEER.getName() + "\t" + Rayhan.DECENT.getName());
        System.out.println(Rayhan.ENGINEER);
    }

    private static void randomTest() {
        headingProgram( "randomTest" );
        System.out.println(Animal.CAT);
        System.out.println(Animal.CAT.getClass());
        System.out.println(Animal.CAT instanceof Animal);
        System.out.println(Animal.CAT instanceof Enum);
    }

    private static void enim() {
        headingProgram( "Enum" );
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

        headingProgram( "SwitchCase" );
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
