package org.richit.enum_types_lib;

public class MyClass {
    static String dot = "----------------";
    private static void startProgramme() {
        String start = "Programme started";
        System.out.println("");
        System.out.println(dot+start+dot);
        System.out.println("");
    }
    public static void endProgramme(){

        String end = "Programme ended";
        System.out.println("");
        System.out.println(dot+end+dot);
        System.out.println();
    }

    public static void main(String[] args) {
        startProgramme();

        switchCase();
        endProgramme();
    }

    private static void switchCase() {

        final int DOG = 0;
        final int CAT = 1;
        final int MOUSE = 2;
        int animal = 2;
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
        }
    }
}
