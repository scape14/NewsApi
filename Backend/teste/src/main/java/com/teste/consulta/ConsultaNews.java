package com.teste.consulta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulta-news")
@CrossOrigin(origins = "http://localhost:4200/") 
public class ConsultaNews {
	
	@GetMapping(value = "{apiKey}", produces = "application/json")
	public ConsultaNewsDTO consultaNews(@PathVariable("apiKey") String apiKey) {
		RestTemplate restTemplate = new RestTemplate();
		String country = "usa";
		String url = "https://newsapi.org/v2/everything?q=country="+country+"&apiKey=" + apiKey;
		ResponseEntity<ConsultaNewsDTO> rest = restTemplate.getForEntity(url, ConsultaNewsDTO.class);
		
		return rest.getBody();
	}

}
