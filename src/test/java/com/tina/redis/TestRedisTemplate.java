package com.tina.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Redis 测试类<br>
 * 版权: Copyright (c) 2011-2018<br>
 * 公司: 活力天汇<br>
 *
 * @author: 刘德咏<br>
 * @date: 2018-04-18<br>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisTemplate {
    private Logger logger = LoggerFactory.getLogger(TestRedisTemplate.class);

    @Autowired
    private StringRedisTemplate template;

    @Test
    public void testRedisAdd() {
        ValueOperations<String, String> opsForValue = template.opsForValue();
        opsForValue.set("tina", "test");
    }

    @Test
    public void testRedisGet() {
        logger.debug("--------------------------{}", template.opsForValue().get("tina"));
    }
}
