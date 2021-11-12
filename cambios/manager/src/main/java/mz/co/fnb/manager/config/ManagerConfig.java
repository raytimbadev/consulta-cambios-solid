package mz.co.fnb.manager.config;

import mz.co.fnb.services.config.ServiceConfig;
import mz.co.fnb.services.util.DatabaseInit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"mz.co.fnb.manager"})
@Import(ServiceConfig.class)
public class ManagerConfig {

}
