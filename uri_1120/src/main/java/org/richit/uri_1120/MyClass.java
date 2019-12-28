package org.richit.uri_1120;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.io.FileReader;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanf = new Scanner( System.in );
        int testValue = scanf.nextInt();
        String number = scanf.next();
        System.out.println(number.contains( String.valueOf( testValue ) ));
        System.out.println(number.replace( String.valueOf( testValue ), "0" ));
    }
}
