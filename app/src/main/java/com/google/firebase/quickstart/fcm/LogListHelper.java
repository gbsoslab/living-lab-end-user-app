package com.google.firebase.quickstart.fcm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wbqd on 2017. 5. 16..
 */

public class LogListHelper {
    private List<String> logList;


    private static LogListHelper ourInstance;

    public static LogListHelper getInstance() {
        if (ourInstance == null)
            ourInstance = new LogListHelper();
        return ourInstance;
    }

    private LogListHelper() {
        logList = new ArrayList<>();
    }

    public List<String> getLogList() {
        return logList;
    }

    public void addLog(String log) {
        logList.add(log);
    }
}
