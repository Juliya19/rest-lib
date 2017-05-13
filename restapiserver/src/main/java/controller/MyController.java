package controller;

import entity.Point;
import org.springframework.web.bind.annotation.*;
import service.CalculateService;

@RestController
public class MyController {

    @RequestMapping(value = "/sum", method = RequestMethod.POST)
    public int returnSumm(@RequestBody Point point){
        return new CalculateService().calculateSum(point.getA(), point.getB());
    }
}

