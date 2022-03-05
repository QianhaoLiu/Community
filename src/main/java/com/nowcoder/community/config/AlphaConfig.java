package com.nowcoder.community.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {

    //this is a submit test
    @Bean
    public SimpleDateFormat simpleDateFormate(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }


}
