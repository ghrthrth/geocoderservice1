package com.geocoderservice.core.services;

import com.geocoderservice.core.model.Otvet;
import com.geocoderservice.core.repositories.OtvetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OtvetServiceImpl implements OtvetService {

    private OtvetRepository otvetRepository;


    @Override
    public Otvet getOtvet(Long id) {
        return otvetRepository.findById(id).get();
    }
}
