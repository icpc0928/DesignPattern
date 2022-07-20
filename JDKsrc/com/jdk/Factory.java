package com.jdk;

import java.util.Calendar;

public class Factory {

    public static void main(String[] args) {
        //直接用類別名稱來調用getInstance方法 因此可以判斷 getInstance 一定是靜態方法
        //而往內繼續找 createCalendar 內有以下這段 可以看到他根據aLocale的 calType去創造不同的Calendar 就使用了簡單工廠模式
        //if (aLocale.hasExtensions()) {
        //            String caltype = aLocale.getUnicodeLocaleType("ca");
        //            if (caltype != null) {
        //                switch (caltype) {
        //                case "buddhist":
        //                cal = new BuddhistCalendar(zone, aLocale);
        //                    break;
        //                case "japanese":
        //                    cal = new JapaneseImperialCalendar(zone, aLocale);
        //                    break;
        //                case "gregory":
        //                    cal = new GregorianCalendar(zone, aLocale);
        //                    break;
        //                }
        //            }
        //        }
        Calendar cal = Calendar.getInstance();

        System.out.println("年：" + cal.get(Calendar.YEAR));
        System.out.println("月：" + cal.get(Calendar.MONTH) + 1);
        System.out.println("日：" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("時：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));
    }
}
