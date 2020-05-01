package com.example.gofood;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMakananAdapter extends RecyclerView.Adapter<ListMakananAdapter.ListViewHolder> {
    private Context context;
    public void setContext(Context context) {
        this.context = context;
    }

    private ArrayList<Makanan> listProduct;
    public ListMakananAdapter(ArrayList<Makanan> list) {
        this.listProduct = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Makanan product = listProduct.get(position);
        Glide.with(holder.itemView.getContext())
                .load(product.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(product.getNamaMakanan());
        holder.tvDetail.setText(product.getDetailMakanan());
        holder.tv_Harga.setText(product.getHargaMakanan());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityDetail = new Intent(context, ActivityDetail.class);
                activityDetail.putExtra(ActivityDetail.EXTRA_SPEC, listProduct.get(position));
                context.startActivity(activityDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tv_Harga;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tv_Harga = itemView.findViewById(R.id.tv_harga);

        }
    }
}
