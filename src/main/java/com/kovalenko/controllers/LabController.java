package com.kovalenko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LabController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody String test(@RequestParam String first, @RequestParam String second){
        int sum = Integer.parseInt(first) + Integer.parseInt(second);

        return first + " + " + second + " = " + sum;
    }
}
