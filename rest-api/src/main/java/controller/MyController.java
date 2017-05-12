package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MyController {

    private static final String URI_TEMPLATE = "http://localhost:8080/rest/%d/plus/%d";
    private RestTemplate restTemplate;

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public int getSum(int a, int b) {
        ResponseEntity<Integer> sum = restTemplate.getForEntity(String.format(URI_TEMPLATE, a, b), Integer.class);
        return sum.getBody();
    }

}
