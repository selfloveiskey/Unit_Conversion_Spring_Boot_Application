package com.flexion.codingchallenge.service;

import com.flexion.codingchallenge.model.request.VolumeRequestModel;
import com.flexion.codingchallenge.model.response.VolumeResponseModel;

/*
|---------------------------------------------------------------------------------
| Abstract methods detailing what actions you can perform while hiding how the
| actions are performed/implemented
|---------------------------------------------------------------------------------
*/
public interface VolumeService {

    public VolumeResponseModel convertToCubicFeet(VolumeRequestModel volumeRequestModel);
    public VolumeResponseModel convertToCubicInches(VolumeRequestModel volumeRequestModel);
    public VolumeResponseModel convertToCups(VolumeRequestModel volumeRequestModel);
    public VolumeResponseModel convertToGallons(VolumeRequestModel volumeRequestModel);
    public VolumeResponseModel convertToLiters(VolumeRequestModel volumeRequestModel);
    public VolumeResponseModel convertToTablespoons(VolumeRequestModel volumeRequestModel);
}