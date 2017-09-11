package com.zj.funnygrathy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * Created by kevin on 2017/9/11.
 */

public class FunnyGrathyEditActivity extends FragmentActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏图标
        this.getPackageManager().setComponentEnabledSetting(this.getComponentName(),2,1);
//
    }
}
