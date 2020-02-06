package me.mehadih.retrofitlivedatamvvmrecyclerview.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created By - Mehadi
 * Created On - 2/6/2020 : 3:21 PM
 * Email - hi@mehadih.me
 * Website - www.mehadih.me
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    private int currentPosition;

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    protected abstract void clear();

    public void onBind(int position) {
        currentPosition = position;
        clear();
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

}
