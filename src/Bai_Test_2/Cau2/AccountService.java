package Bai_Test_2.Cau2;

import Bai_Test_2.Cau1.Account;
import Bai_Test_2.Cau1.Status;

public interface AccountService {
    public void createNewAccount(Account account);
    public Account getAccountByUsername(String username);
    public void deleteAccount(String username);
    public void changeStatus(String username, Status status);

}
