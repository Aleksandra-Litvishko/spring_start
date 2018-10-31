package di_start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class KnightMain {
	public static void main(String args[]) {
//		org.apache.log4j.BasicConfigurator.configure();
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml"); // загрузка контекста Spring

		Knight knight = (Knight) context.getBean("knight"); //получение компонента knight
		knight.embarkOnQuest(); //Использование компонента knight
	}
}