package zul.android.chat.room;

import zul.android.chat.R;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentPublicChat extends Fragment {

	public static FragmentPublicChat newInstance() {
		FragmentPublicChat mFragment = new FragmentPublicChat();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_public_chat,
				container, false);
		rootView.setBackgroundColor(Color.parseColor("#01579B"));
		return rootView;
	}
}
