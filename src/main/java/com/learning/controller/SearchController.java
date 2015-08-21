package main.java.com.learning.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;



public class SearchController {
	
	@RequestMapping(value = "/search",method = RequestMethod.GET)
	public String getSearch() throws JsonProcessingException {
		return "search";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public @ResponseBody
	String doSearch(@RequestBody String searchJsonRequest, HttpServletRequest httpServletRequest) throws JsonProcessingException {
		String clientIP = httpServletRequest.getHeader("X-Forwarded-For");
		if (clientIP == null) {
			clientIP = httpServletRequest.getRemoteAddr();
		} else {
			clientIP = clientIP.contains(",") ? clientIP.split(",")[0] : clientIP;
		}
		return "abc";
	}

}
