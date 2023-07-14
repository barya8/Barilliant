package com.example.barilliant.Utilities;

public class TimeFormatter {
    public static String getFormattedTime(int duration) {
        int m = duration / 60;
        int s = duration % 60;
        String mm = m < 10 ? "0" + m : "" + m;
        String ss = s < 10 ? "0" + s : "" + s;
        return mm + "m " + ss + "s";
    }
}
