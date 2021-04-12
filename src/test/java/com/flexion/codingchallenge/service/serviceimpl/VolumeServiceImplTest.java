package com.flexion.codingchallenge.service.serviceimpl;

import com.flexion.codingchallenge.model.request.VolumeRequestModel;
import com.flexion.codingchallenge.model.response.VolumeResponseModel;
import com.flexion.codingchallenge.unitsofmeasure.UnitsOfMeasure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeServiceImplTest {

    VolumeServiceImpl volumeServiceImpl = new VolumeServiceImpl();
    VolumeRequestModel volumeRequestModel = new VolumeRequestModel();
    VolumeResponseModel volumeResponseModel = new VolumeResponseModel();

    @Test
    void testConvertToCubicFeetResponseValidatorResultEqualsCorrect(){

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.CUBIC_INCHES.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.CUBIC_FEET.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(0.0);

        volumeResponseModel = volumeServiceImpl.convertToCubicFeet(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is correct");
    }

    @Test
    void testConvertToCubicFeetResponseValidatorResultEqualsIncorrect(){

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.CUBIC_INCHES.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.CUBIC_FEET.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(1.0);

        volumeResponseModel = volumeServiceImpl.convertToCubicFeet(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is incorrect");
    }

    @Test
    void testConvertToCubicInchesResponseValidatorResultEqualsCorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.CUPS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.CUBIC_INCHES.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(231);

        volumeResponseModel = volumeServiceImpl.convertToCubicInches(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is correct");
    }

    @Test
    void testConvertToCubicInchesResponseValidatorResultEqualsIncorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.CUPS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.CUBIC_FEET.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(1.0);

        volumeResponseModel = volumeServiceImpl.convertToCubicFeet(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is incorrect");
    }

    @Test
    void testConvertToCupsResponseValidatorResultEqualsCorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.LITERS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.CUPS.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(67.6);

        volumeResponseModel = volumeServiceImpl.convertToCups(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is correct");
    }

    @Test
    void testConvertToCupsResponseValidatorResultEqualsIncorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.LITERS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.CUPS.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(-1);

        volumeResponseModel = volumeServiceImpl.convertToCups(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is incorrect");
    }

    @Test
    void testConvertToGallonsResponseValidatorResultEqualsCorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.TABLESPOONS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.GALLONS.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(0.1);

        volumeResponseModel = volumeServiceImpl.convertToGallons(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is correct");
    }

    @Test
    void testConvertToGallonsResponseValidatorResultEqualsIncorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.TABLESPOONS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.GALLONS.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(0.0);

        volumeResponseModel = volumeServiceImpl.convertToGallons(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is incorrect");
    }

    @Test
    void testConvertLitersResponseValidatorResultEqualsCorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.GALLONS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.LITERS.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(60.6);

        volumeResponseModel = volumeServiceImpl.convertToLiters(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is correct");
    }

    @Test
    void testConvertLitersResponseValidatorResultEqualsIncorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.GALLONS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.LITERS.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(60.66666);

        volumeResponseModel = volumeServiceImpl.convertToLiters(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is incorrect");
    }

    @Test
    void testConvertToTablespoonsResponseValidatorResultEqualsCorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.CUPS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.TABLESPOONS.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(256);

        volumeResponseModel = volumeServiceImpl.convertToTablespoons(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is correct");
    }

    @Test
    void testConvertToTablespoonsResponseValidatorResultEqualsIncorrect() {

        volumeRequestModel.setVolumeFrom(UnitsOfMeasure.Units.CUPS.label());
        volumeRequestModel.setVolumeTo(UnitsOfMeasure.Units.TABLESPOONS.label());
        volumeRequestModel.setVolumeValue(16);
        volumeRequestModel.setStudentResponse(123);

        volumeResponseModel = volumeServiceImpl.convertToTablespoons(volumeRequestModel);

        assertEquals(volumeResponseModel.getResponseValidator(), "Student answer is incorrect");
    }
}