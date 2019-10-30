package com.ringha.app;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

public class WXApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    WXSDKEngine.initialize(this,
        new InitConfig.Builder().build()
    );

  }
}
