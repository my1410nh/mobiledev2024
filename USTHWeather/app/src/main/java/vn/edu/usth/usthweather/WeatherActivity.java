package vn.edu.usth.usthweather;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG  = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate called");

        ForecastFragment forecastFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main,forecastFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy called");
    }
}
