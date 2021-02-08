package com.kiljae.mysample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.slice.Slice
import androidx.slice.builders.SliceAction

class MyBroadcastReceiver : BroadcastReceiver(){
    companion object{
        val EXTRA_TOGGLE_STATE = "android.app.slice.extra.TOGGLE_STATE"
    }
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            if(it.hasExtra(EXTRA_TOGGLE_STATE)){
                Toast.makeText(
                        context,
                        "Toggled: " + it.getBooleanExtra(EXTRA_TOGGLE_STATE, false),
                        Toast.LENGTH_SHORT)
                        .show();
            }else {
                Toast.makeText(
                        context,
                        "Click here~~~",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }
}