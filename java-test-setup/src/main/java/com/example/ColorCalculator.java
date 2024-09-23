package com.example;

public class ColorCalculator {
    public String findRhyme(int num) {
        if (num == 0) {
            return "Yellow";
        }
        if (num == 1) {
            return "Sun";
        }
        if (num == 2) {
            return "Blue";
        }
        if (num == 3) {
            return "Green";
        }
        return "Could not find a rhyme";
    }
}
