package com.main.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    
    private static final Logger logger = LoggerFactory.getLogger(DemoBean.class);

    public DemoBean() {
        logger.info("DemoBean instance created!");
    }
}
