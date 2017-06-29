package svce.svcepro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harishananth on 20/12/16.
 */

public class Maincant extends AppCompatActivity {
    int x=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        List<cdata> cdata = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mcrecyadapter adapter = new mcrecyadapter(cdata,Maincant.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(Maincant.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0:
                                Intent intent=new Intent(Maincant.this,maincantlist.class);
                                intent.putExtra("mainselec",1);
                                intent.putExtra("mainsel",1);
                                startActivity(intent);
                                break;
                            case 1:
                                Intent intent1=new Intent(Maincant.this,maincantlist.class);
                                intent1.putExtra("mainselec",2);
                                intent1.putExtra("mainsel",1);
                                startActivity(intent1);
                                break;
                            case 2:
                                Intent intent2=new Intent(Maincant.this,maincantlist.class);
                                intent2.putExtra("mainselec",3);
                                intent2.putExtra("mainsel",1);
                                startActivity(intent2);
                                break;
                            case 3:
                                Intent intent3=new Intent(Maincant.this,maincantlist.class);
                                intent3.putExtra("mainselec",4);
                                intent3.putExtra("mainsel",1);
                                startActivity(intent3);
                                break;
                            case 4:
                                Intent intent4=new Intent(Maincant.this,maincantlist.class);
                                intent4.putExtra("mainselec",5);
                                intent4.putExtra("mainsel",1);
                                startActivity(intent4);
                                break;
                            case 5:
                                Intent intent5=new Intent(Maincant.this,maincantlist.class);
                                intent5.putExtra("mainselec",6);
                                intent5.putExtra("mainsel",1);
                                startActivity(intent5);
                                break;
                            case 6:
                                Intent intent6=new Intent(Maincant.this,maincantlist.class);
                                intent6.putExtra("mainselec",7);
                                intent6.putExtra("mainsel",1);
                                startActivity(intent6);
                                break;
                            case 7:
                                Intent intent7=new Intent(Maincant.this,maincantlist.class);
                                intent7.putExtra("mainselec",8);
                                intent7.putExtra("mainsel",1);
                                startActivity(intent7);
                                break;
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                                //Toast.makeText(Maincant.this,"item one long",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(Maincant.this,userrate.class);
                                startActivity(intent);
                                break;
                        }
                        // do whatever
                    }
                })
        );
    }
    public List<cdata> fill_with_data() {

        List<cdata> data = new ArrayList<>();

        data.add(new cdata("Breakfast", (float) 4,"Rs 45", R.drawable.breakfast));
        data.add(new cdata("Lunch", (float) 4.5,"Rs 30", R.drawable.meals));
        data.add(new cdata("Snacks",(float) 3.5 ,"Rs 10 per piece", R.drawable.burgr));
        data.add(new cdata("Chocolates", (float) 5,"Rs 5/10/20", R.drawable.choc));
        data.add(new cdata("Parle biscuits", (float) 3,"Rs 5/10/20", R.drawable.parlebis));
        data.add(new cdata("Chips", (float) 5,"Rs 5/10/20", R.drawable.bchips));
        data.add(new cdata("Britannia biscuits", (float) 3,"Rs 5/10/20", R.drawable.britbisc));
        data.add(new cdata("Soft drinks", (float) 5,"Rs 5/10/20", R.drawable.sodacan));
        return data;
    }
}
