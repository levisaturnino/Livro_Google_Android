package br.com.cimobile.helloactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by saturnino on 20/03/2016.
 */
public class DebugActivity extends AppCompatActivity {

    protected static final String TAG = "Cimobile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, getClassName()+".onCreate() chamando: "+savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getClassName()+".onStart() chamando ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, getClassName()+".onRestart() chamando ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, getClassName()+".onResume() chamando ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, getClassName()+".onPause() chamando ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, getClassName()+".onSaveInstanceState() chamando ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, getClassName()+".onStop() chamando ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getClassName()+".onDestroy() chamando ");
    }

    public String getClassName() {
        String s = getClass().getName();

        return s.substring(s.lastIndexOf("."));
    }
}
