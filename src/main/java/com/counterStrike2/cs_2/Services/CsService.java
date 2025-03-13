package com.counterStrike2.cs_2.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CsService {
    @Value("${cs.api.url}")
    private String apiURL;


    private final RestTemplate restTemplate=new RestTemplate();
    public String callCsApi(String endPoint){
        String url=apiURL+endPoint;
        return restTemplate.getForObject(url,String.class);
    }
}
