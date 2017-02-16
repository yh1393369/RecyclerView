package com.rookie.www.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hi on 2017/2/16.
 */

public class AppsAdapter extends RecyclerView.Adapter<AppsAdapter.AppsViewHolder> {

    private List<AppEntity> apps;

    static class AppsViewHolder extends RecyclerView.ViewHolder {

        ImageView ivApp;
        TextView tvAppName;

        public AppsViewHolder(View itemView) {
            super(itemView);
            ivApp = (ImageView) itemView.findViewById(R.id.ivApp);
            tvAppName = (TextView) itemView.findViewById(R.id.tvAppName);
        }
    }

    public AppsAdapter(List<AppEntity> apps){
        this.apps = apps;
    }

    @Override
    public AppsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        AppsViewHolder viewHolder = new AppsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AppsViewHolder holder, int position) {
        AppEntity app = apps.get(position);
        holder.ivApp.setImageResource(app.getAppId());
        holder.tvAppName.setText(app.getAppName());
    }

    @Override
    public int getItemCount() {
        return apps.size();
    }
}
