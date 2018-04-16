package com.tina.controller;


import com.tina.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/6.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/index")
    public String index(Model model) {
        Person single = new Person("hyj", 21);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("dlp", 21);
        Person p2 = new Person("tq", 21);
        Person p3 = new Person("mk", 21);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }
}