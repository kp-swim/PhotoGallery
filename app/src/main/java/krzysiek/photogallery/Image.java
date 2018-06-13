package krzysiek.photogallery;

import java.util.ArrayList;
import java.util.List;

public class Image {

    public static List<Image> images = new ArrayList<>();
    static{
        images.add(new Image(R.drawable.kot));
        images.add(new Image(R.drawable.pies));
        images.add(new Image(R.drawable.koza));
        images.add(new Image(R.drawable.krowa));
    }

    private int source;

    public Image(int source){
        this.source = source;
    }


    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}
