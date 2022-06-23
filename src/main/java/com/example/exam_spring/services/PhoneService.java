package com.example.exam_spring.services;

import com.example.exam_spring.DAO.PhoneDAO;
import com.example.exam_spring.models.Phone;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {
    private PhoneDAO phoneRepository;

    @Autowired
    public PhoneService(PhoneDAO phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public Phone findEntityById(int id) {
        if (id != 0)
            return phoneRepository.findById(id);
        else
            return null;
    }

    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    public boolean delete(int id) {
        return phoneRepository.deleteById(id);
    }

    public boolean delete(Phone phone) {
        return phoneRepository.deleteById(phone.getId());
    }

    public void create(String phoneNumber) {
        Phone phone = new Phone();
        phone.setNumber(phoneNumber);
        phoneRepository.save(phone);
    }

    public Phone update(Phone phone) {
        Phone my_phone = phoneRepository.findById(phone.getId());
        my_phone.setNumber("89045070390");
        return phone;
    }
}
