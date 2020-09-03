package com.csz.net.state;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.csz.net.state.network.NetworkObserver;
import com.csz.net.state.network.NetworkStateManager;
import com.csz.net.state.network.NetworkType;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NetworkStateManager.withRegisteNetworkCallback(this);
        NetworkStateManager.getInstance(this).addNetworkCallbackObserver(new NetworkObserver() {
            @Override
            public void onAvailable(@Nullable NetworkInfo info) {

            }

            @Override
            public void onLost(@Nullable NetworkInfo info) {

            }
        });
    }

    public void test(View view) {
        boolean networkAvailable = NetworkStateManager.isNetworkAvailable(this);
        boolean wifiAvailable = NetworkStateManager.isWifiAvailable(this);
        NetworkType networkType = NetworkStateManager.getNetworkType(this);
        Log.i("csz", networkAvailable + "   " + wifiAvailable + "   " + networkType.getDesc());
    }


}