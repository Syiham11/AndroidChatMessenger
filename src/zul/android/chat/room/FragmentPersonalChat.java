package zul.android.chat.room;

import zul.android.chat.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentPersonalChat extends Fragment {

	public static FragmentPersonalChat newInstance() {
		FragmentPersonalChat mFragment = new FragmentPersonalChat();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_personal_chat,
				container, false);

		return rootView;
	}
}
