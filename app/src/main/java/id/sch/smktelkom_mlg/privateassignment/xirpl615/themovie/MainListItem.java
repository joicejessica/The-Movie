package id.sch.smktelkom_mlg.privateassignment.xirpl615.themovie;

/**
 * Created by Joice Jessica on 5/14/2017.
 */

public class MainListItem {
    private String imageUrl;
    private String head;
    private String desc;

    public MainListItem(String imageUrl, String head, String desc) {
        this.imageUrl = imageUrl;
        this.head = head;
        this.desc = desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getHead() {
        return head;

    }

    public String getDesc() {
        return desc;

    }
}
