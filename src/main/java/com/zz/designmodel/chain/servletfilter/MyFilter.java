package com.zz.designmodel.chain.servletfilter;

import org.apache.catalina.core.ApplicationFilterConfig;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: zengzhen
 * @Date: 2019/6/2 13:53
 * @Version 1.0
 */
public class MyFilter implements FilterChain {
	private int pos = 0; //当前执行filter的offset
	private int n; //当前filter的数量
	private ApplicationFilterConfig[] filters;  //filter配置类，通过getFilter()方法获取Filter
	private Servlet servlet;
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException, ServletException {
		if (pos < n) {
			ApplicationFilterConfig filterConfig = filters[pos++];
//			Filter filter = filterConfig.getFilter();
//			filter.doFilter(servletRequest, servletResponse, this);
		} else {
			// filter都处理完毕后，执行servlet
			servlet.service(servletRequest, servletResponse);
		}
	}
}
