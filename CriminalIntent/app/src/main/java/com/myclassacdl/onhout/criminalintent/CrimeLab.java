package com.myclassacdl.onhout.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class CrimeLab {
    private ArrayList<Crime> crimes;
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
        crimes = new ArrayList<Crime>();
        for (int i = 0; i < 100; i++){
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i % 2 == 0);
            crimes.add(c);
        }
    }

    public static CrimeLab get(Context c){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getCrimes(){
        return crimes;
    }

    public Crime getCrime(UUID id){
        for (Crime c : crimes){
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }
}
