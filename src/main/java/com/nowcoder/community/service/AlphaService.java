package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    /*public AlphaService(){
        System.out.println("Instanciliaztion AlphaService");
    }

    @PostConstruct
    public void init(){
        System.out.println("Initialization AplhaService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy AlphaService");
    }
    //模拟查询业务
    public String find(){
        return alphaDao.select();
    }*/
}
