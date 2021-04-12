package com.flexion.codingchallenge.controller;

import com.flexion.codingchallenge.model.request.TemperatureRequestModel;
import com.flexion.codingchallenge.model.request.VolumeRequestModel;
import com.flexion.codingchallenge.model.response.TemperatureResponseModel;
import com.flexion.codingchallenge.model.response.VolumeResponseModel;
import com.flexion.codingchallenge.service.TemperatureService;
import com.flexion.codingchallenge.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UnitConversionController {

    @Autowired
    TemperatureService temperatureService;

    @Autowired
    VolumeService volumeService;

    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }

    @PostMapping("/temperature")
    public String temperatureHtmlPage(Model model) {
        model.addAttribute("TemperatureRequestModel", new TemperatureRequestModel());
        return "temperature";
    }

    @PostMapping("/temperatureConversion")
    public String Temperature(@ModelAttribute TemperatureRequestModel tempRequestModel, Model model) {

        try {
            TemperatureResponseModel tempResponseModel = new TemperatureResponseModel();

            switch (tempRequestModel.getTempTo()) {
                case "Celsius":
                    tempResponseModel = temperatureService.convertToCelsius(tempRequestModel);

                    break;
                case "Fahrenheit":
                    tempResponseModel = temperatureService.convertToFahrenheit(tempRequestModel);

                    break;
                case "Kelvin":
                    tempResponseModel = temperatureService.convertToKelvin(tempRequestModel);

                    break;
                case "Rankine":
                    tempResponseModel = temperatureService.convertToRankine(tempRequestModel);

                    break;
            }

            tempResponseModel.setTempFrom(tempRequestModel.getTempFrom());
            tempResponseModel.setTempTo(tempRequestModel.getTempTo());
            tempResponseModel.setInitialDegree(tempRequestModel.getTempValue());

            model.addAttribute("TemperatureResponseModel", tempResponseModel);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }

        return "TemperatureResults";
    }


    @PostMapping("/volume")
    public String volumeHtmlPage(Model model) {
        model.addAttribute("VolumeRequestModel", new VolumeRequestModel());
        return "volume";
    }

    @PostMapping("/volumeConversion")
    public String Volume(@ModelAttribute VolumeRequestModel volumeRequestModel, Model model) {

        try {
            VolumeResponseModel volumeResponseModel = new VolumeResponseModel();

            switch (volumeRequestModel.getVolumeTo()) {

                case "Cubic-Feet":
                    volumeResponseModel = volumeService.convertToCubicFeet(volumeRequestModel);

                    break;
                case "Cubic-Inches":
                    volumeResponseModel = volumeService.convertToCubicInches(volumeRequestModel);

                    break;
                case "Cups":
                    volumeResponseModel = volumeService.convertToCups(volumeRequestModel);

                    break;
                case "Gallons":
                    volumeResponseModel = volumeService.convertToGallons(volumeRequestModel);

                    break;
                case "Liters":
                    volumeResponseModel = volumeService.convertToLiters(volumeRequestModel);

                    break;
                case "Tablespoons":
                    volumeResponseModel = volumeService.convertToTablespoons(volumeRequestModel);

                    break;
            }

            volumeResponseModel.setVolumeFrom(volumeRequestModel.getVolumeFrom());
            volumeResponseModel.setVolumeTo(volumeRequestModel.getVolumeTo());
            volumeResponseModel.setInitialVolumeValue(volumeRequestModel.getVolumeValue());

            model.addAttribute("VolumeResponseModel", volumeResponseModel);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }

        return "VolumeResults";
    }
}