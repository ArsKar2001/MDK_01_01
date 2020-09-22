package algorithms;

import java.util.Random;

public class RandomTriangle {

    private int a;
    private int b;
    private int c;
    private int id;

    public RandomTriangle(int id) {
        this.id = id;
        Random random = new Random();
        do {
            this.a = random.nextInt(10) + 1;
            this.b = random.nextInt(10) + 1;
            this.c = random.nextInt(10) + 1;
        } while (a + b <= c || a > c || b > c);
    }
    public double getArea() {
        return Math.sqrt(semiPerimeter() * (semiPerimeter() - a) * (semiPerimeter() - b) * (semiPerimeter() - c));
    }
    private double semiPerimeter() {
        return (a + b + c) >> 1;
    }
    public int getPerimeter() {
        return a + b + c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getId() {
        return id;
    }
}
