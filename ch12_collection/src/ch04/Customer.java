package ch04;

public class Customer {
	private int custid;
	private String name;
	private String address;
	private String phone;
	
	public Customer(int custid, String name, String address, String phone) {
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return custid;
	}

	@Override
	public boolean equals(Object obj) {
		return custid == ((Customer)obj).custid;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
}
