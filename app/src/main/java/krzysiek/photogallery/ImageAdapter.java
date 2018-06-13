package krzysiek.photogallery;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.wear.widget.BoxInsetLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {

    private LayoutInflater inflater;
    private Activity activity;
    private boolean isRound;

    public ImageAdapter(Activity activity, boolean isRound){
        this.activity = activity;
        this.isRound = isRound;
    }

    @Override
    public int getCount() {
        return Image.images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        ImageView imageView;
        BoxInsetLayout layout = activity.findViewById(R.id.boxInsertLayout);
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View viewLayout = inflater.inflate(R.layout.fullscreen_image, container, false);
        imageView = viewLayout.findViewById(R.id.imageView);


        if(isRound){
            layout.setBackground(ContextCompat.getDrawable(activity.getApplicationContext(), Image.images.get(position).getSource()));
        }else{
            imageView.setImageResource(Image.images.get(position).getSource());
            container.addView(viewLayout);
        }

        return viewLayout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

    }
}
