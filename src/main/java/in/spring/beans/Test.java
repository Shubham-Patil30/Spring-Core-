package in.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 PaymentService payment=  context.getBean(PaymentService.class);
		 payment.doPayment(100.00);
//		 System.out.println(payment.hashCode());
		 
		 
		
	}

}
