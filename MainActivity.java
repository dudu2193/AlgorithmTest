package com.xy.myalgorithmtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/4/11.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Insertion  insertion = new Insertion();
        insertion.sort(new int[]{1,5,66,4,3,7,8});
    }
}
