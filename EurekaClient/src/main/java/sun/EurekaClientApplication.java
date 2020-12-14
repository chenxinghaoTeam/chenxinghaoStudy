package sun;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaClientApplication {

	@Bean
	//实现负载均衡的注解
	@LoadBalanced
	public RestTemplate getRestTemplate(){
	    return new RestTemplate();
	}

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}