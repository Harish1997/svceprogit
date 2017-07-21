package svce.svcepro;

/**
 * Created by harishananth on 16/07/17.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class newsView_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title,desc;
    ImageView newimg;

    newsView_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardViewnews);
        title = (TextView) itemView.findViewById(R.id.newstitle);
        desc=(TextView)itemView.findViewById(R.id.newssubtitle);
        newimg=(ImageView)itemView.findViewById(R.id.newsimg);

    }
}