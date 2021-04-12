package com.flexion.codingchallenge.model.response;
/*
|----------------------
| Outgoing form data
|----------------------
*/
public class VolumeResponseModel {

    private String volumeFrom;
    private String volumeTo;
    private double convertedVolumeValue;
    private double initialVolumeValue;
    private double studentResponse;
    private String responseValidator;

    public VolumeResponseModel(){}

    public VolumeResponseModel(String volumeFrom, String volumeTo, double convertedVolumeValue, double initialVolumeValue, double studentResponse, String responseValidator) {
        this.volumeFrom = volumeFrom;
        this.volumeTo = volumeTo;
        this.convertedVolumeValue = convertedVolumeValue;
        this.initialVolumeValue = initialVolumeValue;
        this.studentResponse = studentResponse;
        this.responseValidator = responseValidator;
    }

    public String getVolumeFrom() {
        return volumeFrom;
    }

    public void setVolumeFrom(String volumeFrom) {
        this.volumeFrom = volumeFrom;
    }

    public String getVolumeTo() {
        return volumeTo;
    }

    public void setVolumeTo(String volumeTo) {
        this.volumeTo = volumeTo;
    }

    public double getConvertedVolumeValue() {
        return convertedVolumeValue;
    }

    public void setConvertedVolumeValue(double convertedVolumeValue) {
        this.convertedVolumeValue = convertedVolumeValue;
    }

    public double getInitialVolumeValue() {
        return initialVolumeValue;
    }

    public void setInitialVolumeValue(double initialVolumeValue) {
        this.initialVolumeValue = initialVolumeValue;
    }

    public double getStudentResponse() {
        return studentResponse;
    }

    public void setStudentResponse(double studentResponse) {
        this.studentResponse = studentResponse;
    }

    public String getResponseValidator() {
        return responseValidator;
    }

    public void setResponseValidator(String responseValidator) {
        this.responseValidator = responseValidator;
    }
}