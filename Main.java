import util.Navigation;
import view.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

enum MainEnum {

}

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

       while(Navigation.navigate(scan));

    }
}