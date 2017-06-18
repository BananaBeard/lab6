package com.kovalenko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PisosController {

    @RequestMapping("/pisos")
    public ModelAndView realPisos() {
        return new ModelAndView("pisos");
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody String test(@RequestParam String first, @RequestParam String second){
        int sum = Integer.parseInt(first) + Integer.parseInt(second);

        return first + " + " + second + " = " + sum;
    }
}
