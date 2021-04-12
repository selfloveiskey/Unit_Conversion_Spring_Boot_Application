package com.flexion.codingchallenge.service;

import com.flexion.codingchallenge.model.request.TemperatureRequestModel;
import com.flexion.codingchallenge.model.response.TemperatureResponseModel;
/*
|---------------------------------------------------------------------------------
| Abstract methods detailing what actions you can perform while hiding how the
| actions are performed/implemented
|---------------------------------------------------------------------------------
*/
public interface TemperatureService {

    public TemperatureResponseModel convertToKelvin(TemperatureRequestModel tempRequestModel);
    public TemperatureResponseModel convertToCelsius(TemperatureRequestModel tempRequestModel);
    public TemperatureResponseModel convertToFahrenheit(TemperatureRequestModel tempRequestModel);
    public TemperatureResponseModel convertToRankine(TemperatureRequestModel tempRequestModel);
}