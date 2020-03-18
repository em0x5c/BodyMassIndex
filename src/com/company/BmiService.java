package com.company;

public class BmiService {
    /**
     * Метод возвращает индекс массы тела.
     * Расчет выполняется по следующей формуле: ИМТ = вес/(рост^2).
     *
     * @param height Рост в метрах.
     * @param weight Вес в килограммах.
     * @return Индекс массы тела.
     */
    public double calculate(double height, int weight) {
        double index = weight / (height * height);
        return Math.rint(index * 100) / 100;
    }
}
