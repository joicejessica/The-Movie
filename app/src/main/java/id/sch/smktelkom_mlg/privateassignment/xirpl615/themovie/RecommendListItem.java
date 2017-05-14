package id.sch.smktelkom_mlg.privateassignment.xirpl615.themovie;

import java.io.Serializable;

/**
 * Created by Joice Jessica on 5/14/2017.
 */

public class RecommendListItem implements Serializable {
    public String imageUrl;
    public String head;
    // private String desc;

    public RecommendListItem(String imageUrl, String head) {
        this.imageUrl = imageUrl;
        this.head = head;

    }
}


