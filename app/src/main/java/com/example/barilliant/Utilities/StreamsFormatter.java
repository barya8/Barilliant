package com.example.barilliant.Utilities;

public class StreamsFormatter {
    public static String getFormattedStreams(long streams) {
        if (streams>999)
            return streams/1000+"."+streams/100%10+"B";
        else
            return streams+"M";
    }
}
