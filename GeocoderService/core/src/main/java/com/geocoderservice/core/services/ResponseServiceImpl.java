package com.geocoderservice.core.services;

import com.geocoderservice.core.model.Otvet;
import com.geocoderservice.core.repositories.OtvetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.common.collect.Maps;


@Service
public class ResponceServiceImpl implements ResponceService {

    private final ResponceRepository responceRepository;

    @Autowired
    public ResponceServiceImpl(ResponceRepository responceRepository) {
        this.responceRepository = responceRepository;
    }

    @Override
    public Optional<Responce> save(Responce responce) {
        return Optional.of(ResponceRepository.save(responce));
    }
}
