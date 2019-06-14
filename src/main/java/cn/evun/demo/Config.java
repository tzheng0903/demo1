package cn.evun.demo;

import cn.evun.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
public class Config {
    @Bean
    public Person person(){
        return new Person("tzheng",123);
    }
}
