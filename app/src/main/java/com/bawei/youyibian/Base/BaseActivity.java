package com.bawei.youyibian.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity <P extends BasePerseter> extends AppCompatActivity implements IBaseView{
    private P perserter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        perserter=initPerserter();
        initView();
        initData();

    }
    public P getPerserter(){
        return perserter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(perserter!=null){
            perserter.deatchView();
            perserter=null;

        }
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract P initPerserter();

    protected abstract int getLayoutID();

}
