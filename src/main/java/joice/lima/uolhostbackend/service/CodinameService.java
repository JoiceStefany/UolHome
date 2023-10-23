package joice.lima.uolhostbackend.service;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import lombok.Getter;

@Service
@Getter
public class CodinameService {
    
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    private List<String> avangersCondinameList = new ArrayList<>();

    ObjectMapper objectMapper = new ObjectMapper();

    public void loadJsonData(){
        
        try {
            String condinameResponse = restTemplate.getForObject(env.getProperty("avangers"), String.class);
            JsonNode jsonNode = objectMapper.readTree(condinameResponse);

            ArrayNode avangers = (ArrayNode) jsonNode.get("vingadores");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
