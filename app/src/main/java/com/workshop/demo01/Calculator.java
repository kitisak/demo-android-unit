package com.workshop.demo01;

class Calculator {
    public int add(int first, int second) {
        return first + second;
    }

    public int minus(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        if( second == 0 ) {
            throw new MyException();
        }
        return first / second;
    }
}
