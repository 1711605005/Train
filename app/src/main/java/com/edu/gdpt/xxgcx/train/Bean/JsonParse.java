package com.edu.gdpt.xxgcx.train.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class JsonParse {//单例模式 单个对象 （对象产生：构造方法）
    public static JsonParse instance;
    private JsonParse(){//构造方法私有化，类外部不能调用，就是不能创造对象

    }
    public static JsonParse getInstance(){
        if (instance==null){
            instance=new JsonParse();
        }
        return instance;
    }
    public List<ABean.ResultBean.ListBean>getDepotList(String json){
        //使用gson库解析Json数据
        Gson gson=new Gson();
        gson.fromJson(json,ABean.class);
        //创建一个TypeToken的匿名数据子类对象，并调用对象的getType()方法
        Type listType=new TypeToken<List<ABean.ResultBean.ListBean>>(){}.getType();
        //把获取到的信息集合存到queryList中
        List<ABean.ResultBean.ListBean>depotList =gson.fromJson(json,listType);
        return depotList;
    }
}
