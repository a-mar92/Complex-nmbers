package com;

class Complex {
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    private double real;
    double img;

    Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    void show() {
        System.out.println("real = " + real + " img =" + img);
    }

    public Complex add(Complex z) {
        return new Complex(real + z.real, img + z.img);

    }
}



