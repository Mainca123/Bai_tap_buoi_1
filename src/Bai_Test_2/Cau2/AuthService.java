package Bai_Test_2.Cau2;

import java.util.Scanner;

public interface AuthService {
    public void login(Scanner scanner);
    public void logout();
    public void changePassword(String userName, String oldPassword, String newPassword);
}
