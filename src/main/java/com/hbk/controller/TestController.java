package com.hbk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IT-USER1 on 2017-03-24.
 */
@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping(method= RequestMethod.GET)
    public String initTest(Model model) {
        return "test";
    }
}