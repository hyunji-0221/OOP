package strategy;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.Scanner;


enum Weekday{
    SUNDAY("sunday", ()-> "일요일"),
    MONDAY("monday", ()-> "월요일"),
    TUESDAY("tuesday", ()-> "화요일"),
    WEDNESDAY("wednesday", ()-> "수요일"),
    THURSDAY("thursday", ()-> "목요일"),
    FRIDAY("friday", ()-> "금요일"),
    SATURDAY("saturday", ()-> "토요일");

    private final String week;
    private final Supplier<String> supplier;

    Weekday(String week, Supplier<String> supplier) {
        this.week = week;
        this.supplier = supplier;
    }

    public static String getKoreanDay(String week){
        return getOperator(week).supplier.get();
    }

    private static Weekday getOperator(String day) {
        return Arrays.stream(values())
                .filter(o->o.week.equals(day))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 값 아님"));
    }

}

public class WhatDay {
    String getKoreanDay(String week) {
        return Weekday.getKoreanDay(week);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("무슨 요일");
        WhatDay w = new WhatDay();
        String s = w.getKoreanDay(sc.next());
        System.out.println(s);
    }

}
