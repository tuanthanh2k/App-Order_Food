package com.example.adminapp.interfacce;

import com.example.adminapp.model.MyResponse;
import com.example.adminapp.model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAMqTQN0w:APA91bH6bhC5R2RZM3TrOm-tURexeA1stqyFZBwxfAGZRMV0Kx0FKZyRCRwjWjpw70mZaj5QX20VLolbQV5SxSY-xF9OXdZLjdqFkR3o56NYUdxvQfpD7Tpb0ofSKxTz_1ABCPNFxxwm"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotifition(@Body Sender body);

}
