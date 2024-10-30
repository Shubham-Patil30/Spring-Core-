package in.spring.beans;

public class DebitCardPay implements IPayment {

		public DebitCardPay() {
			System.out.println("DebitCardPay :: object");
		}
	@Override
	public boolean processPayment(double billAmt) {
	    System.out.println("Debit Card Payment Successfull..");
		return true;
	}

}
