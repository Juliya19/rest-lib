package controller;

import entity.Point;
import org.springframework.web.client.RestTemplate;

public class MyController {

    private static final String URI = "http://localhost:8080/rest/sum";
    private RestTemplate restTemplate;

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public int getSum(int a, int b){
        return restTemplate.postForObject(URI, new Point(a, b), Integer.class);
    }

}
