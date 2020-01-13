package com.hss.common;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Locale;

/**
 * @ProjectName: MySSMDemo
 * @Package: com.hss.common
 * @ClassName: I18NFilter
 * @Description: java类作用描述
 * @Author: hss
 * @Create_Date: 2020/1/13 22:15
 * @Update_By:
 * @Update_Date: 2020/1/13 22:15
 * U.H. All Rights Reserved.
 */
public class I18NFilter implements Filter {
    private static final String COOKIE_LANGUAGE = "cookie_language";
    private static final String SYSTEM_LANGUAGE = "system_language";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String systemLanguage = getSystemLanguage(httpServletRequest);
        request.setAttribute(SYSTEM_LANGUAGE, systemLanguage);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("init....");
    }

    private String getSystemLanguage(HttpServletRequest request) {
        String systemLanguage = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (COOKIE_LANGUAGE.equals(cookie.getName())) {
                    systemLanguage = cookie.getValue();
                    break;
                }
            }
        }

        if (systemLanguage == null || "".equals(systemLanguage)) {
            systemLanguage = request.getLocale().toString();
        }
        if (systemLanguage == null || "".equals(systemLanguage)) {
            systemLanguage = Locale.getDefault().toString();
        }
        return systemLanguage;
    }
}
