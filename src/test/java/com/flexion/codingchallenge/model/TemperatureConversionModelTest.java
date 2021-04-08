package com.flexion.codingchallenge.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionModelTest {

    TemperatureConversionModel temperatureConversionModel = new TemperatureConversionModel();
    double C;
    double F;
    double K;
    double R;
    double expectedResult;
    double positiveDegree = 64;
    double negativeDegree = -77;

    // convert to celsius test cases
    @Test
    void testCelsiusConversionFromFahrenheitUsingPositiveNumber(){
        C = temperatureConversionModel.toCelsius("Fahrenheit", positiveDegree);
        expectedResult = 17.8;
        assertEquals(expectedResult, C);
    }

    @Test
    void testCelsiusConversionFromKelvinUsingPositiveNumber(){

        C = temperatureConversionModel.toCelsius("Kelvin", positiveDegree);
        expectedResult = -209.1;
        assertEquals(expectedResult, C);
    }

    @Test
    void testCelsiusConversionFromRankineUsingPositiveNumber(){

        C = temperatureConversionModel.toCelsius("Rankine", positiveDegree);
        expectedResult = -237.6;
        assertEquals(expectedResult, C);
    }

    @Test
    void testCelsiusConversionFromFahrenheitUsingNegativeNumber(){

        C = temperatureConversionModel.toCelsius("Fahrenheit", negativeDegree);
        expectedResult = -60.6;
        assertEquals(expectedResult, C);
    }

    @Test
    void testCelsiusConversionFromKelvinUsingNegativeNumber(){
        C = temperatureConversionModel.toCelsius("Kelvin", negativeDegree);
        expectedResult = -350.2;
        assertEquals(expectedResult, C);
    }

    @Test
    void testCelsiusConversionFromRankineUsingNegativeNumber(){
        C = temperatureConversionModel.toCelsius("Rankine", negativeDegree);
        expectedResult = -315.9;
        assertEquals(expectedResult, C);
    }

    // convert to fahrenheit test cases
    @Test
    void testFahrenheitConversionFromCelsiusUsingPositiveNumber(){

        F = temperatureConversionModel.toFahrenheit("Celsius", positiveDegree);
        expectedResult = 147.2;
        assertEquals(expectedResult, F);
    }

    @Test
    void testFahrenheitConversionFromKelvinUsingPositiveNumber(){

        F = temperatureConversionModel.toFahrenheit("Kelvin", positiveDegree);
        expectedResult = -344.5;
        assertEquals(expectedResult, F);
    }

    @Test
    void testFahrenheitConversionFromRankineUsingPositiveNumber(){

        F = temperatureConversionModel.toFahrenheit("Rankine", positiveDegree);
        expectedResult = -395.7;
        assertEquals(expectedResult, F);
    }

    @Test
    void testFahrenheitConversionFromCelsiusUsingNegativeNumber(){

        F = temperatureConversionModel.toFahrenheit("Celsius", negativeDegree);
        expectedResult = -106.6;
        assertEquals(expectedResult, F);
    }

    @Test
    void testFahrenheitConversionFromKelvinUsingNegativeNumber(){

        F = temperatureConversionModel.toFahrenheit("Kelvin", negativeDegree);
        expectedResult = -598.3;
        assertEquals(expectedResult, F);
    }

    @Test
    void testFahrenheitConversionFromRankineUsingNegativeNumber(){

        F = temperatureConversionModel.toFahrenheit("Rankine", negativeDegree);
        expectedResult = -536.7;
        assertEquals(expectedResult, F);
    }

    // convert to kelvin test cases
    @Test
    void testKelvinConversionFromCelsiusUsingPositiveNumber(){

        K = temperatureConversionModel.toKelvin("Celsius", positiveDegree);
        expectedResult = 337.2;
        assertEquals(expectedResult, K);
    }

    @Test
    void testKelvinConversionFromFahrenheitUsingPositiveNumber(){

        K = temperatureConversionModel.toKelvin("Fahrenheit", positiveDegree);
        expectedResult = 290.9;
        assertEquals(expectedResult, K);
    }

    @Test
    void testKelvinConversionFromRankineUsingPositiveNumber(){

        K = temperatureConversionModel.toKelvin("Rankine", positiveDegree);
        expectedResult = 35.6;
        assertEquals(expectedResult, K);
    }

    @Test
    void testKelvinConversionFromCelsiusUsingNegativeNumber(){

        K = temperatureConversionModel.toKelvin("Celsius", negativeDegree);
        expectedResult = 196.1;
        assertEquals(expectedResult, K);
    }

    @Test
    void testKelvinConversionFromFahrenheitUsingNegativeNumber(){

        K = temperatureConversionModel.toKelvin("Fahrenheit", negativeDegree);
        expectedResult = 212.6;
        assertEquals(expectedResult, K);
    }

    @Test
    void testKelvinConversionToRankineUsingNegativeNumber(){

        K = temperatureConversionModel.toKelvin("Rankine", negativeDegree);
        expectedResult = -42.8;
        assertEquals(expectedResult, K);
    }

    // convert to rankine test cases
    @Test
    void testRankineConversionFromCelsiusUsingPositiveNumber(){

        R = temperatureConversionModel.toRankine("Celsius", positiveDegree);
        expectedResult = 606.9;
        assertEquals(expectedResult, R);
    }

    @Test
    void testRankineConversionFromFahrenheitUsingPositiveNumber(){

        R = temperatureConversionModel.toRankine("Fahrenheit", positiveDegree);
        expectedResult = 523.7;
        assertEquals(expectedResult, R);
    }

    @Test
    void testRankineConversionFromKelvinUsingPositiveNumber(){

        R = temperatureConversionModel.toRankine("Kelvin", positiveDegree);
        expectedResult = 115.2;
        assertEquals(expectedResult, R);
    }

    @Test
    void testRankineConversionFromCelsiusUsingNegativeNumber(){

        R = temperatureConversionModel.toRankine("Celsius", negativeDegree);
        expectedResult = 353.1;
        assertEquals(expectedResult, R);
    }

    @Test
    void testRankineConversionFromFahrenheitUsingNegativeNumber(){

        R = temperatureConversionModel.toRankine("Fahrenheit", negativeDegree);
        expectedResult = 382.7;
        assertEquals(expectedResult, R);
    }

    @Test
    void testRankineConversionFromKelvinUsingNegativeNumber(){

        R = temperatureConversionModel.toRankine("Kelvin", negativeDegree);
        expectedResult = -138.6;
        assertEquals(expectedResult, R);
    }
}