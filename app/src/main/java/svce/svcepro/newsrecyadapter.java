package svce.svcepro;

/**
 * Created by harishananth on 16/07/17.
 */
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Created by harishananth on 20/12/16.
 */

public class newsrecyadapter extends RecyclerView.Adapter<newsView_Holder> {

    List<newsdata> list = Collections.emptyList();
    Context context;

    public newsrecyadapter(List<newsdata> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public newsView_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.newscard, parent, false);
        newsView_Holder holder = new newsView_Holder(v);
        return holder;

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onBindViewHolder(newsView_Holder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);
        //holder.description.setText(list.get(position).description)
        holder.desc.setText(list.get(position).desc);
            Glide.with(context).load(list.get(position).url).into(holder.newimg);
     if(Objects.equals(list.get(position).url, "none"))
         holder.newimg.getLayoutParams().height=20;
        //animate(holder);

    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
    public void insert(int position, newsdata cdata) {
        list.add(position, cdata);
        notifyItemInserted(position);
    }

    // Remove a RecyclerView item containing a specified Data object
    public void remove(newsdata cdata) {
        int position = list.indexOf(cdata);
        list.remove(position);
        notifyItemRemoved(position);
    }

}
