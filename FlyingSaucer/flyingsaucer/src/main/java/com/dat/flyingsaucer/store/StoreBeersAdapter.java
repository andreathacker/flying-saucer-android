package com.dat.flyingsaucer.store;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dat.flyingsaucer.R;
import com.dat.flyingsaucer.data.dao.StoreBeerItemDao;
import com.dat.flyingsaucer.data.model.StoreBeerItem;

/**
 * Created by davidthacker on 6/4/15.
 */
public class StoreBeersAdapter extends RecyclerView.Adapter<StoreBeersAdapter.ViewHolder> {

    private StoreBeerItemDao mStoreBeerItemDao;

    public StoreBeersAdapter(StoreBeerItemDao storeBeerItemDao) {
        mStoreBeerItemDao = storeBeerItemDao;
    }

    @Override
    public StoreBeersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell_beer, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        StoreBeerItem storeBeerItem = mStoreBeerItemDao.modelList.get(position);

        viewHolder.mTextView.setText(storeBeerItem.name);
    }

    @Override
    public int getItemCount() {
        if (mStoreBeerItemDao.modelList == null) {
            return 0;
        }

        return mStoreBeerItemDao.modelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;

        public ViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.list_cell_beer_title);
        }
    }
}
