package exercise.ch59;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static int serialNum = 1;

	protected String customerId;
	protected String customenName;
	protected String customerGrade;

	protected int bonusPoint;
	protected double bonusPointRatio;

	public int calculate(int price) {
		this.bonusPoint += price * bonusPointRatio;
		return price;
	}

	public Customer() {
	}

	Customer(String customenName) {
		this.customerId = "Customer" + serialNum++;
		this.customenName = customenName;
		this.customerGrade = "silver";
		this.bonusPointRatio = 0.01;
		this.bonusPoint = 0;
	}

	public Customer(String customerId, String customenName) {
		this(customenName);
		this.customerId = customerId;
	}

	public void printMyInfo() {
		System.out.printf("customerId : %s\ncustomerName : %s\ncustomerGrade : %s\nbonusPoint : %d 입니다.\n",
				this.customerId, this.customenName, this.customerGrade, this.bonusPoint);
	}

	@Override
	public String toString() {
		return String.format("customerId : %s\ncustomerName : %s\ncustomerGrade : %s\nbonusPoint : %d 입니다.\n",
				this.customerId, this.customenName, this.customerGrade, this.bonusPoint);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Customer) {
			Customer customer = (Customer) obj;
//			if(customer.customerId == this.customerId) {
//				return true;
//			} else {
//				return false;
//			}
			return customer.customerId == this.customerId;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//return 1000; //이러면 안된다 고유하지 못함
		return Objects.hashCode(this.customerId);
	}

}