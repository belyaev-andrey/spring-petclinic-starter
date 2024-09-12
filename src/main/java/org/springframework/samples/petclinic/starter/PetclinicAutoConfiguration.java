package org.springframework.samples.petclinic.starter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class PetclinicAutoConfiguration {

    @Bean
    public PetClinicGreetingsService petClinicGreetingsService() {
        return new PetClinicGreetingsService();
    }

}
