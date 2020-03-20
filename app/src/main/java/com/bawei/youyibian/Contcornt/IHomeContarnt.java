package com.bawei.youyibian.Contcornt;

import com.bawei.youyibian.Base.IBaseView;

public interface IHomeContarnt {
    interface IView extends IBaseView{
        void onBannerSuccess(String str);
        void onBannerDefalt(String str);

        void onListSuccess(String str);
        void onListDefalt(String str);
    }
    interface IPerster{
        void onBanner(String str);
        void onList(String str);

    }
    interface IModel{
        void onBanner(String url,ICallBackBanner iCallBackBanner);
        void onList(String url,ICallBackList iCallBackList);
        interface ICallBackBanner{
            void onBannerSuccess(String str);
            void onBannerDefalt(String str);
        }
        interface ICallBackList{
            void onListSuccess(String str);
            void onListDefalt(String str);
        }

    }

}
