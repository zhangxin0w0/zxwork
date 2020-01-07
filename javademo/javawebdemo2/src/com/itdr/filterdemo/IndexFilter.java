package com.itdr.filterdemo;

import javax.lang.model.element.VariableElement;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * ClassName: ${NAME}
 * 日期: 2020/1/6 15:04
 *
 * @author Air张
 * @since JDK 1.8
 */
@WebFilter(filterName = "IndexFilter",value = "/*")
public class IndexFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
//        System.out.println("请求被拦截下来了！");
//        chain.doFilter(request, response);
//
//        String serverName = request.getServerName();
//        int serverPort = request.getServerPort();
//        String localAddr = request.getLocalAddr();
//        String localName = request.getLocalName();
//        int localPort = request.getLocalPort();
//        String scheme = request.getScheme();
        String remoteAddr = request.getRemoteAddr();
//        String remoteHost = request.getRemoteHost();
//        int remotePort = request.getRemotePort();
//        System.out.println("================");
//        System.out.println(serverName);
//        System.out.println(serverPort);
//        System.out.println(localAddr);
//        System.out.println(localName);
//        System.out.println(localPort);
//        System.out.println(scheme);
//        System.out.println(remoteAddr);
//        System.out.println(remoteHost);
//        System.out.println(remotePort);
//        System.out.println("================");

      /*  String[] split = remoteAddr.split("\\.");
        if(split.length > 1){
            if(!split[3].equals("149")){
                response.getWriter().write("bye~");
            }
        } else{
            chain.doFilter(request, response);
        }*/

        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
