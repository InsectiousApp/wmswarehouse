package com.example.akshay.warehouse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.akshay.warehouse.models.Rtag;

import java.util.List;

/**
 * Created by akshay on 29/10/15.
 */
public class PutawayListAdapter extends BaseAdapter {

    private Context _context;
    private List<Rtag> rtags;
    private static final int[] EMPTY_STATE_SET = {};
    private static final int[] GROUP_EXPANDED_STATE_SET = { android.R.attr.state_expanded };
    private static final int[][] GROUP_STATE_SETS = { EMPTY_STATE_SET, // 0
            GROUP_EXPANDED_STATE_SET // 1
    };

    public PutawayListAdapter(Context context, List<Rtag> rtags) {
        this._context = context;
        this.rtags = rtags;

           }


    @Override
    public int getCount() {
        return rtags.size();
    }

    @Override
    public Object getItem(int position) {
        return rtags.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Rtag parentGroup = (Rtag) rtags.get(position);
        String headerTitle = parentGroup.getRtagNo();
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.putaway_list_rtag_item, null);
        }

        TextView rtagNo = (TextView) convertView.findViewById(R.id.rtagname);
        TextView clientCode= (TextView) convertView.findViewById(R.id.client_code);
        TextView status= (TextView) convertView.findViewById(R.id.status);
        TextView completed_by= (TextView) convertView.findViewById(R.id.completed_by);
        TextView completion_date= (TextView) convertView.findViewById(R.id.putaway_date);

        rtagNo.setText(headerTitle);
        clientCode.setText(parentGroup.getClientCode());
        status.setText(parentGroup.isPutAwayStatus()? "3":"7");
        completed_by.setText(parentGroup.getPutAwayCompletedBy());
        completion_date.setText(parentGroup.getPutAwayDate());

        return convertView;    }



}
