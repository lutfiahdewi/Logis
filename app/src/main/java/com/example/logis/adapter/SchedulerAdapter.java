package com.example.logis.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.widget.Toast;

import com.example.logis.R;
import com.example.logis.model.Scheduler;

public class SchedulerAdapter extends RecyclerView.Adapter<SchedulerAdapter.SchedulerViewHolder> {
    private ArrayList<Scheduler> dataList;


    public SchedulerAdapter(ArrayList<Scheduler> dataList) {
        this.dataList = dataList;
    }
    @Override
    public SchedulerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.row_schedule, parent, false);
        return new SchedulerViewHolder(view);
    }
    @Override
    public void onBindViewHolder(SchedulerViewHolder holder, int position) {
        holder.txtGerbong.setText(dataList.get(position).getGerbong());
        holder.txtKeberangkatan.setText(dataList.get(position).getKeberangkatan());
        //holder.txtJamk.setText(dataList.get(position).getJamk());
        holder.txtTujuan.setText(dataList.get(position).getTujuan());
        //holder.txtJamt.setText(dataList.get(position).getJamt());
        holder.txtHarga.setText(dataList.get(position).getHarga());
        holder.txtKapasitas.setText(dataList.get(position).getKapasitas());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    public class SchedulerViewHolder extends RecyclerView.ViewHolder{
        private TextView txtGerbong, txtKeberangkatan, txtJamk, txtTujuan, txtJamt, txtHarga, txtKapasitas;


        public SchedulerViewHolder(View itemView) {
            super(itemView);
            txtGerbong = (TextView)
                    itemView.findViewById(R.id.gerbong);
            txtKeberangkatan = (TextView)
                    itemView.findViewById(R.id.keberangkatan);
            txtJamk = (TextView)
                    itemView.findViewById(R.id.jamk);
            txtTujuan = (TextView)
                    itemView.findViewById(R.id.tujuan);
            txtJamt = (TextView)
                    itemView.findViewById(R.id.jamt);
            txtHarga = (TextView)
                    itemView.findViewById(R.id.harga);
            txtKapasitas = (TextView)
                    itemView.findViewById(R.id.kapasitas);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Kartu Scheduler "+txtGerbong.getText()+" diklik", Toast.LENGTH_SHORT).show();
                }
            });
        }


    }

}
