package com.curridevd.crimemanagement.UI;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.curridevd.crimemanagement.Model.Crime;
import com.curridevd.crimemanagement.R;
import com.curridevd.crimemanagement.databinding.FragmentCrimeBinding;

public class CrimeFragment extends Fragment {
	FragmentCrimeBinding binding;
	private Crime mCrime;

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mCrime = new Crime();
	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
							 @Nullable Bundle savedInstanceState) {
		binding = FragmentCrimeBinding.inflate(inflater, container,false);
		initView();
		initListener();
		return binding.getRoot();
	}

	protected void initView()
	{
		String dateDisplay = mCrime.getDate().toString();
		binding.fragmentDate.setText(dateDisplay);
		binding.fragmentDate.setEnabled(false);
	}

	protected void initListener()
	{
		binding.fragmentCrimeTitle.addTextChangedListener(new TextWatcher() {
			@Override
			public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

			}

			@Override
			public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
				mCrime.setTitle(charSequence.toString());
			}

			@Override
			public void afterTextChanged(Editable editable) {

			}
		});

		binding.fragmentSolvedBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
				mCrime.setSolved(b);
			}
		});
	}
}
