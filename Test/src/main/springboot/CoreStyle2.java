package main.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@EnableAutoConfiguration
public class CoreStyle2 {

	@RequestMapping("/hello2")
	@ResponseBody
	String hello(){
		return "hello world2!";
	}
	
}
