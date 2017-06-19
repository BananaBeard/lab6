package com.kovalenko.controllers;

import com.kovalenko.math.Function;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LabController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody String test(@RequestParam String arg, @RequestParam String step){
        int sum = Integer.parseInt(arg) + Integer.parseInt(step);

        int i = Integer.parseInt(step);


        Function func = new Function(Double.parseDouble(first));
        return func.teylor(Double.parseDouble(first), Integer.parseInt(second));

        //return first + " + " + second + " = " + sum;
    }
}
