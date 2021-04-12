package com.flexion.codingchallenge.model;

import com.flexion.codingchallenge.unitsofmeasure.UnitsOfMeasure;
import org.apache.commons.math3.util.Precision;
/*
|------------------------------------------------------------------
| Volume conversion calculations rounding to N decimal places
|------------------------------------------------------------------
*/
public class VolumeConversionModel {

    double Cubic_Feet,
            Cubic_Inches,
            Cups,
            Gallons,
            Liters,
            Tablespoons;
    int roundScale = 1;

    public double toCubicFeet(String convertFrom, double degree){

        try {
            if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_INCHES.toString())){
                Cubic_Inches = degree;
                Cubic_Feet = Cubic_Inches / 1728;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUPS.toString())){
                Cups = degree;
                Cubic_Feet = Cups / 119.688379;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.GALLONS.toString())){
                Gallons = degree;
                Cubic_Feet = Gallons / 7.481;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.LITERS.toString())){
                Liters = degree;
                Cubic_Feet = Liters / 28.317;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.TABLESPOONS.toString())){
                Tablespoons = degree;
                Cubic_Feet = Tablespoons * 0.000522189670;
            }

        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(Cubic_Feet,roundScale);
    }

    public double toCubicInches(String convertFrom, double degree){

        try {
            if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_FEET.toString())){
                Cubic_Feet = degree;
                Cubic_Inches = Cubic_Feet * 1728;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUPS.toString())){
                Cups = degree;
                Cubic_Inches = Cups * 14.4375;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.GALLONS.toString())){
                Gallons = degree;
                Cubic_Inches = Gallons * 231;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.LITERS.toString())){
                Liters = degree;
                Cubic_Inches = Liters * 61.0237;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.TABLESPOONS.toString())){
                Tablespoons = degree;
                Cubic_Inches = Tablespoons / 1.108224;
            }

        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(Cubic_Inches,roundScale);
    }

    public double toCups(String convertFrom, double degree){

        try {
            if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_FEET.toString())){
                Cubic_Feet = degree;
                Cups = Cubic_Feet * 119.688312;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_INCHES.toString())){
                Cubic_Inches = degree;
                Cups = Cubic_Inches / 14.438;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.GALLONS.toString())){
                Gallons = degree;
                Cups = Gallons * 16;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.LITERS.toString())){
                Liters = degree;
                Cups = Liters * 4.22675;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.TABLESPOONS.toString())){
                Tablespoons = degree;
                Cups = Tablespoons / 16;
            }

        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(Cups,roundScale);
    }

    public double toGallons(String convertFrom, double degree){

        try {
            if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_FEET.toString())){
                Cubic_Feet = degree;
                Gallons = Cubic_Feet * 7.480519;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_INCHES.toString())){
                Cubic_Inches = degree;
                Gallons = Cubic_Inches / 231;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUPS.toString())){
                Cups = degree;
                Gallons = Cups / 16;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.LITERS.toString())){
                Liters = degree;
                Gallons = Liters / 3.785;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.TABLESPOONS.toString())){
                Tablespoons = degree;
                Gallons = Tablespoons / 256;
            }

        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(Gallons,roundScale);
    }

    public double toLiters(String convertFrom, double degree){

        try {
            if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_FEET.toString())){
                Cubic_Feet = degree;
                Liters = Cubic_Feet * 28.316847;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_INCHES.toString())){
                Cubic_Inches = degree;
                Liters = Cubic_Inches / 61.024;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUPS.toString())){
                Cups = degree;
                Liters = Cups / 4.227;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.GALLONS.toString())){
                Gallons = degree;
                Liters = Gallons * 3.785412;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.TABLESPOONS.toString())){
                Tablespoons = degree;
                Liters = Tablespoons / 67.628;
            }

        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(Liters,roundScale);
    }

    public double toTablespoons(String convertFrom, double degree){

        try {
            if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_FEET.toString())){
                Cubic_Feet = degree;
                Tablespoons = Cubic_Feet * 1915.012987;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUBIC_INCHES.toString())){
                Cubic_Inches = degree;
                Tablespoons = Cubic_Inches * 1.108225;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.CUPS.toString())){
                Cups = degree;
                Tablespoons = Cups * 16;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.GALLONS.toString())){
                Gallons = degree;
                Tablespoons = Gallons * 256;
            }
            else if(convertFrom.equals(UnitsOfMeasure.Units.LITERS.toString())){
                Liters = degree;
                Tablespoons = Liters * 67.628045;
            }

        }
        catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return Precision.round(Tablespoons,roundScale);
    }
}