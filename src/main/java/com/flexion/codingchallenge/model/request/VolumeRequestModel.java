package com.flexion.codingchallenge.model.request;
/*
|----------------------
| Incoming form data
|----------------------
*/
public class VolumeRequestModel {
    private String volumeFrom;
    private String volumeTo;
    private double volumeValue;
    private double studentResponse;

    public VolumeRequestModel(){}

    public VolumeRequestModel(String volumeFrom, String volumeTo, double volumeValue, double studentResponse) {
        this.volumeFrom = volumeFrom;
        this.volumeTo = volumeTo;
        this.volumeValue = volumeValue;
        this.studentResponse = studentResponse;
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

    public double getVolumeValue() {
        return volumeValue;
    }

    public void setVolumeValue(double volumeValue) {
        this.volumeValue = volumeValue;
    }

    public double getStudentResponse() {
        return studentResponse;
    }

    public void setStudentResponse(double studentResponse) {
        this.studentResponse = studentResponse;
    }
}