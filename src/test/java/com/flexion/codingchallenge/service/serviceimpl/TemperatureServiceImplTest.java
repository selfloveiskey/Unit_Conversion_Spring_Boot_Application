package com.flexion.codingchallenge.service.serviceimpl;

import com.flexion.codingchallenge.model.request.TemperatureRequestModel;
import com.flexion.codingchallenge.model.response.TemperatureResponseModel;
import com.flexion.codingchallenge.unitsofmeasure.UnitsOfMeasure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureServiceImplTest {

    TemperatureServiceImpl temperatureServiceImpl = new TemperatureServiceImpl();
    TemperatureRequestModel temperatureRequestModel = new TemperatureRequestModel();
    TemperatureResponseModel temperatureResponseModel = new TemperatureResponseModel();


    @Test
    void testConvertToCelsiusResponseValidatorResultEqualsCorrect() {

        temperatureRequestModel.setTempFrom(UnitsOfMeasure.Units.RANKINE.label);
        temperatureRequestModel.setTempTo(UnitsOfMeasure.Units.CELSIUS.label);
        temperatureRequestModel.setTempValue(-77);
        temperatureRequestModel.setStudentResponse(-315.9);

        temperatureResponseModel = temperatureServiceImpl.convertToCelsius(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "Student answer is correct");

    }

    @Test
    void testConvertToCelsiusResponseValidatorResultEqualsIncorrect() {

        temperatureRequestModel.setTempFrom(UnitsOfMeasure.Units.FAHRENHEIT.label);
        temperatureRequestModel.setTempTo(UnitsOfMeasure.Units.CELSIUS.label);
        temperatureRequestModel.setTempValue(64);
        temperatureRequestModel.setStudentResponse(17);

        temperatureResponseModel = temperatureServiceImpl.convertToCelsius(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "Student answer is incorrect");

    }

    @Test
    void testConvertToKelvinResponseValidatorResultEqualsCorrect() {

       temperatureRequestModel.setTempFrom(UnitsOfMeasure.Units.CELSIUS.label);
       temperatureRequestModel.setTempTo(UnitsOfMeasure.Units.KELVIN.label);
       temperatureRequestModel.setTempValue(64);
       temperatureRequestModel.setStudentResponse(337.2);

       temperatureResponseModel = temperatureServiceImpl.convertToKelvin(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "Student answer is correct");

    }

    @Test
    void testConvertToKelvinResponseValidatorResultEqualsIncorrect() {

        temperatureRequestModel.setTempFrom(UnitsOfMeasure.Units.CELSIUS.label);
        temperatureRequestModel.setTempTo(UnitsOfMeasure.Units.KELVIN.label);
        temperatureRequestModel.setTempValue(64);
        temperatureRequestModel.setStudentResponse(77);

        temperatureResponseModel = temperatureServiceImpl.convertToKelvin(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "Student answer is incorrect");

    }

    @Test
    void testConvertToFahrenheitResponseValidatorResultEqualsCorrect() {

        temperatureRequestModel.setTempFrom(UnitsOfMeasure.Units.KELVIN.label);
        temperatureRequestModel.setTempTo(UnitsOfMeasure.Units.FAHRENHEIT.label);
        temperatureRequestModel.setTempValue(-77);
        temperatureRequestModel.setStudentResponse(-598.3);

        temperatureResponseModel = temperatureServiceImpl.convertToFahrenheit(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "Student answer is correct");
    }

    @Test
    void testConvertToFahrenheitResponseValidatorResultEqualsIncorrect() {

        temperatureRequestModel.setTempFrom(UnitsOfMeasure.Units.CELSIUS.label);
        temperatureRequestModel.setTempTo(UnitsOfMeasure.Units.FAHRENHEIT.label);
        temperatureRequestModel.setTempValue(64);
        temperatureRequestModel.setStudentResponse(337.2);

        temperatureResponseModel = temperatureServiceImpl.convertToFahrenheit(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "Student answer is incorrect");
    }

    @Test
    void testConvertToRankineResponseValidatorResultEqualsCorrect() {
        temperatureRequestModel.setTempFrom(UnitsOfMeasure.Units.KELVIN.label);
        temperatureRequestModel.setTempTo(UnitsOfMeasure.Units.RANKINE.label);
        temperatureRequestModel.setTempValue(64);
        temperatureRequestModel.setStudentResponse(115.2);

        temperatureResponseModel = temperatureServiceImpl.convertToRankine(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "Student answer is correct");
    }

    @Test
    void testConvertToRankineResponseValidatorResultEqualsIncorrect() {
        temperatureRequestModel.setTempFrom(UnitsOfMeasure.Units.FAHRENHEIT.label);
        temperatureRequestModel.setTempTo(UnitsOfMeasure.Units.FAHRENHEIT.label);
        temperatureRequestModel.setTempValue(-77);
        temperatureRequestModel.setStudentResponse(77);

        temperatureResponseModel = temperatureServiceImpl.convertToRankine(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "Student answer is incorrect");
    }
}