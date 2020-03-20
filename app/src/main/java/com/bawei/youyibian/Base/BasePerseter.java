package com.bawei.youyibian.Base;

import java.lang.ref.WeakReference;

public abstract class BasePerseter<V extends IBaseView> {
    private WeakReference<V> weakReference;

    public BasePerseter(V v){
        WeakReference<V> vWeakReference = new WeakReference<>(v);
        initModel();

    }

    protected abstract void initModel();
    public V getView(){
        if(weakReference!=null){
            return weakReference.get();

        }
        return null;
    }
    protected void deatchView(){
        if(weakReference!=null){
            weakReference.clear();
            weakReference=null;
        }

    }

}
