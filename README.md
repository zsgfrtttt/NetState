# NetState
Android轻量级(只有4个类）网络状态检测器


### 引入依赖 
在Project的build.gradle在添加以下代码
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
在Module的build.gradle在添加以下代码
```
	implementation 'com.github.zsgfrtttt:NetState:1.0.0'
```
**注意：** 依赖迁移至Androidx

### 基本使用

**Application注册**
```java
   NetworkStateManager.withRegisteNetworkCallback(this);
```
**网络状态即时监听**
```java
   NetworkStateManager.getInstance(this).addNetworkCallbackObserver(new NetworkObserver() {
            @Override
            public void onAvailable(@Nullable NetworkInfo info) {

            }

            @Override
            public void onLost(@Nullable NetworkInfo info) {

            }
        });
```

**获取当前网络是否可用**
```java
   boolean networkAvailable = NetworkStateManager.isNetworkAvailable(this);
        boolean wifiAvailable = NetworkStateManager.isWifiAvailable(this);
        NetworkType networkType = NetworkStateManager.getNetworkType(this);
        Log.i("csz", networkAvailable + "   " + wifiAvailable + "   " + networkType.getDesc());
```
#### 其他问题联系邮箱1058079995@qq.com

