package br.com.abelcorreadias.musicapp.models;

import android.content.Context;

public abstract class BaseModel {

    private Context context;

    public BaseModel(Context context){
        this.context = context;
    }

    public Context getContext(){
        return this.context;
    }


}
