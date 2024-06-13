package com.riwi.notas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.notas.domain.entities.User;

@Repository
public interface UserRespository extends JpaRepository< User, String>{
  
}
