package by.kursy.vikvik.javalessons.lesson12.task01.model;

public class Manager {
    public static final int MARK_COUNT = 5;

    public static double calcAvgMark(int m1, int m2, int m3, int m4, int m5) {
        double sum = m1 + m2 + m3 + m4 + m5;
        return sum / MARK_COUNT;
    }
}
