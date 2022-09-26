/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.onlinetutorialspoint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author chandu
 */
@Controller
@RequestMapping("/helloworld")
public class HelloWordController {
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        model.put("msg", "Welcone to Spring World !");
        return "index";
    }
}
