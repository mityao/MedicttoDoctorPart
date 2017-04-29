package com.willyao.android.medicttodoctorpart;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;

public class DoctorMainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_nav) BottomNavigationView mBottomNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_main);
        ButterKnife.bind(this);

        if (findViewById(R.id.doctor_main_container) != null) {

        }

        mBottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.doctor_home:
                        //change to doc home frg
                        break;

                    case R.id.patient_request:
                        //change frg
                        break;

                    case R.id.patient_appointment:
                        //
                        break;

                    case R.id.doctor_schedule:
                        //
                        break;
                }
                if (fragment != null) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.doctor_main_container, fragment)
                            .commit();
                }
                return true;
            }
        });
    } 
}
