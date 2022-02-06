package com.kodev.springTutorial.figi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/figi")
public class FigiController {

    private final FigiService figiService;

    @Autowired
    public FigiController(FigiService figiService) {
        this.figiService = figiService;
    }

    @GetMapping
    public List<Figi> getFigi(){
        return figiService.getFigi();
    }


}
