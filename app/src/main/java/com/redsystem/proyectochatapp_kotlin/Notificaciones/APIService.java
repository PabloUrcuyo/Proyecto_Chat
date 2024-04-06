package com.redsystem.proyectochatapp_kotlin.Notificaciones;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAgT9RkbE:APA91bG4qBVhPqwZm-w4Rjzqq4oFGImJfr9ARS_WSkAXDIlq9tDelSiAkRsUs7Ou7UrQTljUIFtWq5DfzDKm8qB7IDrL_Ih1RE2DGxCqHRuvBkW77QRIl7VS5C3FfPwzFSTQplInK9wF"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
