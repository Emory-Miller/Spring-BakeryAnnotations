package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Baker;
import com.zipcodewilmington.bakery.models.Muffin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MuffinRepository extends CrudRepository<Muffin, Long> {

    public Optional<Muffin> findById(Long id);
}
