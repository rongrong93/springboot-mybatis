package sprintboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lirong"})
@MapperScan(value="com.lirong.dao")
public class App {
	
	public Runnable createRunnable(){
		
		return () -> {};
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
