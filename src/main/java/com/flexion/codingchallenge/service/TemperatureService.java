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

    public TemperatureResponseModel convertToKelvin(TemperatureRequestModel temptRequestModel);
    public TemperatureResponseModel convertToCelsius(TemperatureRequestModel temptRequestModel);
    public TemperatureResponseModel convertToFahrenheit(TemperatureRequestModel temptRequestModel);
    public TemperatureResponseModel convertToRankine(TemperatureRequestModel temptRequestModel);
}