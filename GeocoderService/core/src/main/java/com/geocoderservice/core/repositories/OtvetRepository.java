package com.geocoderservice.core.repositories;

import com.geocoderservice.core.model.Otvet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtvetRepository extends CrudRepository<Otvet, Long> {

}
