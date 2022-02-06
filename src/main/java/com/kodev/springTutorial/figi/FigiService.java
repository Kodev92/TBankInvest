package com.kodev.springTutorial.figi;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FigiService {


    public List<Figi> getFigi(){
        return List.of(
                new Figi(
                        1L,
                        "BBG000BLNNH6",
                        "Common Stock",
                        "Equity",
                        "IBM",
                        "INTL BUSINESS MACHINES CORP",
                        "US",
                        "BBG001S5S399",
                        "BBG000BLNNH6",
                        "Common Stock",
                        "IBM"
                ));
    }
}
