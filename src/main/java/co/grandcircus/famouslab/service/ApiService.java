package co.grandcircus.famouslab.service;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.famouslab.entity.FamousLabResponse;
import co.grandcircus.famouslab.entity.Innovator;
import co.grandcircus.famouslab.entity.Inventor;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public List<Inventor> getNerds(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		FamousLabResponse response = restTemplate.getForObject(url, FamousLabResponse.class);
		return response.getInventors();
	}

	public List<Innovator> getAllNerds() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		FamousLabResponse response = restTemplate.getForObject(url, FamousLabResponse.class);
		return response.getInnovators();
	}
}
