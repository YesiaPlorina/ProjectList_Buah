package com.example.yesiaplorina.projectlist;

import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ViewPagerActivity extends AppCompatActivity {

    ViewPager pager;

    String[] namaBuah = {
            "Alpukat",
            "Apel",
            "Ceri",
            "Durian",
            "Jambu Air",
            "Manggis",
            "Strawberry"
    };

    int[] gambarBuah = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry
    };

    int[] suaraBuah = {
            R.raw.alpukat,
            R.raw.apel,
            R.raw.ceri,
            R.raw.durian,
            R.raw.jambu_air,
            R.raw.manggis,
            R.raw.strawberry
    };

    private static final String TAG = "ViewPagerActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        pager = findViewById(R.id.view_pager);



        CustomPagerAdapter adapter = new CustomPagerAdapter(ViewPagerActivity.this, namaBuah, gambarBuah);
        pager.setAdapter(adapter);

        //trima data

        int posisi = getIntent(). getIntExtra("DATAPOSISI", 0) ;
        pager.setCurrentItem(posisi);

        Log.d(TAG, "onCreate: DATAPOSISI");

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {



            }
        });


    }
}
