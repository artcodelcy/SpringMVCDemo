package com.atguigu.springmvc.views;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

@Component  //ע�뵽������ȥ
public class HelloView implements View{

	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override  //��Ⱦ��ͼ
	public void render(Map<String, ?> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//��ΰ���仰�㵽ҳ�����أ� ��ͼ������ �Զ�������
		response.getWriter().print("hello view, time: " + new Date()); 
	}

}
