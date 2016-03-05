package com.example.akshay.warehouse.putaway;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.akshay.warehouse.PutawayListAdapter;
import com.example.akshay.warehouse.R;
import com.example.akshay.warehouse.models.Product;
import com.example.akshay.warehouse.models.Rtag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akshay on 31/10/15.
 */
public class PutawayListFragment extends Fragment {

    private ListView putawayListView;
    private PutawayListAdapter putawayListAdapter;
    private OnItemPutawayItemSelectedListener onItemPutawayItemSelectedListener;

    public interface OnItemPutawayItemSelectedListener {
        // This can be any number of events to be sent to the activity
        public void onItemSelected(Rtag selected);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.putaway_list, container, false);

        List<Rtag> rtags=new ArrayList<Rtag>();
        List<Product> products=new ArrayList<Product>();
        products.add(new Product("001","A1","batch 1","q1","ss1","ww1","a","s","d",false));
        products.add(new Product("023","A2","batch 1","q1","ss1","ww1","a","s","d",true));
        products.add(new Product("033","A3","batch 1","q1","ss1","ww1","a","s","d",false));
        products.add(new Product("002","A4","batch 2","q2","ss2","ww2","a","s","d",true));
        rtags.add(new Rtag("001","AMAZON",false,"21/4/14","RAHUL",products));
        rtags.add(new Rtag("002","FLIP",false,"21/4/14","RAHUL",products));
        rtags.add(new Rtag("003","SNAP",true,"15/3/15","ARJUN",products));
        rtags.add(new Rtag("004","EBAY",true,"07/09/15","HEMANT",products));
        rtags.add(new Rtag("001","AMAZON",false,"21/4/14","RAHUL",products));
        rtags.add(new Rtag("002","FLIP",false,"21/4/14","RAHUL",products));

        putawayListView= (ListView) rootView.findViewById(R.id.putaway_expandable_list_view);
        putawayListAdapter =new PutawayListAdapter(getActivity().getApplicationContext(),rtags);
        putawayListView.setAdapter(putawayListAdapter);
        putawayListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Rtag clickedRtag= (Rtag) parent.getItemAtPosition(position);
                Log.i("clicked", "item");
                Toast.makeText(getActivity().getApplicationContext(),"click",Toast.LENGTH_SHORT).show();
                onItemPutawayItemSelectedListener.onItemSelected(clickedRtag);
            }
        });
        return rootView;

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof OnItemPutawayItemSelectedListener) {
            onItemPutawayItemSelectedListener = (OnItemPutawayItemSelectedListener) activity;
        } else {
            throw new ClassCastException(activity.toString()
                    + " must implement MyListFragment.OnItemSelectedListener");
        }
    }
    }


