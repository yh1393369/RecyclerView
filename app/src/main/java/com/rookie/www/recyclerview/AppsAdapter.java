package com.rookie.www.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    public AppsViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        final AppsViewHolder viewHolder = new AppsViewHolder(view);
        ((ImageView)view.findViewById(R.id.ivApp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(), "点击图片" + apps.get(viewHolder.getAdapterPosition()).getAppName(), Toast.LENGTH_SHORT).show();
            }
        });
        ((TextView)view.findViewById(R.id.tvAppName)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(), "点击文字" + apps.get(viewHolder.getAdapterPosition()).getAppName(), Toast.LENGTH_SHORT).show();
            }
        });
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
