package com.flexion.codingchallenge.service.serviceimpl;

import com.flexion.codingchallenge.model.VolumeConversionModel;
import com.flexion.codingchallenge.model.request.VolumeRequestModel;
import com.flexion.codingchallenge.model.response.VolumeResponseModel;
import com.flexion.codingchallenge.service.VolumeService;
import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

/*
|--------------------------------------------------------------------------
| Details how the abstract methods from TemperatureService are implemented
|--------------------------------------------------------------------------
*/
@Service
public class VolumeServiceImpl implements VolumeService {
    VolumeConversionModel volumeConversionModel = new VolumeConversionModel();
    VolumeResponseModel volumeResponseModel = new VolumeResponseModel();
    int roundScale = 1;

    @Override
    public VolumeResponseModel convertToCubicFeet(VolumeRequestModel volumeRequestModel) {

        try {
            volumeResponseModel.setConvertedVolumeValue(volumeConversionModel.toCubicFeet(volumeRequestModel.getVolumeFrom(), volumeRequestModel.getVolumeValue()));
            volumeResponseModel.setStudentResponse(Precision.round(volumeRequestModel.getStudentResponse(), roundScale));

            if(volumeResponseModel.getConvertedVolumeValue() == volumeResponseModel.getStudentResponse()){

                volumeResponseModel.setResponseValidator("Student answer is correct");
            }else{

                volumeResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return volumeResponseModel;
    }

    @Override
    public VolumeResponseModel convertToCubicInches(VolumeRequestModel volumeRequestModel) {

        try {
            volumeResponseModel.setConvertedVolumeValue(volumeConversionModel.toCubicInches(volumeRequestModel.getVolumeFrom(), volumeRequestModel.getVolumeValue()));
            volumeResponseModel.setStudentResponse(Precision.round(volumeRequestModel.getStudentResponse(), roundScale));

            if(volumeResponseModel.getConvertedVolumeValue() == volumeResponseModel.getStudentResponse()){

                volumeResponseModel.setResponseValidator("Student answer is correct");
            }else{

                volumeResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return volumeResponseModel;
    }

    @Override
    public VolumeResponseModel convertToCups(VolumeRequestModel volumeRequestModel) {

        try {
            volumeResponseModel.setConvertedVolumeValue(volumeConversionModel.toCups(volumeRequestModel.getVolumeFrom(), volumeRequestModel.getVolumeValue()));
            volumeResponseModel.setStudentResponse(Precision.round(volumeRequestModel.getStudentResponse(), roundScale));

            if(volumeResponseModel.getConvertedVolumeValue() == volumeResponseModel.getStudentResponse()){

                volumeResponseModel.setResponseValidator("Student answer is correct");
            }else{

                volumeResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return volumeResponseModel;
    }

    @Override
    public VolumeResponseModel convertToGallons(VolumeRequestModel volumeRequestModel) {

        try {
            volumeResponseModel.setConvertedVolumeValue(volumeConversionModel.toGallons(volumeRequestModel.getVolumeFrom(), volumeRequestModel.getVolumeValue()));
            volumeResponseModel.setStudentResponse(Precision.round(volumeRequestModel.getStudentResponse(), roundScale));

            if(volumeResponseModel.getConvertedVolumeValue() == volumeResponseModel.getStudentResponse()){

                volumeResponseModel.setResponseValidator("Student answer is correct");
            }else{

                volumeResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return volumeResponseModel;
    }

    @Override
    public VolumeResponseModel convertToLiters(VolumeRequestModel volumeRequestModel) {

        try {
            volumeResponseModel.setConvertedVolumeValue(volumeConversionModel.toLiters(volumeRequestModel.getVolumeFrom(), volumeRequestModel.getVolumeValue()));
            volumeResponseModel.setStudentResponse(Precision.round(volumeRequestModel.getStudentResponse(), roundScale));

            if(volumeResponseModel.getConvertedVolumeValue() == volumeResponseModel.getStudentResponse()){

                volumeResponseModel.setResponseValidator("Student answer is correct");
            }else{

                volumeResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return volumeResponseModel;
    }

    @Override
    public VolumeResponseModel convertToTablespoons(VolumeRequestModel volumeRequestModel) {

        try {
            volumeResponseModel.setConvertedVolumeValue(volumeConversionModel.toTablespoons(volumeRequestModel.getVolumeFrom(), volumeRequestModel.getVolumeValue()));
            volumeResponseModel.setStudentResponse(Precision.round(volumeRequestModel.getStudentResponse(), roundScale));

            if(volumeResponseModel.getConvertedVolumeValue() == volumeResponseModel.getStudentResponse()){

                volumeResponseModel.setResponseValidator("Student answer is correct");
            }else{

                volumeResponseModel.setResponseValidator("Student answer is incorrect");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return volumeResponseModel;
    }
}