package com.banregio.instantor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by VICTOR VALDEZ [gerson] on 12/01/17.
 */

@Controller
public class InstantorController {

    @RequestMapping(value = "/test")
    public ModelAndView inicioInstantor(){
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC </h3>.java</div><br><br>";
        return new ModelAndView("test", "message", message);
    }

}
