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


@RestController
@RequestMapping("/otvet")
public class OtvetController {

    private final OtvetService service;

    @Autowired
    public OtvetController(OtvetService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Otvet> save(@RequestBody Otvet otvet) {
        return service.save(otvet).map(u -> new ResponseEntity<>(u, HttpStatus.OK))
                .orElseThrow(() -> new UserException(
                        String.format(ErrorType.Otvet_NOT_SAVED.getDescription(), otvet.toString())
                ));
    }

    String query = " insert into otvet (adress, dolgota, shirota)"  + " values (arg1,arg2,arg3)";
    //arg с клавиатуры будем вводить в файле,где создаем сущность(наши долгота и широта,или адресс)
}
