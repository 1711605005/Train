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
}
