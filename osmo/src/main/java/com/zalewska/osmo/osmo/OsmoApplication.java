package com.zalewska.osmo.osmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.zalewska.osmo.osmo.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.zalewska.osmo.osmo"})
public class OsmoApplication {
	public static void main(String[] args) {
		SpringApplication.run(OsmoApplication.class, args);
	}
}
