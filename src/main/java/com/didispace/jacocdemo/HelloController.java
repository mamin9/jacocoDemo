package com.didispace.jacocdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: mam
 * @Date: 2022/03/11/15:38
 * @Description:
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
        public String hello(){
            return "Hi~~~how are you~~~";
        }
    }

