package com.curridevd.crimemanagement.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
	private static CrimeLab instance;
	private ArrayList<Crime> mCrimes;

	private CrimeLab(Context context)
	{
		mCrimes = new ArrayList<>();
		for (int i=0; i < 50; i++)
		{
			Crime crime = new Crime();
			crime.setTitle("Crime # "+ i);
			if (i%2 ==0)
			{
				crime.setSolved(true);
			}
			else crime.setSolved(false);
			mCrimes.add(crime);
		}
	}

	public static CrimeLab getInstance(Context context)
	{
		if (instance == null)
		{
			instance = new CrimeLab(context);
		}
		return instance;
	}

	public ArrayList<Crime> getCrimes()
	{
		return mCrimes;
	}

	public Crime getCrime (UUID Id)
	{
		for (Crime crime : mCrimes)
		{
			if (crime.getID().equals(Id))
			{
				return crime;
			}
		}
		return null;
	}

}
