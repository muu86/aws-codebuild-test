package com.mj.fargatealbsamle;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        String ip;
        try {
            ip = Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return e.getMessage();
        }
        return "welcome, AWS Fargate-ALB sample!! "
            + "Here is " + ip;
    }
}
