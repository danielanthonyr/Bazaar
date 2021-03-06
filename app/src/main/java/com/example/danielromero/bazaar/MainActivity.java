package com.example.danielromero.bazaar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.danielromero.bazaar.Fragments.HomeFragment;
import com.example.danielromero.bazaar.Fragments.MessageFragment;
import com.example.danielromero.bazaar.Fragments.ProfileFragment;
import com.example.danielromero.bazaar.Fragments.SearchFragment;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				Fragment selectedFragment = null;

				switch (item.getItemId()){
					case R.id.action_home:
						selectedFragment = HomeFragment.newInstance();
						break;

					case R.id.action_search:
						selectedFragment = SearchFragment.newInstance();
						break;

					case R.id.action_message:
						selectedFragment = MessageFragment.newInstance();
						break;

					case R.id.action_profile:
						selectedFragment = ProfileFragment.newInstance();
						break;
				}

				FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
				transaction.replace(R.id.frame_layout, selectedFragment);
				transaction.commit();
				return true;
			}
		});

		//Manually displaying the first fragment - one time only
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id.frame_layout, HomeFragment.newInstance());
		transaction.commit();

	}
	
}
