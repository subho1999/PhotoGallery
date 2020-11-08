package com.example.photogallery;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

public class MainActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}