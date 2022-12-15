package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Baker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BakerRepository extends CrudRepository<Baker, Long> {

    public Optional<Baker> findById(Long id);

}
