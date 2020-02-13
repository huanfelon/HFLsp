package com.zb.sp.controller;

import com.zb.sp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

//表示所有方法都返回JSON格式，与@Controller，@ResponseBody
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/buy")
    public String Hello(){
        System.out.println("HELLO,SPRING CLOUD");
        return "sp:购买了一件商品";
    }

    @RequestMapping("/search")
    public List<Map> search(){
        System.out.println(userService.search(null)+"SEARCH");
        return userService.search(null);
    }


    @RequestMapping("/findByName")
    public List<Map> findByName(Model model, @RequestParam()Map map){
        model.addAttribute("users",userService.findByName(map));
        System.out.println("FINDBYNAME:"+userService.search(map));
        System.out.println(map.get("userName"));
        return userService.findByName(map);
    }
}
