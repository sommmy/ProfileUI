package ng.com.eliconcepts.profileui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView friendListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define needed views
        friendListView = (ListView) findViewById(R.id.friendListView);

        //set a footer for the list view, first use the layout inflator
        LayoutInflater inflater = getLayoutInflater();
        LinearLayout listFooter = (LinearLayout)inflater.inflate(R.layout.footer, null);
        friendListView.addFooterView(listFooter);

        //I would  need to define a list of objects
ArrayList<FriendList> friendLists = new ArrayList<>();
friendLists.add(new FriendList("Sommy Dragster","Photographer",R.drawable.friend1));
        friendLists.add(new FriendList("Anthony Warlord","Chef",R.drawable.friend2));
        friendLists.add(new FriendList("Melony brown","Model",R.drawable.friend3));


        //ser the adapter
        FriendAdapter friendAdapter = new FriendAdapter(this,friendLists);
        friendListView.setAdapter(friendAdapter);

        //on create ends here
    }
}
