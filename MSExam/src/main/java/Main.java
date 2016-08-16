import Entity.Customer;
import service.AllActionImp;
import serviceInterface.AllAction;

public class Main {
	
	public static void main(String[] args) {
		AllAction actions= new AllActionImp();
		Customer customer =actions.inputAndCheck();
		actions.showMessage();		
		int insert=actions.insertCustomer(customer);
		if(insert==1){
        	 System.out.println("已成功存入数据库");
        }else{
        	 System.out.println("存入数据库失败");
        }
	}
	
}
