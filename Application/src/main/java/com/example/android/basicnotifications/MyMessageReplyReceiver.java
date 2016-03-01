package com.example.android.basicnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import static android.app.RemoteInput.getResultsFromIntent;

public class MyMessageReplyReceiver extends BroadcastReceiver {
    private static final String TAG = "HYOMAMA";

    public MyMessageReplyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle remoteInput = getResultsFromIntent(intent);
        if (remoteInput != null) {
            CharSequence remoteText = remoteInput.getCharSequence("voice_reply_key");
            Log.d(TAG, "onReceive: received text "+remoteText);

        }
    }
}
