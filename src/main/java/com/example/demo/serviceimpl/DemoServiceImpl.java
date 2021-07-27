package com.example.demo.serviceimpl;

import com.example.demo.mappers.DemoMapper;
import com.example.demo.models.Demo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoMapper demoMapper;

    @Override
    public Demo getDemo(Long id) {
        return demoMapper.getDemo(id);
    }
}
