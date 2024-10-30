package in.spring.beans;

public class PaymentService {
	private IPayment payment ; 
	
	public PaymentService() {
		System.out.println("PaymentServices :: object");
	}
	
	public void setPayment(IPayment payment) {
		this.payment=payment; 
	}
	
	public PaymentService(IPayment payment) {
		System.out.println("paramater constructor");
		this.payment= payment; 
	}
	
	public void doPayment(double billAmt) {
	 boolean status = payment.processPayment(billAmt);
	 if(status) {
		 System.out.println("Receipt Printig....");
	 }
	 else {
		System.out.println("Payment Failed !!");
	}
	}
}
