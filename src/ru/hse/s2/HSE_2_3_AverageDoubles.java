package ru.hse.s2;

public class HSE_2_3_AverageDoubles {
    public static void main(String[] args) {
        double[] numbers = {
                Double.MAX_VALUE - 1,
                - Double.MAX_VALUE + 1
        };
        System.out.println((numbers[0] + numbers[1]) / 2);
        if (0.0 != (numbers[0] + numbers[1]) / 2) throw new AssertionError();
    }
}
