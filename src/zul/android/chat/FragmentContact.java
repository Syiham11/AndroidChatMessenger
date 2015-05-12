package zul.android.chat;

import java.util.ArrayList;

import zul.android.chat.adapter.ContactAdapter;
import zul.android.chat.model.ContactModel;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentContact extends Fragment {
	ContactAdapter mContactAdapter;
	ListView contact_list;

	public static FragmentContact newInstance() {
		FragmentContact mFragment = new FragmentContact();
		return mFragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_contact, container,
				false);

		ArrayList<ContactModel> data = new ArrayList<ContactModel>();

		for (int i = 0; i < 10; i++) {
			ContactModel object_data = new ContactModel();
			object_data.setName("John Doe");
			object_data.setEmail("hello@gello.com");
			object_data.setMobile("+628570112489");
			data.add(object_data);
		}

		mContactAdapter = new ContactAdapter(data, getActivity()
				.getBaseContext());

		contact_list = (ListView) rootView.findViewById(R.id.contact_list);
		contact_list.setAdapter(mContactAdapter);

		return rootView;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.main_second, menu);
		menu.clear();

	}

}
