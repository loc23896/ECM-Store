package com.project.ecommerce.controller;

import com.project.ecommerce.consts.ApiPath;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class APIService {

    @GetMapping(value = ApiPath.PING)
    public String ping() {
        return "start ecommerce shop!!!!";
    }
}
