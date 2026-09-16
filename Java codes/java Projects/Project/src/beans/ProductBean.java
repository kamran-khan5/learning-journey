package beans;

public class ProductBean {
	
	private String type;
	private String productDescription;
	private String serialNumber;
	private double unitPrice;
	private int noOfUnits;
	private double totalCost;

	public ProductBean(String type, String productDescription, String serialNumber, double unitPrice, int noOfUnits, double totalCost) {
		this.type = type;
		this.productDescription = productDescription;
		this.serialNumber = serialNumber;
		this.unitPrice = unitPrice;
		this.noOfUnits = noOfUnits;
		this.totalCost = totalCost;
	}

	public String getType() {
		return type;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getNoOfUnits() {
		return noOfUnits;
	}

	public double getTotalCost() {
		return totalCost;
	}

	@Override
	public String toString() {
		return "ProductBean [type=" + type + ", productDescription=" + productDescription + ", serialNumber="
				+ serialNumber + ", unitPrice=" + unitPrice + ", noOfUnits=" + noOfUnits + ", totalCost=" + totalCost
				+ "]";
	}
	
	
}
