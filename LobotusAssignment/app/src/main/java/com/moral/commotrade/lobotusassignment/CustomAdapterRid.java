package com.moral.commotrade.lobotusassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapterRid extends RecyclerView.Adapter<CustomAdapterRid.ViewHolder> {

    private List<RID> dataList;
    private Context context;

    public CustomAdapterRid(List<RID> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_rip, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomAdapterRid.ViewHolder holder, int position) {
        String userripid = dataList.get(position).rID;
        String userproductset = dataList.get(position).controllerItemCode;
        String userpumpid = dataList.get(position).pumpHeadSrNo;
        String usermotorid = dataList.get(position).motorSerialNumber;
        String userripcontroller = dataList.get(position).controllerSerialNumber;

        holder.ripid.setText(userripid);
        holder.productset.setText(userproductset);
        holder.pumpid.setText(userpumpid);
        holder.ridmotor.setText(usermotorid);
        holder.ripcontroller.setText(userripcontroller);
    }

    @Override
    public int getItemCount() {
        return this.dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView ripid,productset,pumpid,ridmotor,ripcontroller;


        public ViewHolder(View itemView) {
            super(itemView);
            ripid = itemView.findViewById(R.id.ripid);
            productset = itemView.findViewById(R.id.productset);
            pumpid = itemView.findViewById(R.id.pumpid);
            ridmotor = itemView.findViewById(R.id.ridmotor);
            ripcontroller = itemView.findViewById(R.id.ripcontroller);

        }
    }

}
