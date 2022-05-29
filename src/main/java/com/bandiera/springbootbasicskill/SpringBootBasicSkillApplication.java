package com.bandiera.springbootbasicskill;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
//		exclude = WebMvcAutoConfiguration.class
//		excludeName = "org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration"
//		scanBasePackages = "com.bandiera.springbootbasicskill"
)
public class SpringBootBasicSkillApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicSkillApplication.class, args);
//		SpringApplication application = new SpringApplication(SpringBootBasicSkillApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);
	}

}
