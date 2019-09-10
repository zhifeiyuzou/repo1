package com.itcast.crm.dao;

import com.itcast.crm.domain.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CrmDao {
    @Select("select * from student")
    public List<Student> getStudentList();
}
