package LanguageBasics;

import OOPConcept.Bicycle;
import OOPConcept.Motor;

public class InstanceOf {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Motor nonBicycle = new Motor();

        if (nonBicycle instanceof Bicycle){
            System.out.printf("OK");
        }

    }
}
