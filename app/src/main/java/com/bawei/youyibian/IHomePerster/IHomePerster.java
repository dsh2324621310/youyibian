package com.bawei.youyibian.IHomePerster;

import com.bawei.youyibian.Base.BasePerseter;
import com.bawei.youyibian.Base.IBaseView;
import com.bawei.youyibian.Contcornt.IHomeContarnt;
import com.bawei.youyibian.IHomeModel.IModel;

public class IHomePerster extends BasePerseter implements IHomeContarnt.IPerster {
    private IModel model;

    public IHomePerster(IBaseView iBaseView) {
        super(iBaseView);
    }


    @Override
    protected void initModel() {
        model=new IModel();
    }

    @Override
    public void onBanner(String str) {
        model.onBanner(str, new IHomeContarnt.IModel.ICallBackBanner() {
            @Override
            public void onBannerSuccess(String str) {
                IBaseView view = getView();
                if(view instanceof IHomeContarnt.IView){
                    IHomeContarnt.IView iView= (IHomeContarnt.IView) view;
                    iView.onBannerSuccess(str);
                }
            }

            @Override
            public void onBannerDefalt(String str) {
                IBaseView view = getView();
                if(view instanceof IHomeContarnt.IView){
                    IHomeContarnt.IView iView= (IHomeContarnt.IView) view;
                    iView.onBannerDefalt(str);
                }
            }
        });
    }

    @Override
    public void onList(String str) {
        model.onList(str, new IHomeContarnt.IModel.ICallBackList() {
            @Override
            public void onListSuccess(String str) {
                IBaseView view = getView();
                if(view instanceof IHomeContarnt.IView){
                    IHomeContarnt.IView iView= (IHomeContarnt.IView) view;
                    iView.onListSuccess(str);
                }
            }

            @Override
            public void onListDefalt(String str) {
                IBaseView view = getView();
                if(view instanceof IHomeContarnt.IView){
                    IHomeContarnt.IView iView= (IHomeContarnt.IView) view;
                    iView.onListDefalt(str);
                }
            }
        });
    }
}
