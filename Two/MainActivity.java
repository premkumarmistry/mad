package com.sneha.practical2;
mport androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","OnCreateInvoke");
    }
    @Override
    protected void onStart(){
        super.onStart();
        page. 4
        Log.d("Lifecycle","OnStartInvoke");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Lifecycle","OnResumeInvoke");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Lifecycle","OnPauseInvoke");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Lifecycle","OnStopInvoke");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Lifecycle","OnRestartInvoke");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle","OnDestroyInvoke");
    }
}
