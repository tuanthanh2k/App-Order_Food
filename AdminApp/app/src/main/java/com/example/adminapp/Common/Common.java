package com.example.adminapp.Common;

import com.example.adminapp.Remote.RetrofitClient;
import com.example.adminapp.interfacce.APIService;
import com.example.adminapp.model.Request;
import com.example.adminapp.model.User;

import java.util.Calendar;
import java.util.Locale;

public class Common {
    public static User currentUser;
    public static Request currentRequest;

    public static String topicName = "News";

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";
    public static final int PICK_IMAGE_REQUEST = 71;

    public static final String fcmUrl = "https://fcm.googleapis.com/";

    public static APIService getFCMClient(){
        return RetrofitClient.getClient(fcmUrl).create(APIService.class);
    }

    public static String convertCodeToStatus(String code)
    {
        if (code.equals("0"))
            return "Đặt";
        else if (code.equals("1"))
            return "Trên Đường Tới";
        else
            return "Đang Ship";
    }

    public static String getDate(long time)
    {
        Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
        calendar.setTimeInMillis(time);
        StringBuilder date = new StringBuilder(
                android.text.format.DateFormat.format("dd-MM-yyyy HH:mm"
                        ,calendar)
                        .toString());
        return date.toString();
    }
}


