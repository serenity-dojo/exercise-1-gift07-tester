package com.serenitydojo.dataTypes;

import org.junit.Test;

public class WhenWorkingWithStrings {
    @Test
    public void whenWorkingWithStrings (){

        String name = "    Gift-Motha    ";
        String convertstring = name.toLowerCase();
        System.out.println(convertstring);

        convertstring = name.toUpperCase();
        System.out.println(convertstring);

        convertstring = name.replace("Gift","Sphiwe");
        System.out.println(convertstring.trim());

        System.out.println(convertstring.length());



    }
}
