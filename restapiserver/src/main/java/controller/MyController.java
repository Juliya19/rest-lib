package controller;

import org.springframework.web.bind.annotation.*;
import service.CalculateService;

@RestController
public class MyController {

    /*@ResponseBody
    @PostMapping(value = "/summ")
    public int returnSumm(@RequestBody Point point){
        return point.getA() + point.getB();
    }*/

    @ResponseBody
    @GetMapping(value = "/{a}/plus/{b}")
    public int returnSumm(@PathVariable int a, @PathVariable int b){
        return new CalculateService().calculateSum(a, b);
    }
}

