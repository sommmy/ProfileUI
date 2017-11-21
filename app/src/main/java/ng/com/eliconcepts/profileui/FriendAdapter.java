package ng.com.eliconcepts.profileui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Somee on 20/11/2017.
 */

public class FriendAdapter  extends ArrayAdapter<FriendList>{
    public FriendAdapter(Activity context, ArrayList<FriendList> friendLists ) {
        super(context, 0, friendLists);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //convertView is the view we are recycling
        View listView = convertView;
        if(listView ==null){

            listView = LayoutInflater.from(getContext()).inflate(R.layout.friend_unit,parent,false);
        }

        //get object located at this position
        FriendList currentFriendList = getItem(position);

        //find views and set resource
        TextView friendNameView = (TextView) listView.findViewById(R.id.friendName);
        friendNameView.setText(currentFriendList.getName());

        TextView friendTitleView = (TextView) listView.findViewById(R.id.friendTitle);
        friendTitleView.setText(currentFriendList.getTitle());

        ImageView friendImageView = (ImageView) listView.findViewById(R.id.friendImage);
        friendImageView.setImageResource(currentFriendList.getImageResource());


//this returns the whole list contents of the list view and one list in the listview
        return listView;
    }
}
