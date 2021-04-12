package com.flexion.codingchallenge.controller;

import com.flexion.codingchallenge.model.VolumeConversionModel;
import com.flexion.codingchallenge.model.request.TemperatureRequestModel;
import com.flexion.codingchallenge.model.request.VolumeRequestModel;
import com.flexion.codingchallenge.model.response.TemperatureResponseModel;
import com.flexion.codingchallenge.model.response.VolumeResponseModel;
import com.flexion.codingchallenge.service.TemperatureService;
import com.flexion.codingchallenge.service.VolumeService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import javax.management.Attribute;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@WebAppConfiguration
@WebMvcTest(UnitConversionController.class)
class UnitConversionControllerTest {

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TemperatureService temperatureService;

    @MockBean
    private VolumeService volumeService;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Test
    void testHomePageEndPoint() throws Exception {

        try {
            mockMvc.perform(get("/"))
                    .andExpect(status().isOk())
                    .andExpect(view().name("index"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testTemperatureEndPoint() throws Exception {

        try {
            mockMvc.perform(
                    post("/temperature"))
                    .andExpect(status().isOk())
                    .andExpect(view().name("temperature"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testTemperatureConversionEndPointToCelsius() throws Exception {

        try {

            TemperatureRequestModel temperatureRequestModel = new TemperatureRequestModel();
            temperatureRequestModel.setTempFrom("Rankine");
            temperatureRequestModel.setTempValue(41);
            temperatureRequestModel.setTempTo("Celsius");
            temperatureRequestModel.setStudentResponse(-250.4);

            TemperatureResponseModel tempResponseModel = new TemperatureResponseModel();
            tempResponseModel.setTempFrom("Rankine");
            tempResponseModel.setInitialDegree(41);
            tempResponseModel.setConvertedDegree(-250.4);
            tempResponseModel.setTempTo("Celsius");
            tempResponseModel.setStudentResponse(-250.4);
            tempResponseModel.setResponseValidator("correct");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher temptResponseModel = MockMvcResultMatchers.model().attribute("TemperatureResponseModel", tempResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/temperatureResults.html");

            mockMvc.perform(post("/temperatureConversion")
                                                                    .param("tempFrom", temperatureRequestModel.getTempFrom())
                                                                    .param("tempTo", temperatureRequestModel.getTempTo())
                                                                    .param("tempValue", String.valueOf(temperatureRequestModel.getTempValue()))
                                                                    .param("studentResponse", String.valueOf(temperatureRequestModel.getStudentResponse()))
                                                                                                                                                                ).andExpect(temptResponseModel)
                                                                                                                                                                .andExpect(view().name("TemperatureResults"))
                                                                                                                                                                .andExpect(ok);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testTemperatureConversionEndPointToFahrenheit() throws Exception {

        try {

            TemperatureRequestModel temperatureRequestModel = new TemperatureRequestModel();
            temperatureRequestModel.setTempFrom("Celsius");
            temperatureRequestModel.setTempValue(41);
            temperatureRequestModel.setTempTo("Fahrenheit");
            temperatureRequestModel.setStudentResponse(66);

            TemperatureResponseModel tempResponseModel = new TemperatureResponseModel();
            tempResponseModel.setTempFrom("Celsius");
            tempResponseModel.setInitialDegree(41);
            tempResponseModel.setConvertedDegree(105.8);
            tempResponseModel.setTempTo("Fahrenheit");
            tempResponseModel.setStudentResponse(105.8);
            tempResponseModel.setResponseValidator("correct");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher temptResponseModel = MockMvcResultMatchers.model().attribute("TemperatureResponseModel", tempResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/temperatureResults.html");

            mockMvc.perform(post("/temperatureConversion")
                                                                    .param("tempFrom", temperatureRequestModel.getTempFrom())
                                                                    .param("tempTo", temperatureRequestModel.getTempTo())
                                                                    .param("tempValue", String.valueOf(temperatureRequestModel.getTempValue()))
                                                                    .param("studentResponse", String.valueOf(temperatureRequestModel.getStudentResponse()))
                                                                                                                                                                ).andExpect(temptResponseModel)
                                                                                                                                                                .andExpect(view().name("TemperatureResults"))
                                                                                                                                                                .andExpect(ok);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testTemperatureConversionEndPointToKelvin() throws Exception {

        try {

            TemperatureRequestModel temperatureRequestModel = new TemperatureRequestModel();
            temperatureRequestModel.setTempFrom("Fahrenheit");
            temperatureRequestModel.setTempValue(41);
            temperatureRequestModel.setTempTo("Kelvin");
            temperatureRequestModel.setStudentResponse(278.2);

            TemperatureResponseModel tempResponseModel = new TemperatureResponseModel();
            tempResponseModel.setTempFrom("Fahrenheit");
            tempResponseModel.setInitialDegree(41);
            tempResponseModel.setConvertedDegree(278.2);
            tempResponseModel.setTempTo("Kelvin");
            tempResponseModel.setStudentResponse(278.2);
            tempResponseModel.setResponseValidator("correct");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher temptResponseModel = MockMvcResultMatchers.model().attribute("TemperatureResponseModel", tempResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/temperatureResults.html");

            mockMvc.perform(post("/temperatureConversion")
                                                                    .param("tempFrom", temperatureRequestModel.getTempFrom())
                                                                    .param("tempTo", temperatureRequestModel.getTempTo())
                                                                    .param("tempValue", String.valueOf(temperatureRequestModel.getTempValue()))
                                                                    .param("studentResponse", String.valueOf(temperatureRequestModel.getStudentResponse()))
                                                                                                                                                                ).andExpect(temptResponseModel)
                                                                                                                                                                .andExpect(view().name("TemperatureResults"))
                                                                                                                                                                .andExpect(ok);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testTemperatureConversionEndPointToRankine() throws Exception {

        try {

            TemperatureRequestModel temperatureRequestModel = new TemperatureRequestModel();
            temperatureRequestModel.setTempFrom("Kelvin");
            temperatureRequestModel.setTempValue(41);
            temperatureRequestModel.setTempTo("Rankine");
            temperatureRequestModel.setStudentResponse(73.8);

            TemperatureResponseModel tempResponseModel = new TemperatureResponseModel();
            tempResponseModel.setTempFrom("Kelvin");
            tempResponseModel.setInitialDegree(41);
            tempResponseModel.setConvertedDegree(73.8);
            tempResponseModel.setTempTo("Rankine");
            tempResponseModel.setStudentResponse(73.8);
            tempResponseModel.setResponseValidator("correct");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher temptResponseModel = MockMvcResultMatchers.model().attribute("TemperatureResponseModel", tempResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/temperatureResults.html");

            mockMvc.perform(post("/temperatureConversion")
                                                                    .param("tempFrom", temperatureRequestModel.getTempFrom())
                                                                    .param("tempTo", temperatureRequestModel.getTempTo())
                                                                    .param("tempValue", String.valueOf(temperatureRequestModel.getTempValue()))
                                                                    .param("studentResponse", String.valueOf(temperatureRequestModel.getStudentResponse()))
                                                                                                                                                                ).andExpect(temptResponseModel)
                                                                                                                                                                .andExpect(view().name("TemperatureResults"))
                                                                                                                                                                .andExpect(ok);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testVolumeEndPoint() throws Exception{

        try {
            mockMvc.perform(post("/volume"))
                    .andExpect(status().isOk())
                    .andExpect(view().name("volume"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testVolumeConversionEndPointToCubicFeet() throws Exception{

        try {

            VolumeRequestModel volumeRequestModel = new VolumeRequestModel();
            volumeRequestModel.setVolumeFrom("Liter");
            volumeRequestModel.setVolumeValue(10);
            volumeRequestModel.setVolumeTo("Cubic-Feet");
            volumeRequestModel.setStudentResponse(0.3531);

            VolumeResponseModel volumeResponseModel = new VolumeResponseModel();
            volumeResponseModel.setVolumeFrom("Liter");
            volumeResponseModel.setInitialVolumeValue(10);
            volumeResponseModel.setConvertedVolumeValue(0.4);
            volumeResponseModel.setVolumeTo("Cubic-Feet");
            volumeResponseModel.setStudentResponse(1.3531);
            volumeResponseModel.setResponseValidator("incorrect");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher volResponseModel = MockMvcResultMatchers.model().attribute("VolumeResponseModel", volumeResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/volumeResults.html");

            mockMvc.perform(post("/volumeConversion")
                                                                    .param("volumeFrom", volumeRequestModel.getVolumeFrom())
                                                                    .param("volumeTo", volumeRequestModel.getVolumeTo())
                                                                    .param("volumeValue", String.valueOf(volumeRequestModel.getVolumeValue()))
                                                                    .param("studentResponse", String.valueOf(volumeRequestModel.getStudentResponse()))
                                                                                                                                                        ).andExpect(volResponseModel)
                                                                                                                                                        .andExpect(view().name("VolumeResults"))
                                                                                                                                                        .andExpect(ok);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testVolumeConversionEndPointToCubicInches() throws Exception{

        try {

            VolumeRequestModel volumeRequestModel = new VolumeRequestModel();
            volumeRequestModel.setVolumeFrom("Cubic-Feet");
            volumeRequestModel.setVolumeValue(10);
            volumeRequestModel.setVolumeTo("Cubic-Inches");
            volumeRequestModel.setStudentResponse(172);

            VolumeResponseModel volumeResponseModel = new VolumeResponseModel();
            volumeResponseModel.setVolumeFrom("Cubic-Feet");
            volumeResponseModel.setInitialVolumeValue(10);
            volumeResponseModel.setConvertedVolumeValue(17280);
            volumeResponseModel.setVolumeTo("Cubic-Inches");
            volumeResponseModel.setStudentResponse(172);
            volumeResponseModel.setResponseValidator("incorrect");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher volResponseModel = MockMvcResultMatchers.model().attribute("VolumeResponseModel", volumeResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/volumeResults.html");

            mockMvc.perform(post("/volumeConversion")
                                                            .param("volumeFrom", volumeRequestModel.getVolumeFrom())
                                                            .param("volumeTo", volumeRequestModel.getVolumeTo())
                                                            .param("volumeValue", String.valueOf(volumeRequestModel.getVolumeValue()))
                                                            .param("studentResponse", String.valueOf(volumeRequestModel.getStudentResponse()))
                                                                                                                                                    ).andExpect(volResponseModel)
                                                                                                                                                            .andExpect(view().name("VolumeResults"))
                                                                                                                                                            .andExpect(ok);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testVolumeConversionEndPointToCups() throws Exception{

        try {

            VolumeRequestModel volumeRequestModel = new VolumeRequestModel();
            volumeRequestModel.setVolumeFrom("Gallon");
            volumeRequestModel.setVolumeValue(10);
            volumeRequestModel.setVolumeTo("Cups");
            volumeRequestModel.setStudentResponse(73.8);

            VolumeResponseModel volumeResponseModel = new VolumeResponseModel();
            volumeResponseModel.setVolumeFrom("Gallon");
            volumeResponseModel.setInitialVolumeValue(10);
            volumeResponseModel.setConvertedVolumeValue(160);
            volumeResponseModel.setVolumeTo("Cups");
            volumeResponseModel.setStudentResponse(165.2);
            volumeResponseModel.setResponseValidator("incorrect");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher volResponseModel = MockMvcResultMatchers.model().attribute("VolumeResponseModel", volumeResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/volumeResults.html");

            mockMvc.perform(post("/volumeConversion")
                                                            .param("volumeFrom", volumeRequestModel.getVolumeFrom())
                                                            .param("volumeTo", volumeRequestModel.getVolumeTo())
                                                            .param("volumeValue", String.valueOf(volumeRequestModel.getVolumeValue()))
                                                            .param("studentResponse", String.valueOf(volumeRequestModel.getStudentResponse()))
                                                                                                                                                    ).andExpect(volResponseModel)
                                                                                                                                                            .andExpect(view().name("VolumeResults"))
                                                                                                                                                            .andExpect(ok);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testVolumeConversionEndPointToGallons() throws Exception{

        try {

            VolumeRequestModel volumeRequestModel = new VolumeRequestModel();
            volumeRequestModel.setVolumeFrom("Liters");
            volumeRequestModel.setVolumeValue(10);
            volumeRequestModel.setVolumeTo("Gallons");
            volumeRequestModel.setStudentResponse(2.8);

            VolumeResponseModel volumeResponseModel = new VolumeResponseModel();
            volumeResponseModel.setVolumeFrom("Liters");
            volumeResponseModel.setInitialVolumeValue(10);
            volumeResponseModel.setConvertedVolumeValue(2.6);
            volumeResponseModel.setVolumeTo("Gallons");
            volumeResponseModel.setStudentResponse(2.8);
            volumeResponseModel.setResponseValidator("incorrect");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher volResponseModel = MockMvcResultMatchers.model().attribute("VolumeResponseModel", volumeResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/volumeResults.html");

            mockMvc.perform(post("/volumeConversion")
                                                            .param("volumeFrom", volumeRequestModel.getVolumeFrom())
                                                            .param("volumeTo", volumeRequestModel.getVolumeTo())
                                                            .param("volumeValue", String.valueOf(volumeRequestModel.getVolumeValue()))
                                                            .param("studentResponse", String.valueOf(volumeRequestModel.getStudentResponse()))
                                                                                                                                                    ).andExpect(volResponseModel)
                                                                                                                                                            .andExpect(view().name("VolumeResults"))
                                                                                                                                                            .andExpect(ok);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testVolumeConversionEndPointToLiters() throws Exception{

        try {

            VolumeRequestModel volumeRequestModel = new VolumeRequestModel();
            volumeRequestModel.setVolumeFrom("Cups");
            volumeRequestModel.setVolumeValue(10);
            volumeRequestModel.setVolumeTo("Liters");
            volumeRequestModel.setStudentResponse(2.659);

            VolumeResponseModel volumeResponseModel = new VolumeResponseModel();
            volumeResponseModel.setVolumeFrom("Cups");
            volumeResponseModel.setInitialVolumeValue(10);
            volumeResponseModel.setConvertedVolumeValue(2.4);
            volumeResponseModel.setVolumeTo("Liters");
            volumeResponseModel.setStudentResponse(2.7);
            volumeResponseModel.setResponseValidator("incorrect");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher volResponseModel = MockMvcResultMatchers.model().attribute("VolumeResponseModel", volumeResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/volumeResults.html");

            mockMvc.perform(post("/volumeConversion")
                                                            .param("volumeFrom", volumeRequestModel.getVolumeFrom())
                                                            .param("volumeTo", volumeRequestModel.getVolumeTo())
                                                            .param("volumeValue", String.valueOf(volumeRequestModel.getVolumeValue()))
                                                            .param("studentResponse", String.valueOf(volumeRequestModel.getStudentResponse()))
                                                                                                                                                    ).andExpect(volResponseModel)
                                                                                                                                                            .andExpect(view().name("VolumeResults"))
                                                                                                                                                            .andExpect(ok);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void testVolumeConversionEndPointToTablespoons() throws Exception{

        try {

            VolumeRequestModel volumeRequestModel = new VolumeRequestModel();
            volumeRequestModel.setVolumeFrom("Cups");
            volumeRequestModel.setVolumeValue(10);
            volumeRequestModel.setVolumeTo("Tablespoons");
            volumeRequestModel.setStudentResponse(12);

            VolumeResponseModel volumeResponseModel = new VolumeResponseModel();
            volumeResponseModel.setVolumeFrom("Cups");
            volumeResponseModel.setInitialVolumeValue(10);
            volumeResponseModel.setConvertedVolumeValue(160);
            volumeResponseModel.setVolumeTo("Tablespoons");
            volumeResponseModel.setStudentResponse(12);
            volumeResponseModel.setResponseValidator("incorrect");

            ResultMatcher ok = MockMvcResultMatchers.status().isOk();
            ResultMatcher volResponseModel = MockMvcResultMatchers.model().attribute("VolumeResponseModel", volumeResponseModel);
            ResultMatcher redirectedUrl = MockMvcResultMatchers.redirectedUrl("http://localhost:8080/volumeResults.html");

            mockMvc.perform(post("/volumeConversion")
                                                            .param("volumeFrom", volumeRequestModel.getVolumeFrom())
                                                            .param("volumeTo", volumeRequestModel.getVolumeTo())
                                                            .param("volumeValue", String.valueOf(volumeRequestModel.getVolumeValue()))
                                                            .param("studentResponse", String.valueOf(volumeRequestModel.getStudentResponse()))
                                                                                                                                                ).andExpect(volResponseModel)
                                                                                                                                                        .andExpect(view().name("VolumeResults"))
                                                                                                                                                        .andExpect(ok);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}