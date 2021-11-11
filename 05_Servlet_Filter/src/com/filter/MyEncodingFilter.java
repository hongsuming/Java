package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyEncodingFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("MyEncodingFilter.doFilter init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MyEncodingFilter.doFilter 요청");
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		System.out.println("MyEncodingFilter.doFileter 응답");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("MyEncodingFilter.doFilter init");
	}

}
