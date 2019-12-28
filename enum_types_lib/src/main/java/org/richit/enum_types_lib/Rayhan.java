package org.richit.enum_types_lib;

public enum Rayhan {
    ENGINEER("EEE"), DECENT("Thinking"), CURLYHAIR("Almost Brown");
    private String name;

    //This actually works like InnerClass of Class
    //where ENGINEER/DECENT/CURLYHAIR = InnerClass
    //and Rayhan = Class
    Rayhan(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "This form is " + name;
    }

    public String judge(){
        return "Dont judge to much ";
    }
}
