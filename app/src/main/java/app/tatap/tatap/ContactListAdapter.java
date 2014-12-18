package app.tatap.tatap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

/**
 * Created by ethanswoo on 12/17/14.
 */
public class ContactListAdapter extends ArrayAdapter<String> {
    public ContactListAdapter(Context context, String[] values) {
        super(context, R.layout.contactlist, values);
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View ContactListView = theInflater.inflate(R.layout.contactlist,
                parent, false);

        String userContact = getItem(position);

        TextView theTextView = (TextView) ContactListView.findViewById(R.id.UserIDView);

        theTextView.setText(userContact);

        ImageView theImageView = (ImageView) ContactListView.findViewById(R.id.ProfilePicView );

        theImageView.setImageResource(R.drawable.hg);

        return ContactListView;
    }
}
