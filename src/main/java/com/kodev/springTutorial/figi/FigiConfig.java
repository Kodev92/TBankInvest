package com.kodev.springTutorial.figi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FigiConfig {

    @Bean
    CommandLineRunner commandLineRunner(FigiRepository repository) {
        return args -> {
            Figi figiIBM = new Figi (
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
            );

            Figi figiIBM2 = new Figi (
                    "BBG000BLNNH6_2",
                    "Common Stock",
                    "Equity",
                    "IBM_2",
                    "INTL BUSINESS MACHINES CORP",
                    "US",
                    "BBG001S5S399",
                    "BBG000BLNNH6",
                    "Common Stock",
                    "IBM_2"
            );

            repository.saveAll(
                    List.of(figiIBM,figiIBM2)
            );

        };
    }
}
