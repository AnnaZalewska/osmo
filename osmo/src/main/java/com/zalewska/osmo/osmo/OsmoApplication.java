package com.zalewska.osmo.osmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class OsmoApplication {

	@RequestMapping("/")
	@ResponseBody
    public String index(){
        return "<h1>Hello World!</h1>";
    }
	public static void main(String[] args) {
		SpringApplication.run(OsmoApplication.class, args);
	}
}
