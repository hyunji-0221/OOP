package util;

import view.AccountView;
import view.UserView;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum Navigation {
    EXIT("exit",i->{
        System.out.println("EXIT");
        return false;
    }),
    USER("user",i->{
        System.out.println("USERVIEW");
        UserView.main(i);
        return true;
    }),
    ACCOUNT("account",i->{
        System.out.println("ACCOUNTVIEW");
        AccountView.main(i);
        return true;
    }),
    NAVIGATION_ERROR("navigation_error",i->{
        System.out.println("Wrong Input");
        return true;
    })
    ;

    private final String name;
    private final Predicate<Scanner> predicate;

    Navigation(String name, Predicate<Scanner> predicate) {
        this.name = name;
        this.predicate = predicate;
    }

    public static Boolean navigate(Scanner scan){
        System.out.println("exit-Exit  account-Account  user-Uesr");
        String str = scan.next();
        return Stream.of(values())
                .filter(i->i.name.equals(str))
                .findAny().orElse(NAVIGATION_ERROR).predicate.test(scan);
    }
}
