package com.swap.myfirstlibrary;

import android.content.Context;
import android.widget.Toast;

public class FastToast {
    public static void create(Context context, String message, int duration) {
        Toast.makeText(context, message, duration).show();
    }
}
