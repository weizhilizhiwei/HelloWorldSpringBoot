package com.lizw.cn.controller;

import com.lizw.cn.privstate.PrivStateVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyBootController {


    @GetMapping("/index")
        public String index() {
        return "privacyState";
    }


    @PostMapping("/getPrivacyState")
    @ResponseBody
    public String hello() {
        String htmlContent = "<html>\n" +
                "\t<header></header>\n" +
                "<body>\n" +
                "\t<p>\n" +
                "\t\t<h1 style=\"background-color:#FFFFFF;font-family:&quot;font-size:16px;\">\n" +
                "\t\t\t1、隐私申明\n" +
                "\t\t</h1>\n" +
                "\t\t<p class=\"\" style=\"font-size:16px;background-color:#FFFFFF;font-family:&quot;\">\n" +
                "\t\t\t我们十分重视你的隐私。 本隐私声明阐述了 Microsoft 处理的个人数据以及 Microsoft 处理个人数据的方式和目的。\n" +
                "\t\t</p>\n" +
                "\t\t<p style=\"font-size:16px;background-color:#FFFFFF;font-family:&quot;\">\n" +
                "\t\t\tMicrosoft 提供<span style=\"background-color:#E53333;\">了多种产品，其中包括用于帮助</span>在全球范围内运营企业的服务器产品、家用设备、学生在学校使用的软件，以及开发人员用于创建和托管下一代产品的服务。 本声明中所提到的 Microsoft 产品包括 Micr<span style=\"color:#E53333;\">osoft 服务、网站、应用、软</span>件、服务器和设备\n" +
                "\t\t</p>\n" +
                "\t</p>\n" +
                "</body>";
        return htmlContent;
    }

    @PostMapping("/postPrivacyState")
    @ResponseBody
    public String helloSubmit(@ModelAttribute PrivStateVo greeting) {
        if (greeting.getId() == 100) {
            return "123";
        } else
            return "result";
    }

}
