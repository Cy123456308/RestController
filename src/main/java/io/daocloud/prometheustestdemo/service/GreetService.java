package io.daocloud.prometheustestdemo.service;
import io.daocloud.prometheustestdemo.domain.Greet;
import org.springframework.stereotype.Service;

@Service
public class GreetService {
    public Object greeting(){
        return new Greet("Hello");
    }
}
