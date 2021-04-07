package com.flexion.codingchallenge.model.request;
/*
|----------------------
| Incoming form data
|----------------------
*/
public class TemperatureRequestModel {
   private String temptFrom;
   private String temptTo;
   private double temptValue;
   private double studentResponse;

    public TemperatureRequestModel() {

    }

    public TemperatureRequestModel(String temptFrom, String temptTo, double temptValue, double studentResponse) {
        this.temptFrom = temptFrom;
        this.temptTo = temptTo;
        this.temptValue = temptValue;
        this.studentResponse = studentResponse;
    }

    public String getTemptFrom() {
        return temptFrom;
    }

    public void setTemptFrom(String temptFrom) {
        this.temptFrom = temptFrom;
    }

    public String getTemptTo() {
        return temptTo;
    }

    public void setTemptTo(String temptTo) {
        this.temptTo = temptTo;
    }

    public double getTemptValue() {
        return temptValue;
    }

    public void setTemptValue(double temptValue) {
        this.temptValue = temptValue;
    }

    public double getStudentResponse() {
        return studentResponse;
    }

    public void setStudentResponse(double studentResponse) {
        this.studentResponse = studentResponse;
    }
}