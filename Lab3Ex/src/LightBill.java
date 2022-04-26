
public class LightBill {

	int consumerid;
	int num_units;
	double unit_cost, total_cost;
	
LightBill(int cid, int nunits, double costu)
{
	consumerid= cid;
	num_units = nunits;
	unit_cost=costu;
	
}

void compute()
{
	total_cost = num_units * unit_cost;
	
}

void display()
{
	System.out.println("Consumer id: " +consumerid+ "\n number of units: " +num_units+ "\n cost per unit: "+unit_cost+ "\n Total cost amount: " +total_cost);
}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	LightBill mybill = new LightBill (121, 900, 10);
	mybill.compute();
	mybill.display();
}
}


