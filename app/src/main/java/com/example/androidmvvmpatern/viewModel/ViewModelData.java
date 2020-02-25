package com.example.androidmvvmpatern.viewModel;

import android.text.TextUtils;

import androidx.databinding.ObservableArrayMap;
import androidx.lifecycle.ViewModel;

import com.example.androidmvvmpatern.model.DataModel;

public class ViewModelData extends ViewModel {

    public ObservableArrayMap<String, Object> text = new ObservableArrayMap<>();
    private DataModel dataModel;

    public void onDataChanged(CharSequence name, int start, int before, int count) {

        dataModel = new DataModel(name.toString());
        if(!TextUtils.isEmpty(dataModel.getName())){
            this.text.put("textToShow", dataModel.getName());
        }else{
            this.text.put("textToShow", "");
        }
    }

    public void onClick(String name){
        dataModel = new DataModel(name);
        if(!TextUtils.isEmpty(dataModel.getName())){
            this.text.put("textToShow", dataModel.getName());
        }else{
            this.text.put("textToShow", "");
        }
    }
}
