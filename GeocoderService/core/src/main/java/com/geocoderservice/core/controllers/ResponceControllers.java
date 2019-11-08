package com.geocoderservice.core.controllers;

import com.geocoderservice.core.services.OtvetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.geocoderservice.core.model.Otvet;

@RestController
@RequestMapping("/responce")
public class ResponceController {

    private final ResponceService service;

    @Autowired
    public ResponceController(ResponceService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Otvet> save(@RequestBody Responce responce) {
                .orElseGet((service.save(responce).map(u -> new ResponseEntity<>(u, HttpStatus.OK)) )) 
 -> new ResponceException(
                        String.format(ErrorType.Responce_NOT_SAVED.getDescription(), responce.toString());
    }

    String query = " insert into otvet (adress, dolgota, shirota)"  + " values (arg1,arg2,arg3)";
    //arg с клавиатуры будем вводить в файле,где создаем сущность(наши долгота и широта,или адресс)

