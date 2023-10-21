package joice.lima.uolhostbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.Getter;

@Service
@Getter
public class CodinameService {
    
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;
}
