package com.derrick.springbootfundamentals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

@SpringBootTest
class SpringbootfundamentalsApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(SpringbootfundamentalsApplicationTests.class);

    @Test
    void contextLoads() {
        Model model = new BindingAwareModelMap();
        log.info("The result" + model.asMap().get("applications"));
    }


}
