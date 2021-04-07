package com.flexion.codingchallenge.unitsofmeasure;

import java.util.EnumMap;

public class UnitsOfMeasure {

   public enum Units implements Labeled{
        KELVIN("Kelvin"),
        CELSIUS("Celsius"),
        FAHRENHEIT("Fahrenheit"),
        RANKINE("Rankine"),
        LITERS("Liters"),
        TABLESPOONS("Tablespoons"),
        CUBIC_INCHES("Cubic-Inches"),
        CUPS("Cups"),
        CUBIC_FEET("Cubic-Feet"),
        GALLONS("Gallons");

        /*
         * Caching the Lookup Values
         * --------------------------
         * Avoid iterating the enum values by using a Map to cache the labels.
         */
        private static final EnumMap<Units, String> unitsMap = new EnumMap(Units.class);

       /* populate the unitsMap cache */
       static {
           for (Units unit: values()) {
               unitsMap.put(unit, unit.label);
           }
       }

       /* a final variable to store the label, which can't be changed */
       public final String label;

       /**
        * A private constructor that sets the label.
        * @param label
        */
       Units(String label){
           this.label = label;
       }

       /**
        * Look up Units instances by the label field. This implementation finds the
        * label in the unitsMap cache.
        * @param label - The label to look up
        * @return - The Units instance with the label, or null if not found.
        */
       public static String valueOfLabel(String label) {
           return unitsMap.get(label);
       }

       @Override
       public String label() {
           return label;
       }

       /**
        * Override the toString() method to return the label instead of the declared name.
        * @return
        */
       @Override
       public String toString() {
           return this.label;
       }
   }
}