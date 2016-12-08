package com.example.dev.girlscout_image_slide;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Kim juyoung on 2016-12-09.
 */

public class CustomAdapter extends PagerAdapter {

LayoutInflater inflater;

    public CustomAdapter(LayoutInflater inflater) {

        this.inflater=inflater;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = null;

        view=inflater.inflate(R.layout.viewpager_imageview, null);

        ImageView img=(ImageView)view.findViewById(R.id.img_viewpager_imageview);

        img.setImageResource(R.drawable.winter_friendship_camp_01+position);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
