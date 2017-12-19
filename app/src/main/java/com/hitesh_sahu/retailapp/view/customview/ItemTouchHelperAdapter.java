package com.hitesh_sahu.retailapp.view.customview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/*
 /**
   * Created by hitesh_sahu on 20/11/2017
   */

public interface ItemTouchHelperAdapter {


    boolean onItemMove(int fromPosition, int toPosition);



    void onItemDismiss(int position);
}
