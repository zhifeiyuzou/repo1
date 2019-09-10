package com.itcast.crm.service.impl;

import com.itcast.crm.dao.CrmDao;
import com.itcast.crm.domain.Student;
import com.itcast.crm.service.CrmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CrmServiceImpl implements CrmService {
    @Autowired
    private CrmDao crmDao;
    @Override
    public List<Student> getStudentList() {
        return crmDao.getStudentList();
    }
}
