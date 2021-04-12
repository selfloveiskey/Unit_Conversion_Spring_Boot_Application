package com.flexion.codingchallenge.service.serviceimpl;

import com.flexion.codingchallenge.model.TemperatureConversionModel;
import com.flexion.codingchallenge.model.request.TemperatureRequestModel;
import com.flexion.codingchallenge.model.response.TemperatureResponseModel;
import com.flexion.codingchallenge.service.TemperatureService;
import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;
/*
|--------------------------------------------------------------------------
| Details how the abstract methods from TemperatureService are implemented
|--------------------------------------------------------------------------
*/
@Service
public class TemperatureServiceImpl implements TemperatureService {

    TemperatureConversionModel tempConversionModel = new TemperatureConversionModel();
    TemperatureResponseModel tempResponseModel = new TemperatureResponseModel();
    int roundScale = 1;

    @Override
    public TemperatureResponseModel convertToKelvin(TemperatureRequestModel tempRequestModel) {
        try {
            tempResponseModel.setConvertedDegree(tempConversionModel.toKelvin(tempRequestModel.getTempFrom(), tempRequestModel.getTempValue()));
            tempResponseModel.setStudentResponse(Precision.round(tempRequestModel.getStudentResponse(),roundScale));

            if(tempResponseModel.getConvertedDegree() == tempResponseModel.getStudentResponse()){
                tempResponseModel.setResponseValidator("Student answer is correct");
            }else{
                tempResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return tempResponseModel;
    }

    @Override
    public TemperatureResponseModel convertToCelsius(TemperatureRequestModel tempRequestModel) {
        try {
            tempResponseModel.setConvertedDegree(tempConversionModel.toCelsius(tempRequestModel.getTempFrom(), tempRequestModel.getTempValue()));
            tempResponseModel.setStudentResponse(Precision.round(tempRequestModel.getStudentResponse(),roundScale));

            if(tempResponseModel.getConvertedDegree() == tempResponseModel.getStudentResponse()){
                tempResponseModel.setResponseValidator("Student answer is correct");
            }else{
                tempResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return tempResponseModel;
    }

    @Override
    public TemperatureResponseModel convertToFahrenheit(TemperatureRequestModel tempRequestModel) {
        try {
            tempResponseModel.setConvertedDegree(tempConversionModel.toFahrenheit(tempRequestModel.getTempFrom(), tempRequestModel.getTempValue()));
            tempResponseModel.setStudentResponse(Precision.round(tempRequestModel.getStudentResponse(),roundScale));

            if(tempResponseModel.getConvertedDegree() == tempResponseModel.getStudentResponse()){
                tempResponseModel.setResponseValidator("Student answer is correct");
            }else{
                tempResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return tempResponseModel;
    }

    @Override
    public TemperatureResponseModel convertToRankine(TemperatureRequestModel tempRequestModel) {
        try {
            tempResponseModel.setConvertedDegree(tempConversionModel.toRankine(tempRequestModel.getTempFrom(), tempRequestModel.getTempValue()));
            tempResponseModel.setStudentResponse(Precision.round(tempRequestModel.getStudentResponse(),roundScale));

            if(tempResponseModel.getConvertedDegree() == tempResponseModel.getStudentResponse()){
                tempResponseModel.setResponseValidator("Student answer is correct");
            }else{
                tempResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return tempResponseModel;
    }
}