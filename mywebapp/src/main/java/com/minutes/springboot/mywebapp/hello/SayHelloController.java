package com.minutes.springboot.mywebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody  //Bu anotasyon, bir Java metodunun döndürdüğü değerin HTTP çıktısı olarak gönderilmesini sağlamak için kullanılır.
	public String  sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody  
	public String  sayHelloHtml() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page</title>");
		sb.append("<head>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	//JSP-JAVA SERVER PAGES
	@RequestMapping("say-hello-jsp") 
	public String  sayHelloJsp() {
		return "sayHello";
	}

}
