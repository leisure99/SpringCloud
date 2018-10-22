package com.springfeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String feignSayHi(String name) {
        return "error 错误";
    }
}
