package br.com.cimobile.helloactivity;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

/**
 * Created by saturnino on 22/03/2016.
 */
public class MyTabListener implements ActionBar.TabListener {

    private Context context;

    private int tabIdx;


    public MyTabListener(Context context, int tabIdx) {
        this.context = context;
        this.tabIdx = tabIdx;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        Toast.makeText(context, "Selecinou a tab: "+tabIdx, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
