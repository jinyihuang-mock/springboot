package com.wiki.demo.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wiki")
@SpringBootApplication
public class DemoApplication {

//    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        SpringApplication app = new SpringApplication(DemoApplication.class);
//        Environment env = app.run(args).getEnvironment();
//        LOG.info("启动成功");
//        LOG.info("地址：/http://127.0.0.1:{}");
//        LOG.info( env.getProperty("server.port"));
    }

}
