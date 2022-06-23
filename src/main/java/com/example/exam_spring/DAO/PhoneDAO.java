package com.example.exam_spring.DAO;

import com.example.exam_spring.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhoneDAO extends JpaRepository<Phone, Integer> {
    Phone findById(int id);
    boolean deleteById(int id);
}
