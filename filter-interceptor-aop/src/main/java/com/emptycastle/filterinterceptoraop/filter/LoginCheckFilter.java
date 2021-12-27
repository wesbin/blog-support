package com.emptycastle.filterinterceptoraop.filter;

import javax.servlet.*;
import java.io.IOException;

public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // todo login 검증
    }
}
