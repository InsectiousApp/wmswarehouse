package com.example.akshay.warehouse.putaway;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.akshay.warehouse.R;
import com.example.akshay.warehouse.models.Product;

import java.util.List;

/**
 * Created by akshay on 31/10/15.
 */
public class PutawayDetailsListAdapter extends BaseAdapter {


    TextView tvbarcode, tvlocationcode, tvproductcode, tvrtagno, tvbatchno, tvlotno, tvproductclass, tvmfgdate, tvexpdate;



    public static class ViewHolder{


        public TextView text;

        public TextView text1;
        public TextView textWide;
        public ImageView image;







    }

    private List<Product> list;
    private Context mcontext;
    private static LayoutInflater inflater=null;
    public Resources res;

    public PutawayDetailsListAdapter(Activity activity,List<Product> list,Resources resLocal){
        this.list=list;
        this.mcontext=activity.getApplicationContext();
        res = resLocal;
        inflater = ( LayoutInflater )activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        ViewHolder holder;

        if(convertView==null){
            vi = inflater.inflate(R.layout.putaway_list_product_item, null);
            holder = new ViewHolder();
          //  holder.text = (TextView) vi.findViewById(R.id.product_id);
           // holder.text1=(TextView)vi.findViewById(R.id.product_rtag);
           // vi.setTag( holder );
        }
      //  else
            holder=(ViewHolder)vi.getTag();

      //  if(list.size()<=0)
      //  {
           // holder.text.setText("No Data");

     //   }
       // else
      //  {
            Product product=list.get(position);
           // holder.text.setText( product.getProductId() );
           // holder.text1.setText( product.getRtagNo());

        tvbarcode=(TextView)vi.findViewById(R.id.putaway_product_barcode);
        tvlocationcode=(TextView)vi.findViewById(R.id.putaway_product_locationcode);
        tvproductcode=(TextView)vi.findViewById(R.id.putaway_product_productcode);
        tvrtagno=(TextView)vi.findViewById(R.id.putaway_product_rtagno);
        tvbatchno=(TextView)vi.findViewById(R.id.putaway_product_batchno);
        tvlotno=(TextView)vi.findViewById(R.id.putaway_product_lotno);
        tvproductclass=(TextView)vi.findViewById(R.id.putaway_product_productclass);
        tvmfgdate=(TextView)vi.findViewById(R.id.putaway_product_mfgdate);
        tvexpdate=(TextView)vi.findViewById(R.id.putaway_product_expdate);


        tvbarcode.setText(product.getBarCode());
        tvlocationcode.setText(product.getLoctionCode());
        tvproductcode.setText(product.getProductId());
        tvrtagno.setText(product.getRtagNo());
        tvbatchno.setText(product.getBatchNo());
        tvlotno.setText(product.getLotNo());
        tvproductclass.setText(product.getProductClass());
        tvmfgdate.setText(product.getMfgDate());
        tvexpdate.setText(product.getExpDate());


        return vi;
    }
}
