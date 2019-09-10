package com.itcast.crm.controller;

import com.itcast.crm.domain.Student;
import com.itcast.crm.service.CrmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/crmController")
public class CrmController {
    @Autowired
    private CrmService crmService;
    @RequestMapping("getStudentList")
    public List<Student> getStudentList(ModelAndView modelAndView){
        return crmService.getStudentList();
    }
}
