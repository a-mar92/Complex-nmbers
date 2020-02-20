package com;

public class Main {

    public static void main(String[] args) {
        Complex z1 = new Complex(3.9, -5.8);
        Complex z2 = new Complex(-3.9, 5.8);
        Complex z4 = new Complex(-0.9, 5.8);


        z1.show();
        z1.show();

        System.out.println(z1.getReal());

        Complex suma = z1.add(z2);
    }
}
