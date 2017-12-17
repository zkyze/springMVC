package com.controller;

import com.object.Admin;
import com.object.User;
import com.object.UserListForm;
import com.object.UserMapForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zkyze on 2017/9/27.
 */
@Controller
public class TestController {

    //todo http://localhost:8080/springMVC/baseType.do?age=10
    @RequestMapping(value = "baseType.do")
    @ResponseBody
    public String baseType(@RequestParam("xage") int age){
        return "age:" + age;
    }

    //todo http://localhost:8080/springMVC/baseType2.do?age=10
    @RequestMapping(value = "baseType2.do")
    @ResponseBody
    public String baseType2( Integer age){
        return "age:" + age;
    }

    //todo http://localhost:8080/springMVC/array.do?name=Tom&name=Lucy&name=Jim
    @RequestMapping(value = "array.do")
    @ResponseBody
    public String array(String[] name){
        StringBuilder sb = new StringBuilder();
        for(String item : name){
            sb.append(item).append(" ");
        }
        return sb.toString();
    }

    //todo http://localhost:8080/springMVC/object.do?name=Tom&age=10
    //todo http://localhost:8080/springMVC/object.do?name=Tom&age=10&contactInfo.phone=10086
    //todo http://localhost:8080/springMVC/object.do?user.name=Tom&admin.name=Jim&age=10
    @RequestMapping(value = "object.do")
    @ResponseBody
    public String object(User user, Admin admin){
        return user.toString() + " " + admin.toString();
    }

    @InitBinder("user")
    public void initUser(WebDataBinder binder){
        binder.setFieldDefaultPrefix("user.");
    }
    @InitBinder("admin")
    public void initAdmin(WebDataBinder binder){
        binder.setFieldDefaultPrefix("admin.");
    }

    //todo http://localhost:8080/springMVC/list.do?users[0].name=Tom&users[1].name=Jim
    //todo http://localhost:8080/springMVC/list.do?users[0].name=Tom&users[8].name=Jim
    @RequestMapping(value = "list.do")
    @ResponseBody
    public String list(UserListForm userListForm){
        return "listSize=" + userListForm.getUsers().size() + " " +userListForm.toString();
    }

    //todo http://localhost:8080/springMVC/map.do?users["X"].name=tom&users["X"].age=10&users["Y"].name=Jim
    @RequestMapping(value = "map.do")
    @ResponseBody
    public String map(UserMapForm userMapForm){
        return userMapForm.toString();
    }

    @RequestMapping(value = "json.do")
    @ResponseBody
    public String json(@RequestBody User user){
        return user.toString();
    }

}


























