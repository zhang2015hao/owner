package main.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@EnableAutoConfiguration
public class CoreStyle {

	@RequestMapping("/hello")
	@ResponseBody
	String hello(){
		return "hello world!";
	}
	public static void main(String[] args) {
		SpringApplication.run(new Object[]{CoreStyle.class,CoreStyle2.class}, args);
		
	}
}
