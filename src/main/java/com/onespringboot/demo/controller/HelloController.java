package com.onespringboot.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: Pentacle
 * @Date: 2020/3/12
 * @Description: com.pentacle.firstspringbootprojrct.controller
 * @Version: 1.0
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {  //RequestParam请求参数（快捷键Ctrl + p 可以看到请求的参数是什么）
        model.addAttribute("name", name);
        return "hello"; //此处是去templates里找同名的HTML文件
    }
}
