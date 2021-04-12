package com.flexion.codingchallenge.model.response;
/*
|----------------------
| Outgoing form data
|----------------------
*/
public class TemperatureResponseModel {

    private String tempFrom;
    private String tempTo;
    private double convertedDegree;
    private double initialDegree;
    private double studentResponse;
    private String responseValidator;

    public TemperatureResponseModel() {

    }

    public TemperatureResponseModel(double convertedDegree, double studentResponse, String responseValidator){
        this.convertedDegree = convertedDegree;
        this.studentResponse = studentResponse;
        this.responseValidator = responseValidator;
    }

    public double getConvertedDegree() {
        return convertedDegree;
    }

    public void setConvertedDegree(double convertedDegree) {
        this.convertedDegree = convertedDegree;
    }

    public String getTempFrom() {
        return tempFrom;
    }

    public void setTempFrom(String tempFrom) {
        this.tempFrom = tempFrom;
    }

    public String getTempTo() {
        return tempTo;
    }

    public void setTempTo(String tempTo) {
        this.tempTo = tempTo;
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

    public double getInitialDegree() {
        return initialDegree;
    }

    public void setInitialDegree(double initialDegree) {
        this.initialDegree = initialDegree;
    }
}