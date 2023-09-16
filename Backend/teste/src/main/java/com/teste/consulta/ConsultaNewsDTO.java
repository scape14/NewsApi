package com.teste.consulta;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaNewsDTO {
	private String status;
	private String totalResults;
	private ArrayList<Object> articles;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public ArrayList<Object> getArticles() {
		return articles;
	}
	public void setArticles(ArrayList<Object> articles) {
		this.articles = articles;
	}

	
	
}
