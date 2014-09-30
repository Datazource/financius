package com.code44.finance.ui.settings.about;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;

import com.code44.finance.R;
import com.code44.finance.ui.BaseActivity;

public class AboutActivity extends BaseActivity {
    public static void start(Context context) {
        start(context, makeIntent(context, AboutActivity.class));
    }

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        toolbarHelper.setTitle(R.string.about);

        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.content_V, AboutFragment.newInstance())
                    .commit();
        }
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }
}