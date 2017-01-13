package com.banregio.instantor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VICTOR VALDEZ [gerson] on 12/01/17.
 */

@RestController
public class InstantorController {

    @RequestMapping(value = "/test")
    public String inicioInstantor(){
        return "test";
    }

}
