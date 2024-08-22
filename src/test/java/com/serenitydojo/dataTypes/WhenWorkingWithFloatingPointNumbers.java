package com.serenitydojo.dataTypes;

import org.junit.Test;

public class WhenWorkingWithFloatingPointNumbers {
    @Test
    public void convertingNumbersToFarenheit() {
        Double celciusValue = 33D;
        Double farenheit = celciusValue * 1.8 + 32;

        System.out.println("The degrees in farenheit is " + farenheit);

    }
    @Test
    public void convertingKilogramsToPounds(){
        Double Kilograms = 78D;
        Double Pounds = Kilograms * 2.20462D;

        System.out.println("The kilograms converted to pounds is " + Pounds + " pounds");
    }
}
