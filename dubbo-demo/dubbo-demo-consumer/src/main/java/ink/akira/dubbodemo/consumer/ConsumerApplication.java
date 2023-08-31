package ink.akira.dubbodemo.consumer;

import ink.akira.dubbodemo.api.req.DemoReq;
import ink.akira.dubbodemo.api.resp.DemoResp;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ink.akira.dubbodemo.api.service.DemoService;

@SpringBootApplication
public class ConsumerApplication implements CommandLineRunner {
    @DubboReference
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DemoReq demoReq = new DemoReq();
        demoReq.setId(1);
        DemoResp query = demoService.query(demoReq);
        System.out.println(query);
    }
}
