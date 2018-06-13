package com.gy.gyfilemanager.filemanager;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gy.gyfilemanager.R;
import com.gy.gyfilemanager.filemanager.fragment.ApkFragment;
import com.gy.gyfilemanager.filemanager.fragment.FileNameFragment;
import com.gy.gyfilemanager.filemanager.fragment.FileTypeFragment;
import com.gy.gyfilemanager.filemanager.fragment.ImageFragment;
import com.gy.gyfilemanager.filemanager.fragment.MusicFragment;
import com.gy.gyfilemanager.filemanager.fragment.VideoFragment;
import com.gy.gyfilemanager.filemanager.fragment.WordFragment;
import com.gy.gyfilemanager.filemanager.fragment.ZipFragment;


public class ShowActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        String aClass = getIntent().getStringExtra("class");
        Log.i("ccccccccccc","aClass==="+aClass);
        switch (aClass) {
            case "image":
                transaction.add(R.id.show_detial, new ImageFragment());
                break;
            case "music":
                transaction.add(R.id.show_detial, new MusicFragment());
                break;
            case "video":
                transaction.add(R.id.show_detial, new VideoFragment());
                break;
            case "word":
                transaction.add(R.id.show_detial, new WordFragment());
                break;
            case "apk":
                transaction.add(R.id.show_detial, new ApkFragment());
                break;
            case "zip":
                transaction.add(R.id.show_detial, new ZipFragment());
                break;
            case "filename":
                transaction.add(R.id.show_detial,new FileNameFragment());
                break;
            case "filetype":
                transaction.add(R.id.show_detial,new FileTypeFragment());
                break;
        }
        transaction.commit();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

}
