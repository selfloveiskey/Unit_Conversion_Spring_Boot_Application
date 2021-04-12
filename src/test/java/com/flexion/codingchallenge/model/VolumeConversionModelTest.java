package com.flexion.codingchallenge.model;

import com.flexion.codingchallenge.unitsofmeasure.UnitsOfMeasure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeConversionModelTest {

    VolumeConversionModel volumeConversionModel = new VolumeConversionModel();

    double Cubic_Feet,
            Cubic_Inches,
            Cups,
            Gallons,
            Liters,
            Tablespoons,
            expectedResult,
            positiveDegree = 16,
            negativeDegree = -3;

    // convert to Cubic-Feet test cases
    @Test
    void testCubicFeetConversionFromCubicInchesUsingPositiveNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.CUBIC_INCHES.label, positiveDegree);
        expectedResult = 0.0;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromCupsUsingPositiveNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.CUPS.label, positiveDegree);
        expectedResult = 0.1;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromGallonsUsingPositiveNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.GALLONS.label, positiveDegree);
        expectedResult = 2.1;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromLitersUsingPositiveNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.LITERS.label, positiveDegree);
        expectedResult = 0.6;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromTablespoonsUsingPositiveNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.TABLESPOONS.label, positiveDegree);
        expectedResult = 0.0;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromCubicInchesUsingNegativeNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.CUBIC_INCHES.label, negativeDegree);
        expectedResult = -0.0;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromCupsUsingNegativeNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.CUPS.label, negativeDegree);
        expectedResult = -0.0;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromGallonsUsingNegativeNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.GALLONS.label, negativeDegree);
        expectedResult = -0.4;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromLitersUsingNegativeNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.LITERS.label, negativeDegree);
        expectedResult = -0.1;
        assertEquals(expectedResult, Cubic_Feet);
    }

    @Test
    void testCubicFeetConversionFromTablespoonsUsingNegativeNumber() {

        Cubic_Feet = volumeConversionModel.toCubicFeet(UnitsOfMeasure.Units.TABLESPOONS.label, negativeDegree);
        expectedResult = -0.0;
        assertEquals(expectedResult, Cubic_Feet);
    }

    // convert to Cubic-Inches test cases
    @Test
    void testCubicInchesConversionFromCubicFeetUsingPositiveNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.CUBIC_FEET.label, positiveDegree);
        expectedResult = 27648;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromCupsUsingPositiveNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.CUPS.label, positiveDegree);
        expectedResult = 231;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromGallonsUsingPositiveNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.GALLONS.label, positiveDegree);
        expectedResult = 3696;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromLitersUsingPositiveNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.LITERS.label, positiveDegree);
        expectedResult = 976.4;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromTablespoonsUsingPositiveNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.TABLESPOONS.label, positiveDegree);
        expectedResult = 14.4;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromCubicFeetUsingNegativeNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.CUBIC_FEET.label, negativeDegree);
        expectedResult = -5184;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromCupsUsingNegativeNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.CUPS.label, negativeDegree);
        expectedResult = -43.3;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromGallonsUsingNegativeNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.GALLONS.label, negativeDegree);
        expectedResult = -693;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromLitersUsingNegativeNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.LITERS.label, negativeDegree);
        expectedResult = -183.1;
        assertEquals(expectedResult, Cubic_Inches);
    }

    @Test
    void testCubicInchesConversionFromTablespoonsUsingNegativeNumber() {

        Cubic_Inches = volumeConversionModel.toCubicInches(UnitsOfMeasure.Units.GALLONS.label, negativeDegree);
        expectedResult = -693;
        assertEquals(expectedResult, Cubic_Inches);
    }

    // convert to Cups test cases
    @Test
    void testCupsConversionFromCubicFeetUsingPositiveNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.CUBIC_FEET.label, positiveDegree);
        expectedResult = 1915.0;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromCubicInchesUsingPositiveNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.CUBIC_INCHES.label, positiveDegree);
        expectedResult = 1.1;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromGallonsUsingPositiveNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.GALLONS.label, positiveDegree);
        expectedResult = 256;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromLitersUsingPositiveNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.LITERS.label, positiveDegree);
        expectedResult = 67.6;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromTablespoonsUsingPositiveNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.TABLESPOONS.label, positiveDegree);
        expectedResult = 1;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromCubicFeetUsingNegativeNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.CUBIC_FEET.label, negativeDegree);
        expectedResult = -359.1;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromCubicInchesUsingNegativeNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.CUBIC_INCHES.label, negativeDegree);
        expectedResult = -0.2;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromGallonsUsingNegativeNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.GALLONS.label, negativeDegree);
        expectedResult = -48;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromLitersUsingNegativeNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.LITERS.label, negativeDegree);
        expectedResult = -12.7;
        assertEquals(expectedResult, Cups);
    }

    @Test
    void testCupsConversionFromTablespoonsUsingNegativeNumber() {

        Cups = volumeConversionModel.toCups(UnitsOfMeasure.Units.TABLESPOONS.label, negativeDegree);
        expectedResult = -0.2;
        assertEquals(expectedResult, Cups);
    }

    // convert to Gallons test cases
    @Test
    void testGallonsConversionFromCubicFeetUsingPositiveNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.CUBIC_FEET.label, positiveDegree);
        expectedResult = 119.7;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromCubicInchesUsingPositiveNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.CUBIC_INCHES.label, positiveDegree);
        expectedResult = 0.1;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromCupsUsingPositiveNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.CUPS.label, positiveDegree);
        expectedResult = 1;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromLitersUsingPositiveNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.LITERS.label, positiveDegree);
        expectedResult = 4.2;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromTablespoonsUsingPositiveNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.TABLESPOONS.label, positiveDegree);
        expectedResult = 0.1;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromCubicFeetUsingNegativeNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.CUBIC_FEET.label, negativeDegree);
        expectedResult = -22.4;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromCubicInchesUsingNegativeNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.CUBIC_INCHES.label, negativeDegree);
        expectedResult = -0.0;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromCupsUsingNegativeNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.CUPS.label, negativeDegree);
        expectedResult = -0.2;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromLitersUsingNegativeNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.LITERS.label, negativeDegree);
        expectedResult = -0.8;
        assertEquals(expectedResult, Gallons);
    }

    @Test
    void testGallonsConversionFromTablespoonsUsingNegativeNumber() {

        Gallons = volumeConversionModel.toGallons(UnitsOfMeasure.Units.TABLESPOONS.label, negativeDegree);
        expectedResult = -0.0;
        assertEquals(expectedResult, Gallons);
    }

    // convert to Liters test cases
    @Test
    void testLitersConversionFromCubicFeetUsingPositiveNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.CUBIC_FEET.label, positiveDegree);
        expectedResult = 453.1;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromCubicInchesUsingPositiveNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.CUBIC_INCHES.label, positiveDegree);
        expectedResult = 0.3;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromCupsUsingPositiveNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.CUPS.label, positiveDegree);
        expectedResult = 3.8;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromGallonsUsingPositiveNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.GALLONS.label, positiveDegree);
        expectedResult = 60.6;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromTablespoonsUsingPositiveNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.TABLESPOONS.label, positiveDegree);
        expectedResult = 0.2;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromCubicFeetUsingNegativeNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.CUBIC_FEET.label, negativeDegree);
        expectedResult = -85.;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromCubicInchesUsingNegativeNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.CUBIC_INCHES.label, negativeDegree);
        expectedResult = -0.0;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromCupsUsingNegativeNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.CUPS.label, negativeDegree);
        expectedResult = -0.7;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromGallonsUsingNegativeNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.GALLONS.label, negativeDegree);
        expectedResult = -11.4;
        assertEquals(expectedResult, Liters);
    }

    @Test
    void testLitersConversionFromTablespoonsUsingNegativeNumber() {

        Liters = volumeConversionModel.toLiters(UnitsOfMeasure.Units.TABLESPOONS.label, negativeDegree);
        expectedResult = -0.0;
        assertEquals(expectedResult, Liters);
    }

    // convert to Tablespoons test cases
    @Test
    void testTablespoonsConversionFromCubicFeetUsingPositiveNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.CUBIC_FEET.label, positiveDegree);
        expectedResult = 30640.2;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromCubicInchesUsingPositiveNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.CUBIC_INCHES.label, positiveDegree);
        expectedResult = 17.7;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromCupsUsingPositiveNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.CUPS.label, positiveDegree);
        expectedResult = 256;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromGallonsUsingPositiveNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.GALLONS.label, positiveDegree);
        expectedResult = 4096;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromLitersUsingPositiveNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.LITERS.label, positiveDegree);
        expectedResult = 1082.0;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromCubicFeetUsingNegativeNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.CUBIC_FEET.label, negativeDegree);
        expectedResult = -5745.0;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromCubicInchesUsingNegativeNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.CUBIC_INCHES.label, negativeDegree);
        expectedResult = -3.3;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromCupsUsingNegativeNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.CUPS.label, negativeDegree);
        expectedResult = -48;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromGallonsUsingNegativeNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.GALLONS.label, negativeDegree);
        expectedResult = -768;
        assertEquals(expectedResult, Tablespoons);
    }

    @Test
    void testTablespoonsConversionFromLitersUsingNegativeNumber() {

        Tablespoons = volumeConversionModel.toTablespoons(UnitsOfMeasure.Units.LITERS.label, negativeDegree);
        expectedResult = -202.9;
        assertEquals(expectedResult, Tablespoons);
    }
}