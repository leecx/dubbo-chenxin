package com.chenxin.user.service.impl;

import com.chenxin.rpc.service.DemoService;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello"+name;
    }

}
