import java.util.Date;

public class Order {
	int custID;
	Product items[];
	int quantity[];
	Date shipDate;
	float shipCost;
	String comments;
	int OrderID;
	Date orderDate;
	Order()
	{
		OrderID = MySystem.OrderSize();
	}
	Order(int customerID, Product itemID[], int quantityIN[], Date shippingDate, float shippingCost, Date orderingDate, String comment)
	{
		OrderID = MySystem.OrderSize();
		if(quantityIN.length == itemID.length)
		{
			items = new Product[itemID.length];
			quantity = new int[quantityIN.length];
			for(int i = 0; i<itemID.length;i++)
			{
				items[i] = itemID[i];
				quantity[i] = quantityIN[i];
			}
			custID = customerID;
			shipDate = shippingDate;
			shipCost = shippingCost;
			orderDate = orderingDate;
			comments = comment;
		
		}
		else
		{
			System.out.println("Order ID: " + OrderID + "item array does not match quantity array! No data was created.");
		}
	}
	
}
