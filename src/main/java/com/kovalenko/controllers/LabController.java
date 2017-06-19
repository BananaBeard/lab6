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
        String msg = "";

        int i = Integer.parseInt(step);
        double argument = Double.parseDouble(arg);
        boolean err = false;

        if (i % 1 != 0 || i <= 0) {
            err = true;
            msg += "Step must be > 0!!!";
        }

        if (argument < 0){
            err = true;
            msg += "Argument must be >= 0!!!";
        }

        if (err){
            return msg;
        }else {
            Function func = new Function(argument);
            return func.teylor(argument, i);
        }
    }
}
