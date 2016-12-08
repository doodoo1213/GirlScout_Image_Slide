package com.example.dev.girlscout_image_slide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Image_Slide extends AppCompatActivity {

    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide);

        pager=(ViewPager)findViewById(R.id.pager);

        CustomAdapter adapter = new CustomAdapter(getLayoutInflater());

        pager.setAdapter(adapter);

    }

    public void mOnClick(View view){
        int position;

        switch (view.getId()){
            case R.id.btn_previous:
                position=pager.getCurrentItem();
                pager.setCurrentItem(position-1,true);

                break;

            case R.id.btn_next:
                position=pager.getCurrentItem();
                pager.setCurrentItem(position+1,true);

                break;
        }
    }
}
