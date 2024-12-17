
public class Bank {
	int accno;
	String name;
	int balance;
	
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	public Bank(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}

	public void deposit(int amt) {
		this.balance = this.balance + amt;
	}
	
	public void withdraw(int amt) {
		try {
			if(amt>balance) {
				throw new InvalidBalanceException("Balance is not sufficent");
			}
		}
		catch(InvalidBalanceException e) {
			System.out.println(e);
		}
	}
}
