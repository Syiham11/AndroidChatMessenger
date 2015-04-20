package zul.android.chat.adapter;

import zul.android.chat.FragmentContact;
import zul.android.chat.R;
import zul.android.chat.room.FragmentListGroupChat;
import zul.android.chat.room.FragmentPersonalChat;
import zul.android.chat.room.FragmentPublicChat;
import android.app.Activity;
import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

	TypedArray fragment_icon;
	String fragment_title[];

	public ViewPagerAdapter(Activity activity, FragmentManager fm) {
		super(fm);
		fragment_icon = activity.getResources().obtainTypedArray(
				R.array.sliding_tab_icon);
		fragment_title = activity.getResources().getStringArray(
				R.array.fragment_title);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return fragment_title[position];
	}

	@Override
	public int getCount() {
		return 4;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			return FragmentContact.newInstance();
		case 1:
			return FragmentPersonalChat.newInstance();
		case 2:
			return FragmentListGroupChat.newInstance();
		case 3:
			return FragmentPublicChat.newInstance();
		}

		return null;
	}

}
