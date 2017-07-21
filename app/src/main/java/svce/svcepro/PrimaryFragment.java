package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class PrimaryFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.primary_layout,null);

        List<data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerviewcat);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getActivity());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManagaer);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0:
                                Intent nejintent=new Intent(getActivity(),aboutcollege.class);
                                startActivity(nejintent);
                                break;
                            case 1:
                                Intent intent=new Intent(getActivity(),rsemester.class);
                                startActivity(intent);
                                break;
                            case 2:
                                Intent nintent=new Intent(getActivity(),bustab.class);
                                startActivity(nintent);
                                break;
                            case 3:
                                Intent neintent=new Intent(getActivity(),webloader.class);
                                neintent.putExtra("firsel",5);
                                startActivity(neintent);
                                break;
                            case 4:
                                Intent neointent=new Intent(getActivity(),clubspie.class);
                                startActivity(neointent);
                                break;
                            case 5:
                                Intent nepintent=new Intent(getActivity(),studentasso.class);
                                startActivity(nepintent);
                                break;
                            case 6:
                                Intent neqintent=new Intent(getActivity(),bout.class);
                                startActivity(neqintent);
                                break;
                            case 7:
                                Intent newintent=new Intent(getActivity(),busroutes.class);
                                startActivity(newintent);
                                break;
                            case 8:
                                Intent newintentt=new Intent(getActivity(),bedev.class);
                                startActivity(newintentt);
                                break;
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                                //Toast.makeText(getActivity(),"item one long",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        // do whatever
                    }
                })
        );

        {
            List<svceimgdata> svceimgdatas = fill_with_dataimg();

            RecyclerView recyclerView2 = (RecyclerView)view.findViewById(R.id.recyclerviewimg);
            svceimgrecyadapter adapter2 = new svceimgrecyadapter(svceimgdatas,getActivity());
            recyclerView2.setAdapter(adapter2);
            LinearLayoutManager horizontalLayoutManagaer2
                    = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
            recyclerView2.setLayoutManager(horizontalLayoutManagaer2);


            RecyclerView.ItemAnimator itemAnimator2 = new DefaultItemAnimator();
            itemAnimator2.setAddDuration(1000);
            itemAnimator2.setRemoveDuration(1000);
            recyclerView2.setItemAnimator(itemAnimator);

            recyclerView2.addOnItemTouchListener(
                    new RecyclerItemClickListener(getActivity(), recyclerView2 ,new RecyclerItemClickListener.OnItemClickListener() {
                        @Override public void onItemClick(View view, int position) {
                            switch (position)
                            {

                            }
                            // do whatever
                        }

                        @Override public void onLongItemClick(View view, int position) {
                            switch (position)
                            {
                                case 1:
                                    //Toast.makeText(getActivity(),"item one long",Toast.LENGTH_SHORT).show();
                                    break;
                            }
                            // do whatever
                        }
                    })
            );

        }
        return view;

    }
    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

        data.add(new data("SVCE", "Short description on the instituition and its principles", R.drawable.svcesmall));
        data.add(new data("Student Corner", "Dig into this section for notes,timetables,question papers and many other essential resources", R.drawable.student));
        data.add(new data("Bus Schedule", "Anyone can drive a car,It takes someone special to drive a college bus", R.drawable.svcebus));
        data.add(new data("Anti Ragging", "Blowing out someone else's candle doesnt make yours shine any brighter", R.drawable.bully));
        data.add(new data("Clubs", "Let the enthusiasm and energy of the group be your fuel", R.drawable.gllb));
        data.add(new data("Student Association", "Its nice to be important but its more important to be nice", R.drawable.grptt));
        data.add(new data("Developers", "Three fundamental aspects for software development Lazy,Simple and Perfect", R.drawable.smp));
        data.add(new data("Bus Routes", "Two roads diverged in a wood and I took the one less travelled by and that has made all the difference", R.drawable.busroute));
        data.add(new data("Be a developer", "Innovation distinguishes between a leader and a follower", R.drawable.bedev));
        return data;
    }

    public List<svceimgdata> fill_with_dataimg() {

        List<svceimgdata> data = new ArrayList<>();


        data.add(new svceimgdata("Abacus Montessori", R.drawable.svce));
        data.add(new svceimgdata("St.Michael's Academy", R.drawable.svceentrance));
        data.add(new svceimgdata("St Francis International", R.drawable.svceold));
        data.add(new svceimgdata("Vael's Billabong High International", R.drawable.svceaudit));
        data.add(new svceimgdata("The School - KFI", R.drawable.svcehostel));
        data.add(new svceimgdata("Sishya School", R.drawable.svcebuil));
        data.add(new svceimgdata("Chettinad Hari Shree Vidyalam", R.drawable.svcecir));


        return data;
    }



}