package com.moral.commotrade.lobotusassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<BID> dataList;
    private Context context;

    public CustomAdapter(List<BID> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_bid, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        String userbidid = dataList.get(position).bID_ID;
        String userbidname = dataList.get(position).customerName;
        String userbidphone = dataList.get(position).mobile.toString();
        String userbidvillage = dataList.get(position).village;
        String userbidaadhar = dataList.get(position).adharNo;
        String userbiddistrict = dataList.get(position).district;
        String userbidstate = dataList.get(position).state;

        holder.bidid.setText(": "+userbidid);
        holder.bidname.setText(": "+userbidname);
        holder.bidphone.setText(": "+userbidphone);
        holder.bidvillage.setText(": "+userbidvillage);
        holder.bidaadhar.setText(": "+userbidaadhar);
        holder.biddistrict.setText(": "+userbiddistrict);
        holder.bidstate.setText(": "+userbidstate);
    }

    @Override
    public int getItemCount() {
        return this.dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView bidid,bidname,bidphone,bidvillage,bidaadhar,biddistrict,bidstate;


        public ViewHolder(View itemView) {
            super(itemView);
            bidid = itemView.findViewById(R.id.bidid);
            bidname = itemView.findViewById(R.id.bidname);
            bidphone = itemView.findViewById(R.id.bidphone);
            bidvillage = itemView.findViewById(R.id.bidvillage);
            bidaadhar = itemView.findViewById(R.id.bidaadhar);
            biddistrict = itemView.findViewById(R.id.biddistrict);
            bidstate = itemView.findViewById(R.id.bidstate);
        }
    }

}
