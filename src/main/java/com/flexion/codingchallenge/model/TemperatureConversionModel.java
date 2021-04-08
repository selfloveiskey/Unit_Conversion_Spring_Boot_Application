package com.flexion.codingchallenge.model;

import com.flexion.codingchallenge.unitsofmeasure.UnitsOfMeasure.Units;
import org.apache.commons.math3.util.Precision;
/*
|------------------------------------------------------------------
| Temperature conversion calculations rounding to N decimal places
|------------------------------------------------------------------
*/
public class TemperatureConversionModel {

    double C;
    double F;
    double K;
    double R;
    int roundScale = 1;

    public double toCelsius(String convertFrom, double degree){

        try {
            if(convertFrom.equals(Units.FAHRENHEIT.toString())){
                F = degree;
                C = (F - 32) * 5/9;
            }
            else if(convertFrom.equals(Units.KELVIN.toString())){
                K = degree;
                C = (K - 273.15);
            }
            else if(convertFrom.equals(Units.RANKINE.toString())){
                R = degree;
                C = (R - 491.67) * 5/9;
            }
        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(C,roundScale);
    }

    public double toKelvin(String convertFrom, double degree){

        try {
            if(convertFrom.equals(Units.CELSIUS.toString())) {
                C = degree;
                K = C + 273.15;
            }
            else if(convertFrom.equals(Units.FAHRENHEIT.toString())){
                F = degree;
                K = (F - 32) * 5/9 + 273.15;
            }
            else if(convertFrom.equals(Units.RANKINE.toString())){
                R = degree;
                K = R * 5/9;
            }
        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(K,roundScale);
    }

    public double toFahrenheit(String convertFrom, double degree){

        try {
            if(convertFrom.equals(Units.CELSIUS.toString())) {
                C = degree;
                F = (C * 9/5) +32;
            }
            else if(convertFrom.equals(Units.KELVIN.toString())){
                K = degree;
                F = (K - 273.15) * 9/5 + 32;
            }
            else if(convertFrom.equals(Units.RANKINE.toString())){
                R = degree;
                F = R - 459.67;
            }
        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(F,roundScale);
    }

    public double toRankine(String convertFrom, double degree){

        try {
            if(convertFrom.equals(Units.CELSIUS.toString())) {
                C = degree;
                R = C * 9/5 + 491.67;
            }
            else if(convertFrom.equals(Units.FAHRENHEIT.toString())){
                F = degree;
                R = F + 459.67;
            }
            if(convertFrom.equals(Units.KELVIN.toString())){
                K = degree;
                R = K * 1.8;
            }
        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(R,roundScale);
    }
}