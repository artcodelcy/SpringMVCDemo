package com.atguigu.springmvc.views;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

@Component  //注入到容器中去
public class HelloView implements View{

	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override  //渲染视图
	public void render(Map<String, ?> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//如何把这句话搞到页面上呢？ 视图解析器 自定义配置
		response.getWriter().print("hello view, time: " + new Date()); 
	}

}
