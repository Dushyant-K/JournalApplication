package net.dushyant.journalApp.service;

import net.dushyant.journalApp.api.response.WeatherResponse;
import net.dushyant.journalApp.cache.AppCache;
import net.dushyant.journalApp.constants.Placeholders;
import net.dushyant.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//*-The process of converting json to pojo is called deserilazing

@Component
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;

    @Autowired
    private AppCache appCache;

    @Autowired
    private RestTemplate restTemplate;//Process http request and gives us a response

    public WeatherResponse getWeather(String city){
        String finalAPI = appCache.appCache.get(AppCache.keys.WEATHER_API.toString()).replace(Placeholders.CITY,city).replace(Placeholders.API_KEY,apiKey);
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);//*
        WeatherResponse body = response.getBody();
        return body;
    }

    //How to integrate post api calls from another source code
//    public WeatherResponse postWeather(String city){
//        String finalAPI = API.replace("CITY",city).replace("API_KEY",apiKey);
//        String requestBody = "{\n"+
//                "   \"userName\":\"ram\",\n"+
//                "   \"password\":\"ram\", \n" +
//                "}   ";
//
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.set("key", "value");
//        User user = User.builder().userName("Dushyant").password("Dushyant").build();
//        HttpEntity<User> httpEntity =  new HttpEntity<>(user,httpHeaders);
//        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.POST, httpEntity, WeatherResponse.class);//*
//        WeatherResponse body = response.getBody();
//        return body;
//    }

}

