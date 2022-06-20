package com.example.applicationtest.repository;

import com.example.applicationtest.model.ordonnanceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdonnanceRepository extends JpaRepository<ordonnanceModel,Long> {
}
