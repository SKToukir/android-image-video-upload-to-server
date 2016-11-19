package com.example.toukir.myapplication;

/**
 * Created by toukir on 11/19/16.
 */

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mushtaq on 13-05-2016.
 */
public class ServerResponse {

    // variable name should be same as in the json response from php
    @SerializedName("success")
    boolean success;
    @SerializedName("message")
    String message;

    public String getMessage() {
        return message;
    }

    public boolean getSuccess() {
        return success;
    }

}
