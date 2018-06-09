package com.example.logback;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by LiQian_Nice on 2018/6/9
 */
@RestController
@Api(value = "测试 Logback Controller",tags = "测试 Logback Controller",description="简单的API")
public class LogbackTestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackTestController.class);

    /**
     * 获取配置文件中的属性值
     */
    @Value("${app.name}")
    private String projectName;

    @GetMapping("/logback")
    @ApiOperation(value = "Logback具体用法", notes = "Logback具体用法")
    public String index() {
        /*
            logback.xml中指定的默认输出级别为INFO，所以低于INFO级别(DEBUG、TRACE)的日志不会输出
            级别排序为： TRACE < DEBUG < INFO < WARN < ERROR
         */
        LOGGER.info("{} -- This is a primary with logback., Current time {}.", projectName, new Date());
        LOGGER.trace("This level is TRACE.");
        LOGGER.debug("This level is DEBUG.");
        LOGGER.debug("This level is DEBUG.", LOGGER.isDebugEnabled());
        LOGGER.info("This level is INFO.");
        LOGGER.info("isInfoEnabled:" + LOGGER.isInfoEnabled());
        LOGGER.warn("This level is WARN.");
        LOGGER.error("This level is ERROR.");
        return "logback.";
    }
}
