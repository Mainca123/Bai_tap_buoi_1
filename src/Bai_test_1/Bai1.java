package Bai_test_1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] A = new String[5];
        String[] B = new String[11];
        A[4] = "nghin";
        A[3] = "tram";
        A[2] = "muoi";
        A[1] = "linh";
        B[0] = "khong";
        B[1] = "mot";
        B[2] = "hai";
        B[3] = "ba";
        B[4] = "bon";
        B[5] = "nam";
        B[6] = "sau";
        B[7] = "bay";
        B[8] = "tam";
        B[9] = "chin";

        str = str.replaceFirst("^0+", "");
        if(str.length()==0) System.out.println(B[0]);
        int dem=str.length();
        for(int i=0; i<str.length(); i++){
            if(dem==2 && str.charAt(i)=='0')
                System.out.print(A[1] + " ");
            else {
                if(dem>=3)
                    System.out.print(B[str.charAt(i) - '0'] + " ");
                else
                if(dem==2 && str.charAt(i)!='1')
                    System.out.print(B[str.charAt(i) - '0'] + " ");
                else
                    if(dem==1 && str.charAt(i)!='0')
                        System.out.print(B[str.charAt(i) - '0'] + " ");
                if(dem>1) System.out.print(A[dem] + " ");
            }
            dem--;
        }
    }
}
