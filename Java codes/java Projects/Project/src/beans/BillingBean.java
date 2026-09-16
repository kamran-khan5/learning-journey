package beans;

import java.util.List;


public class BillingBean {
	
	private String invoiceNumber;
	private String customerName;
	private String customerContact;
	private String customerAddress;
	private String subTotalPrice;
	private String discount;
	private String discountPrice;
	private String tax;
	private String taxPrice;
	private String totalPrice;
	private List<ProductBean> products;

	public BillingBean(String invoiceNumber, String customerName, String customerContact,
					   String customerAddress, String subTotalPrice, String discount,
					   String discountPrice, String tax, String taxPrice, String totalPrice,
					   List<ProductBean> products) {
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
		this.subTotalPrice = subTotalPrice;
		this.discount = discount;
		this.discountPrice = discountPrice;
		this.tax = tax;
		this.taxPrice = taxPrice;
		this.totalPrice = totalPrice;
		this.products = products;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public String getSubTotalPrice() {
		return subTotalPrice;
	}

	public String getDiscount() {
		return discount;
	}

	public String getDiscountPrice() {
		return discountPrice;
	}

	public String getTax() {
		return tax;
	}

	public String getTaxPrice() {
		return taxPrice;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public List<ProductBean> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "BillingBean [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + ", subTotalPrice=" + subTotalPrice
				+ ", discount=" + discount + ", discountPrice=" + discountPrice + ", tax=" + tax + ", taxPrice="
				+ taxPrice + ", totalPrice=" + totalPrice + ", products=" + products + "]";
	}
	
	
	
}
