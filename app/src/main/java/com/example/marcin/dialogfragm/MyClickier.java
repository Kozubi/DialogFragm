package com.example.marcin.dialogfragm;

import android.app.FragmentManager;
import android.view.View;

/**
 * Created by marcin on 18.12.2016.
 */

public class MyClickier implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        MyDialog myDialog = new MyDialog();
        myDialog.show(getFragmentManager(), "444");
    }
}


