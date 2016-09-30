package com.lexelpro.dao;

import com.lexelpro.entity.User;
import com.lexelpro.entity.javabean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 傅華暘 on 2016/9/30.
 */
public interface javabeanDAo {
    public javabean idbean(int id);
    public List<javabean> bean();
    public List<javabean> getbyID(String id);
    }
