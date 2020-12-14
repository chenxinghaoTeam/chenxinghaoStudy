package sun.example.demo.dao;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component//注入到spring 中 否则 无法注入的
//name为生产者提供的服务名称
@FeignClient(name = "service-springbootForMybatis" )
//@Mapper
public interface EurekaClient {
	
	
	@RequestMapping("/cxh")
	public List<Map<String, Object>> cxh(Map<String, Object>param);
}
