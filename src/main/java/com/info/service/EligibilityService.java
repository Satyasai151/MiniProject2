package com.info.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.info.request.SearchRequest;
import com.info.response.SearchResponse;

public interface EligibilityService {
	public List<String> getUniquePlanNames();

	public List<String> getUniquePlanStatuses();

	public List<SearchResponse> search(SearchRequest request);

	public void generateExcel(HttpServletResponse response) throws IOException;

	public void generatePdf(HttpServletResponse response) throws IOException;

}
