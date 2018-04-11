package net.mlh.zqy.mvp1.utils.rxhelper;


import android.support.annotation.NonNull;

import net.mlh.zqy.mvp1.base.BaseModel;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by Liang_Lu on 2016/12/20.
 * <p>
 * 控制操作线程的辅助类
 */

public class RxTransformer {

    /**
     * 无参数
     *
     * @param <T> 泛型
     * @return 返回Observable
     */
    public static <T> ObservableTransformer<T, T> switchSchedulers(final BaseModel baseModel) {
       /* return //upstream -> upstream
                upstream.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
               // .doOnSubscribe(disposable -> baseModel.mDisposable.add(disposable))
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        baseModel.mDisposable.add(disposable)
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread());*/

        return new ObservableTransformer<T,T>(){
            @Override
            public ObservableSource<T> apply(@NonNull Observable<T> upstream) {
                return
                        //生产线程
                        upstream.subscribeOn(Schedulers.io())
                                .unsubscribeOn(Schedulers.io())
                                //消费线程
                                .observeOn(AndroidSchedulers.mainThread())
                                .doOnSubscribe(new Consumer<Disposable>() {
                                    @Override
                                    public void accept(Disposable disposable) throws Exception {
                                        baseModel.mDisposable.add(disposable);
                                    }
                                })
                                .subscribeOn(AndroidSchedulers.mainThread())
                                .observeOn(AndroidSchedulers.mainThread());

            }

        };


    }


}
