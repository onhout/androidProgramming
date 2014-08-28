package com.myclassacdl.onhout.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Jay on 8/27/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
