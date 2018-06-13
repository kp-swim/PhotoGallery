package krzysiek.photogallery;

import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewPager;
import android.support.wearable.activity.WearableActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends WearableActivity{

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        boolean isRound = getResources().getConfiguration().isScreenRound();
        viewPager.setAdapter(new ImageAdapter(MainActivity.this, isRound));
        setAmbientEnabled();
    }

}
