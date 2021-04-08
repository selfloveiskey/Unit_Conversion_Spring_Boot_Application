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

    TemperatureConversionModel temptConversionModel = new TemperatureConversionModel();
    TemperatureResponseModel temptResponseModel = new TemperatureResponseModel();
    int roundScale = 1;

    @Override
    public TemperatureResponseModel convertToKelvin(TemperatureRequestModel temptRequestModel) {
        try {
            temptResponseModel.setConvertedDegree(temptConversionModel.toKelvin(temptRequestModel.getTemptFrom(), temptRequestModel.getTemptValue()));
            temptResponseModel.setStudentResponse(Precision.round(temptRequestModel.getStudentResponse(),roundScale));

            if(temptResponseModel.getConvertedDegree() == temptResponseModel.getStudentResponse()){
                temptResponseModel.setResponseValidator("Student answer is correct");
            }else{
                temptResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return temptResponseModel;
    }

    @Override
    public TemperatureResponseModel convertToCelsius(TemperatureRequestModel temptRequestModel) {
        try {
            temptResponseModel.setConvertedDegree(temptConversionModel.toCelsius(temptRequestModel.getTemptFrom(), temptRequestModel.getTemptValue()));
            temptResponseModel.setStudentResponse(Precision.round(temptRequestModel.getStudentResponse(),roundScale));

            if(temptResponseModel.getConvertedDegree() == temptResponseModel.getStudentResponse()){
                temptResponseModel.setResponseValidator("Student answer is correct");
            }else{
                temptResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return temptResponseModel;
    }

    @Override
    public TemperatureResponseModel convertToFahrenheit(TemperatureRequestModel temptRequestModel) {
        try {
            temptResponseModel.setConvertedDegree(temptConversionModel.toFahrenheit(temptRequestModel.getTemptFrom(), temptRequestModel.getTemptValue()));
            temptResponseModel.setStudentResponse(Precision.round(temptRequestModel.getStudentResponse(),roundScale));

            if(temptResponseModel.getConvertedDegree() == temptResponseModel.getStudentResponse()){
                temptResponseModel.setResponseValidator("Student answer is correct");
            }else{
                temptResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return temptResponseModel;
    }

    @Override
    public TemperatureResponseModel convertToRankine(TemperatureRequestModel temptRequestModel) {
        try {
            temptResponseModel.setConvertedDegree(temptConversionModel.toRankine(temptRequestModel.getTemptFrom(), temptRequestModel.getTemptValue()));
            temptResponseModel.setStudentResponse(Precision.round(temptRequestModel.getStudentResponse(),roundScale));

            if(temptResponseModel.getConvertedDegree() == temptResponseModel.getStudentResponse()){
                temptResponseModel.setResponseValidator("Student answer is correct");
            }else{
                temptResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return temptResponseModel;
    }
}