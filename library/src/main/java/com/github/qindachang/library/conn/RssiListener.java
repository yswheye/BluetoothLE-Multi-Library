package com.github.qindachang.library.conn;

/**
 * Created by qindachang on 2017/3/10.
 */

public interface RssiListener extends Listener{
    void onRssi(int rssi, int cm);
}
