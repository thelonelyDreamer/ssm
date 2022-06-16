package com.felixwc.mvc.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * in order to learn java!
 * created at 2022/6/15 17:55
 *
 * @author felixwc
 */
@WebFilter(filterName = "my1",urlPatterns = "/*")
@Order(1)
@Component
public class MyFilter1 implements Filter {
    @Override
    public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain filterChain
    ) throws IOException, ServletException {
        System.out.println("filer1");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
