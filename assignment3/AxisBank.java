package assignment3;

public class AxisBank extends BankInfo{
public void deposit() {
	super.deposit();
}
public static void main(String[] args) {
BankInfo obj = new BankInfo();
AxisBank obj1 = new AxisBank();
obj.saving();
obj.fixed();
obj.deposit();
obj1.deposit();
}
}
