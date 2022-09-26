/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinetutorialspoint.controllers;

import com.onlinetutorialspoint.model.LoginModel;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author chandrashekhar
 */
@Controller
@RequestMapping("login.htm")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(ModelMap modelMap) {
        modelMap.put("info", "Hello User");
        return "Login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submit(ModelMap modelMap, @ModelAttribute("loginModel") @Valid LoginModel loginModel) {
        System.out.println("in submit" + loginModel);
        String password = loginModel.getPassword();
        if (password != null && password.equals("onlinetutorialspoint")) {
            modelMap.put("userInfo", loginModel.getUserName());
            return "Home";
        } else {
            modelMap.put("error", "Invalid UserName / Password");
            return "Login";
        }

    }
}
