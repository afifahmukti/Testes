package com.hitesh_sahu.retailapp.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

//*
/**
 * Created by hitesh_sahu on 20/11/2017
 */

public interface ItemTouchHelperAdapter {
    void onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}