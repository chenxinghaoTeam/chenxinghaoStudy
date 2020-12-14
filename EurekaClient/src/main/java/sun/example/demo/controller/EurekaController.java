package sun.example.demo.controller;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
  
  
@RestController
@RequestMapping("/eurekaClient")
public class EurekaController {

	//注入刚才交由spring托管的bean
    @Autowired
    RestTemplate restTemplate;
   
	@RequestMapping("/lists")
	public String sendStr(String string) {
	   return restTemplate.getForEntity("http://service-springbootForMybatis/controller/listu?string=", String.class).getBody();
	}
 
}
