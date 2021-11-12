package mz.co.fnb.services.config;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {ServiceConfig.class, ServiceConfigTest.class})
public abstract class AbstractServiceTest {

}
