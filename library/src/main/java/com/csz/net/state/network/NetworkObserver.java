package com.csz.net.state.network;

import android.net.NetworkInfo;

import androidx.annotation.Nullable;

/**
 * @author caishuzhan
 */
public interface NetworkObserver {

    void onAvailable(@Nullable NetworkInfo info);

    void onLost(@Nullable NetworkInfo info);

}
