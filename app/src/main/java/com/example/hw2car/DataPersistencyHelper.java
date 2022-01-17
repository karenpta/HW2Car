package com.example.hw2car;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataPersistencyHelper {

    public static Context Context;

    public static void StoreData(List<Car> cars)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        SharedPreferences.Editor editor = sp.edit();
        String json = new Gson().toJson(cars );
        editor.putString("cars", json);
        editor.commit();
    }

    public static List<Car> LoadData()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("cars",null);
        if (json != null)
        {
            Type type = new TypeToken<List<Car>>(){}.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Car> users = new ArrayList<Car>();
            users.add(new Car(R.drawable.avatar1,"Contact 1","contact1@post.idc.ac.il"));
            users.add(new Car(R.drawable.avatar2,"Contact 2","contact2@post.idc.ac.il"));
            users.add(new Car(R.drawable.avatar3,"Contact 3","contact3@post.idc.ac.il"));
            users.add(new Car(R.drawable.avatar4,"Contact 4","contact4@post.idc.ac.il"));
            users.add(new Car(R.drawable.avatar5,"Contact 5","contact5@post.idc.ac.il"));
            users.add(new Car(R.drawable.avatar6,"Contact 6","contact6@post.idc.ac.il"));
            users.add(new Car(R.drawable.avatar7,"Contact 7","contact7@post.idc.ac.il"));
            users.add(new Car(R.drawable.avatar8,"Contact 8","contact8@post.idc.ac.il"));
            return users;
        }
    }

}
