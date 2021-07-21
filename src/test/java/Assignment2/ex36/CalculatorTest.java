package Assignment2.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void average_returns_average() {
        //Given
        Calculator calc = new Calculator();
        ArrayList<Double> input = new ArrayList<>();

        //When
        for (int i = 0; i < 5; i++) {
            input.add((double) i);
        }
        double actual = calc.average(input);
        double expected = (0+1+2+3+4.0)/5.0;

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void min_returns_minimum_case1() {
        //Given
        Calculator calc = new Calculator();
        ArrayList<Double> input = new ArrayList<>();

        //When
        for (int i = 20; i > 0; i-=2) {
            input.add((double) i);
        }
        double actual = calc.min(input);
        double expected = 2;

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void min_returns_minimum_case2() {
        //Given
        Calculator calc = new Calculator();
        ArrayList<Double> input = new ArrayList<>();

        //When
        for (int i = 0; i < 10; i++) {
            input.add((double) i);
        }
        double actual = calc.min(input);
        double expected = 0;

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void max_returns_maximum_case1() {
        //Given
        Calculator calc = new Calculator();
        ArrayList<Double> input = new ArrayList<>();

        //When
        for (int i = 20; i > 0; i-=2) {
            input.add((double) i);
        }
        double actual = calc.max(input);
        double expected = 20;

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void max_returns_maximum_case2() {
        //Given
        Calculator calc = new Calculator();
        ArrayList<Double> input = new ArrayList<>();

        //When
        for (int i = 0; i < 10; i++) {
            input.add((double) i);
        }
        double actual = calc.max(input);
        double expected = 9;

        //Then
        assertEquals(expected, actual);
    }

    @Test
    void std() {
        //Given
        Calculator calc = new Calculator();
        ArrayList<Double> input = new ArrayList<>();

        //When
        input.add(100.0);
        input.add(200.0);
        input.add(1000.0);
        input.add(300.0);
        double actual = calc.std(input);
        double expected = 353.55;

        //Then
        assertEquals(expected, actual);
    }
}