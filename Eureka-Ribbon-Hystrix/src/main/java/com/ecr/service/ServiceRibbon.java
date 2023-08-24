package main.java.com.ecr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import com.ecr.entity.JTEntity;
import org.springframework.web.bind.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ServiceRibbon {
    @Autowired
    private RestTemplate rt;

    @HystrixCommand(fallback="fallbackgetprodbyid")
    public JTEntity getproductbyId(int id){
        JTEntity jte=rt.getForObject("http://application/dev/js/show/"+id,JTEntity.class); //http://product-service/js/show/{id}
        return jte;
    }

    public JTEntity fallbackgetprodbyid(int id){
        //any business logic
        return new JTEntity(id,"Monitor",5566);
    }
}
