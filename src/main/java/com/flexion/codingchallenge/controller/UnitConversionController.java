package com.flexion.codingchallenge.controller;

import com.flexion.codingchallenge.model.request.TemperatureRequestModel;
import com.flexion.codingchallenge.model.response.TemperatureResponseModel;
import com.flexion.codingchallenge.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UnitConversionController {

    @Autowired
    TemperatureService temperatureService;

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

    @PostMapping("/volume")
    public String volumeHtmlPage() {

        return "volume";
    }

    @PostMapping("/temperatureConversion")
    public String Temperature(@ModelAttribute TemperatureRequestModel temptRequestModel, Model model) {

        try {
            TemperatureResponseModel temptResponseModel = null;

            switch (temptRequestModel.getTemptTo()) {
                case "Celsius":
                    temptResponseModel = temperatureService.convertToCelsius(temptRequestModel);

                    break;
                case "Fahrenheit":
                    temptResponseModel = temperatureService.convertToFahrenheit(temptRequestModel);

                    break;
                case "Kelvin":
                    temptResponseModel = temperatureService.convertToKelvin(temptRequestModel);

                    break;
                case "Rankine":
                    temptResponseModel = temperatureService.convertToRankine(temptRequestModel);

                    break;
            }

            temptResponseModel.setTemptFrom(temptRequestModel.getTemptFrom());
            temptResponseModel.setTemptTo(temptRequestModel.getTemptTo());
            temptResponseModel.setInitialDegree(temptRequestModel.getTemptValue());

            model.addAttribute("TemperatureResponseModel", temptResponseModel);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }

        return "TemperatureResults";
    }
}