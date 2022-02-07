package com.kodev.springTutorial.figi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FigiRepository
        extends JpaRepository<Figi, Long> {
}
