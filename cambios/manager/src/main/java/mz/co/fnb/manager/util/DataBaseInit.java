package mz.co.fnb.manager.util;

import mz.co.fnb.services.util.DatabaseInit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInit {

    @Bean
    public CommandLineRunner dummyData(DatabaseInit databaseInit) {
        return (args) -> {
            databaseInit.dummyData();
        };
    }
}
