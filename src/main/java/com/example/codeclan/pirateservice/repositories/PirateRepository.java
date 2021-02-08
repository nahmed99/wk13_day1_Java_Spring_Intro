package com.example.codeclan.pirateservice.repositories;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// extends the japRepository for Pirate objects, with id (of type Long)
// to distinguish them - uniquely identify each Pirate object.

// This class will inherit all that it requires from JpaRepository...Spring
// will implement this interface, so we won't need to.

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {
}
