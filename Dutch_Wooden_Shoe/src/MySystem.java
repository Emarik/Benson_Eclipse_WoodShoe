import java.util.Date;

public class MySystem {

		static Order myOrders[] = new Order[4];
		static Customer customers[] = new Customer[3];
		static Product products[] = new Product [5];
		static int OrderSize() {
			//need to test
			return myOrders.length;
		}
		//Extending array of orders and adding new incoming order
		void AddOrder(int customerID, Product item[], int quantityIN[], Date shippingDate, float shippingCost, Date orderingDate, String comment)
		{
			//check data for duplicates
			
			Order newOrders[] = new Order[myOrders.length+1];
			for( int i = 0; i< myOrders.length;i++)
			{
				newOrders [i] = myOrders[i];
			}
			newOrders[myOrders.length+1] = new Order(customerID, item, quantityIN, shippingDate, shippingCost, orderingDate, comment);
			myOrders = newOrders;
		}
		void AddProduct()
		{
			
		}
		Customer[] RetrieveCustomers()
		{
			return null;
		}
		Order[] RetrieveOrders()
		{
			return null;
		}
		Product[] RetrieveProducts()
		{
			return null;
		}
		boolean DuplicateProduct(Product P)
		{
			return false;
		}
		int CalculateBusinessExpenses()
		{
			return CalculateShippingExpenses() + CalculateToolExpenses();
		}
		int CalculateShippingExpenses()
		{
			return 0;
		}
		int CalculateToolExpenses()
		{
			return 0;
		}
}
