package mz.co.fnb.manager.config;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {ManagerConfig.class, ManagerConfigTest.class})
public abstract class AbstractManagerTest {

}
