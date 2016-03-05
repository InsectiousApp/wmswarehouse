package com.example.akshay.warehouse.putaway;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.akshay.warehouse.R;
import com.example.akshay.warehouse.models.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akshay on 31/10/15.
 */

public class PutawayListDetailsFragment extends Fragment {

    private ListView detailsList;
    private PutawayDetailsListAdapter detailsListAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.putaway_list_detail, container, false);
        detailsList= (ListView) rootView.findViewById(R.id.putaway_details_list);

        List<Product> products=new ArrayList<Product>();

        products.add(new Product("001","A1","batch 1","q1","br001","ww1","a","s","d",false));
        products.add(new Product("023","A2","batch 1","q2","br002","ww1","a","s","d",true));
        products.add(new Product("033","A3","batch 1","q3","br003","ww1","a","s","d",false));
        products.add(new Product("002","A4","batch 2","q4","br004","ww2","a","s","d",true));

        detailsListAdapter=new PutawayDetailsListAdapter(getActivity(),products,getResources());
        detailsList.setAdapter(detailsListAdapter);

        return rootView;
    }
}
