package Bai_test_1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st2 = "", st3 = "";
        boolean flagst2 = false, flagst3 = false;

        for(int i=0; i<st.length(); i++)
            if(st.charAt(i) >= '0' &&  st.charAt(i) <= '9'){
                if(flagst2 == false){
                    st2 += ' ';
                    flagst2 = true;
                    flagst3 = false;
                }
                st2+=st.charAt(i);
            }
            else {
                if(flagst3 == false){
                    st3 += ' ';
                    flagst3 = true;
                    flagst2 = false;
                }
                st3+=st.charAt(i);
            }
        st2 = st2.stripLeading();
        st3 = st3.stripLeading();
        System.out.println(st3);
        System.out.println(st2);
    }


}
