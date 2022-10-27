package com.bradl3y.getapiendpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    //run CommandLineRunner beans and request HngMemberRepository
    @Bean
    CommandLineRunner initDatabase(HngMemberRepository repository) {

        //create entity and store
        return args -> {
            log.info("Preloading " + repository.save(new HngMember("bradl3y", true, 26, "Aspiring Backend Developer")));
        };
    }
}
