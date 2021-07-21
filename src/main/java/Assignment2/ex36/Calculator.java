package Assignment2.ex36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, Double> calculations = new HashMap<>();

    public Map<String, Double> getCalculations() {
        return calculations;
    }

    public double average(ArrayList<Double> input){
        double avg = 0;
        for (int i = 0; i < input.size(); i++) {
            avg += input.get(i);
        }
        avg = avg/input.size();
        avg = Math.round(avg*100)/100.0;
        calculations.put("avg", avg);
        return avg;
    }

    public double min(ArrayList<Double> input){
        double min = input.get(0);
        for (int i = 0; i < input.size(); i++) {
            if (min > input.get(i)){
                min = input.get(i);
            }
        }
        calculations.put("min", min);
        return min;
    }

    public double max(ArrayList<Double> input){
        double max = input.get(0);
        for (int i = 0; i < input.size(); i++) {
            if (max < input.get(i)){
                max = input.get(i);
            }
        }
        calculations.put("max", max);
        return max;
    }

    public double std(ArrayList<Double> input){
        double std = 0;
        double avg = average(input);
        for (int i = 0; i < input.size(); i++) {
            std += Math.pow(Math.abs((input.get(i)-avg)), 2.0);
        }
        std = Math.sqrt(std/input.size());
        std = Math.round(std*100)/100.0;
        calculations.put("std", std);
        return std;
    }

    public void calculate(ArrayList<Double> input){
        average(input);
        min(input);
        max(input);
        std(input);
    }
}
