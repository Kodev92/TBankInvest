package com.kodev.springTutorial.figi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FigiService {

    private final FigiRepository figiRepository;

    @Autowired
    public FigiService(FigiRepository figiRepository) {
        this.figiRepository = figiRepository;
    }

    public List<Figi> getFigi(){
        return figiRepository.findAll();
    }
}
