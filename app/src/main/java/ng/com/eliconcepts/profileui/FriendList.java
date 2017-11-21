package ng.com.eliconcepts.profileui;

/**
 * Created by Somee on 20/11/2017.
 */

public class FriendList {

    //an object of the friend list should contain one of the following
    String name;
    String title;
    int imageResource;

    //creating an object (ie combining all the above stated items
    public  FriendList(String fName, String fTitle, int fImageResource){
        name = fName;
        title = fTitle;
        imageResource = fImageResource;

    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResource() {
        return imageResource;
    }
}
