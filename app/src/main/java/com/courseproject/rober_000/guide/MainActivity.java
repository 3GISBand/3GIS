package com.courseproject.rober_000.guide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GuideListFragment guideListFragment = new GuideListFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, guideListFragment).commit();

        /////////////BOTTOM NAVIGATION////////////////
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(getBottomNavigationListener());

        /////////////BOTTOM NAVIGATION////////////////
    }

    @NonNull
    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_guides:

                        break;
                    case R.id.action_favorite:

                        break;
                    case R.id.action_add_guide:

                        break;
                    case R.id.action_user:

                        break;
                }
                return true;
            }
        };
    }
}
