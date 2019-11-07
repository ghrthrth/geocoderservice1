package com.geocoderservice.core.controllers;

import com.geocoderservice.core.services.OtvetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.geocoderservice.core.model.Otvet;

@RestController
@RequiredArgsConstructor
public class SomeControllers {

    private OtvetService otvetService;


    @GetMapping("/hello/{id}")
    public Otvet sayHello(@PathVariable Long id){
        return otvetService.getOtvet(id);


    }
}
