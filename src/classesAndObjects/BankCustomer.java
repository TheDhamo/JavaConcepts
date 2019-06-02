/*Classes, Objects and Constructors Demo*/
package classesAndObjects;

public class BankCustomer {

	public static void main(String[] args) {
		BankA customerSam = new BankA();
		customerSam.setAccountBalance(500);
		customerSam.transferFund(60000);
		customerSam.transferFund(40000);
		System.out.println("Your current account balance is: " + customerSam.getAccountBalance());
		customerSam.withdrawFund(20000, "Sam");
		customerSam.transferFund(40000);
		customerSam.withdrawFund(60000, "Sam");
		System.out.println("Your current account balance is: " + customerSam.getAccountBalance());
		System.out.println("***************************************************************");

		BankA customerJim = new BankA();
		customerJim.setAccountBalance(500);
		customerJim.transferFund(60000);
		customerJim.transferFund(40000);
		System.out.println("Your current account balance is: " + customerJim.getAccountBalance());
		customerJim.withdrawFund(20000, "Jim");
		customerJim.transferFund(40000);
		customerJim.withdrawFund(60000, "Jim");
		System.out.println("Your current account balance is: " + customerJim.getAccountBalance());
		System.out.println("***************************************************************");
	}

}
