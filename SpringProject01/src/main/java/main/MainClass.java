package main;

import object.PencilIF;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:springBeanConfig.xml");
		
		PencilIF pencil = (PencilIF) ctx.getBean("pencil");		// 인터페이스 구현체  bean을 의존주입하여 인터페이스 생성
		pencil.use();
	}
}
