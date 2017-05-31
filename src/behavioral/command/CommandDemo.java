package behavioral.command;

/*
 * Command pattern is a data driven design pattern and falls 
 * under behavioral pattern category. A request is wrapped 
 * under an object as command and passed to invoker object. Invoker 
 * object looks for the appropriate object which can handle this command 
 * and passes the command to the corresponding object which executes the command.
 */
public class CommandDemo {

	public static void main(String[] args) {

		Stock stock = new Stock();
		Order buy = new BuyStock(stock);
		Order sell = new SoldStock(stock);
		Broker broker = new Broker();
		broker.addOrder(buy);
		broker.addOrder(sell);
		broker.displayOrders();

	}

}
