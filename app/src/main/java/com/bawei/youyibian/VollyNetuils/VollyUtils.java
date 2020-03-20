package com.bawei.youyibian.VollyNetuils;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.youyibian.Base.App;

import java.util.HashMap;
import java.util.Map;

public class VollyUtils {
    private RequestQueue requestQueue;
    private VollyUtils(){
        requestQueue= Volley.newRequestQueue(App.getAppContext());
    }
    private static class SingInstance{
        private static final VollyUtils TANCE=new VollyUtils();
    }
    public static VollyUtils getInstance(){

        return SingInstance.TANCE;
    }
    public void onGet(String url, final ICallBack iCallBack){
        StringRequest stringRequest1 = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        iCallBack.onsuccess(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                iCallBack.ondefalt(error.getMessage());
            }
        });
        requestQueue.add(stringRequest1);

    }
    public void onList(String url, final HashMap<String,String> map, final ICallBack iCallBack){
        StringRequest stringRequest2 = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        iCallBack.onsuccess(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                iCallBack.ondefalt(error.getMessage());
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return map;

            }
        };
        requestQueue.add(stringRequest2);
    }

    public interface ICallBack {
        void onsuccess(String str);
        void ondefalt(String str);
    }


}
