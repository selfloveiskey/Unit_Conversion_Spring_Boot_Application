package com.flexion.codingchallenge.service.serviceimpl;

import com.flexion.codingchallenge.model.request.TemperatureRequestModel;
import com.flexion.codingchallenge.model.response.TemperatureResponseModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureServiceImplTest {

    TemperatureServiceImpl temperatureServiceImpl = new TemperatureServiceImpl();
    TemperatureRequestModel temperatureRequestModel = new TemperatureRequestModel();
    TemperatureResponseModel temperatureResponseModel = new TemperatureResponseModel();


    @Test
    void testConvertToCelsiusResponseValidatorResultEqualsCorrect() {

        temperatureRequestModel.setTemptFrom("Rankine");
        temperatureRequestModel.setTemptTo("Celsius");
        temperatureRequestModel.setTemptValue(-77);
        temperatureRequestModel.setStudentResponse(-315.9);

        temperatureResponseModel = temperatureServiceImpl.convertToCelsius(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "correct");

    }

    @Test
    void testConvertToCelsiusResponseValidatorResultEqualsIncorrect() {

        temperatureRequestModel.setTemptFrom("Fahrenheit");
        temperatureRequestModel.setTemptTo("Celsius");
        temperatureRequestModel.setTemptValue(64);
        temperatureRequestModel.setStudentResponse(17);

        temperatureResponseModel = temperatureServiceImpl.convertToCelsius(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "incorrect");

    }

    @Test
    void testConvertToKelvinResponseValidatorResultEqualsCorrect() {

       temperatureRequestModel.setTemptFrom("Celsius");
       temperatureRequestModel.setTemptTo("Kelvin");
       temperatureRequestModel.setTemptValue(64);
       temperatureRequestModel.setStudentResponse(337.2);

       temperatureResponseModel = temperatureServiceImpl.convertToKelvin(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "correct");

    }

    @Test
    void testConvertToKelvinResponseValidatorResultEqualsIncorrect() {

        temperatureRequestModel.setTemptFrom("Celsius");
        temperatureRequestModel.setTemptTo("Kelvin");
        temperatureRequestModel.setTemptValue(64);
        temperatureRequestModel.setStudentResponse(77);

        temperatureResponseModel = temperatureServiceImpl.convertToKelvin(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "incorrect");

    }

    @Test
    void testConvertToFahrenheitResponseValidatorResultEqualsCorrect() {

        temperatureRequestModel.setTemptFrom("Kelvin");
        temperatureRequestModel.setTemptTo("Fahrenheit");
        temperatureRequestModel.setTemptValue(-77);
        temperatureRequestModel.setStudentResponse(-598.3);

        temperatureResponseModel = temperatureServiceImpl.convertToFahrenheit(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "correct");
    }

    @Test
    void testConvertToFahrenheitResponseValidatorResultEqualsIncorrect() {

        temperatureRequestModel.setTemptFrom("Celsius");
        temperatureRequestModel.setTemptTo("Fahrenheit");
        temperatureRequestModel.setTemptValue(64);
        temperatureRequestModel.setStudentResponse(337.2);

        temperatureResponseModel = temperatureServiceImpl.convertToFahrenheit(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "incorrect");
    }

    @Test
    void testConvertToRankineResponseValidatorResultEqualsCorrect() {
        temperatureRequestModel.setTemptFrom("Kelvin");
        temperatureRequestModel.setTemptTo("Rankine");
        temperatureRequestModel.setTemptValue(64);
        temperatureRequestModel.setStudentResponse(115.2);

        temperatureResponseModel = temperatureServiceImpl.convertToRankine(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "correct");
    }

    @Test
    void testConvertToRankineResponseValidatorResultEqualsIncorrect() {
        temperatureRequestModel.setTemptFrom("Fahrenheit");
        temperatureRequestModel.setTemptTo("Rankine");
        temperatureRequestModel.setTemptValue(-77);
        temperatureRequestModel.setStudentResponse(77);

        temperatureResponseModel = temperatureServiceImpl.convertToRankine(temperatureRequestModel);

        assertEquals(temperatureResponseModel.getResponseValidator(), "incorrect");
    }
}