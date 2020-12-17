package com.curridevd.crimemanagement.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.curridevd.crimemanagement.Model.Crime;
import com.curridevd.crimemanagement.R;
import com.curridevd.crimemanagement.databinding.ActivityMainBinding;

public class MainActivity extends FragmentActivity {
	private ActivityMainBinding binding;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = ActivityMainBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.fragment_container);
		if (fragment == null) {
			fragment = new CrimeFragment();
			fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
		}
	}
}