package com.zzmx.learning.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);
    /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name", "Dear");
        return "index";
    }

}
