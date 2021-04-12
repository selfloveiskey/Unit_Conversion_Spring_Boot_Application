package com.flexion.codingchallenge.model.request;
/*
|----------------------
| Incoming form data
|----------------------
*/
public class TemperatureRequestModel {
   private String tempFrom;
   private String tempTo;
   private double tempValue;
   private double studentResponse;

    public TemperatureRequestModel() {

    }

    public TemperatureRequestModel(String tempFrom, String tempTo, double tempValue, double studentResponse) {
        this.tempFrom = tempFrom;
        this.tempTo = tempTo;
        this.tempValue = tempValue;
        this.studentResponse = studentResponse;
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

    public double getTempValue() {
        return tempValue;
    }

    public void setTempValue(double tempValue) {
        this.tempValue = tempValue;
    }

    public double getStudentResponse() {
        return studentResponse;
    }

    public void setStudentResponse(double studentResponse) {
        this.studentResponse = studentResponse;
    }
}