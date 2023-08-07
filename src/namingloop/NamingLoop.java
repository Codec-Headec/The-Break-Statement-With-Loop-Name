package namingloop;
import java.util.*;

public class NamingLoop{
    public static void main(String[] args) {
        int j = 0, i = 0;

        System.out.println("Enter a number:");

        first : while (i++ <= 100) {
            while (j++ <= 200) {
                if (j == 150)
                    break first;
                else
                    System.out.println(i + "" + j);
            }

        }
    }
}