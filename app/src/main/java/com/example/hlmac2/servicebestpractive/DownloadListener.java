package com.example.hlmac2.servicebestpractive;
//对下载过程中的各种状态进行监听和回调

public interface DownloadListener {

    //返回下载的进度
    void onProgress(int progress);

    //成功的回调
    void onSuccess();

    //失败的回调
    void onFailed();

    //暂停的回调
    void onPaused();

    //取消下载的回调
    void onCanceled();

}
