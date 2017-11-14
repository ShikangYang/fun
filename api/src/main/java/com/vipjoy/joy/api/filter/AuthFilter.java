package com.vipjoy.joy.api.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
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
        logger.info("init");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String url = request.getRequestURI();

//        String authorization = request.getHeader(HTTP_HEADER_TOKEN);
//        if (StringUtils.isEmpty(authorization)) {
//            response.sendError(HttpStatus.UNAUTHORIZED.value(), "URL not found"); //没有找到Authorization
//            return;
//        }
        chain.doFilter(req, resp);

    }

    @Override
    public void destroy() {

    }


}
