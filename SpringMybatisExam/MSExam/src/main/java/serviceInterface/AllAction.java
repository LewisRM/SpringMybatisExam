package serviceInterface;

import Entity.Customer;

public interface AllAction {
      public Customer inputAndCheck();
      
      public int insertCustomer(Customer customer);
      
      public void showMessage();
      
      public int deleteCustomer(int id);
}
