package com.lexelpro.dao.impl;

import com.lexelpro.dao.javabeanDAo;
import com.lexelpro.entity.javabean;
import com.lexelpro.util.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 傅華暘 on 2016/9/30.
 */
@Repository
public class javabeanDAOimpl implements javabeanDAo {

    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public javabean  idbean(int id){
     return hibernateUtil.fetchById(id,javabean.class);
    }

    @Override
    public List<javabean> bean(){
       return hibernateUtil.fetchAll(javabean.class);
    }

    @Override
    public List<javabean> getbyID(String id){
        return hibernateUtil.fetchById(id);
    }
}
