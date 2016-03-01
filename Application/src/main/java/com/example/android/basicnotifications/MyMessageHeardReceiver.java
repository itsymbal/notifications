package com.example.android.basicnotifications;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public class MyMessageHeardReceiver extends BroadcastReceiver {
    private static final String TAG = "YOMAMA";

    public MyMessageHeardReceiver() {
    }

    @TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
    @Override
    public void onReceive(Context context, Intent intent) {
        int conversationId = intent.getIntExtra("conversation_id", -1);
        Log.d(TAG, "onReceive: basicNoficirations");
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            CharSequence remoteText = remoteInput.getCharSequence("voice_reply_key");
            Log.d(TAG, "onReceive: received text "+remoteText);

        }
    }
}
