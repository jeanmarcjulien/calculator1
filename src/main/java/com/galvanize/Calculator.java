package com.galvanize;

public class Calculator {

    private int value=0;

    public int getValue() {
        return value;
    }

    public int addInputs(int... numbers) {

        int sum =0;

        for(int i =0;i<numbers.length;i++){
            sum +=numbers[i];
        }
        value=sum;
        return value;
    }

    public int multiplyInputs(int... numbers) {

        int product =1;

        for(int i =0;i<numbers.length;i++){
            product *=numbers[i];
        }
        value=product;
        return value;
    }
}
