package com.coca.fun.service.filter;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AuthFilter", urlPatterns = "/*")
public class AuthFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(AuthFilter.class);

    private static final String HTTP_HEADER_TOKEN = "Authorization";

    public AuthFilter() {
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        logger.info("init -->");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String url = request.getRequestURI();

        String authorization = request.getHeader(HTTP_HEADER_TOKEN);
        if (StringUtils.isEmpty(url)) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "URL not found"); //没有找到Authorization
            return;
        }
        logger.info("doFilter -->{}", url);
        chain.doFilter(req, resp);

    }

    @Override
    public void destroy() {

    }


}
