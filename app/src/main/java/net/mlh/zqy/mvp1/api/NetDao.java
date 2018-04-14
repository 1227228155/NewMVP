package net.mlh.zqy.mvp1.api;


import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/4/9 0009.
 */

public class NetDao {
    private static Retrofit retrofit;
    private static NetDao netDao;
    private static CommonApi mCommonApi;
    public CommonApi getCommonApi() {
        return mCommonApi == null ? configRetrofit(CommonApi.class) : mCommonApi;
    }

    public static NetDao getInstance(){
        if (netDao==null){
            netDao = new NetDao();
        }
        return netDao;
    }

    private <T> T configRetrofit(Class<T> service){
        retrofit = new Retrofit.Builder()
                .client(configClient())
                .baseUrl(Url.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(service);
    }



    private OkHttpClient configClient(){
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
       /* try {
            //添加HTTPS请求证书
           HttpsUtils.SSLParams  sslParams3 = HttpsUtils.getSslSocketFactory(App.getInstance().getAssets().open("yiapp.yiqijun.com.cer"));
            okHttpClient.sslSocketFactory(sslParams3.sSLSocketFactory, sslParams3.trustManager);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //设置网络请求的超时时间
        okHttpClient.connectTimeout(5, TimeUnit.SECONDS);
        return okHttpClient.build();
    }



}
