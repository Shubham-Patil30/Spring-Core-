package in.spring.beans;

public class CreditCardPay implements IPayment {
	
	public CreditCardPay() {
		System.out.println("CreditCardPay :: Object");
	}

	@Override
	public boolean processPayment(double billAmt) {
	    System.out.println("Credit Card Payment Succesfull...");
		return true;
	}

}
