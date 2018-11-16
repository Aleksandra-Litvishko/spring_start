package di_continuation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformerMain {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di_continuation_configuration.xml");

//		Performer jugglerDuke = (Performer) context.getBean("duke");
//		Stage stage = (Stage) context.getBean("stage"); получение компонента, созданного с помощью фабричного метода
//		jugglerDuke.perform();
		Performer instrumentalistKenny = (Performer) context.getBean("kenny");
		instrumentalistKenny.perform();
		
//		Performer oneManBandHank = (Performer) context.getBean("hank");
//		oneManBandHank.perform();
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  