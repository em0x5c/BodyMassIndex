package com.company;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.72;
        int weight = 55;
        double result = service.calculate(height, weight);
        System.out.println("Индекс массы тела для роста " + height + " м. и веса " + weight + " кг. = "  + result);
    }
}
