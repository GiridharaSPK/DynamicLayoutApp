package com.giridharaspk.samplecustomviews;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.CustomViewHolder> {
    private static final String TAG = SampleAdapter.class.getSimpleName();
    private ArrayList<CustomViewModel> list;
    private Context context;

    public SampleAdapter(ArrayList<CustomViewModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem;
        switch (viewType) {
            case 0:
                listItem = layoutInflater.inflate(R.layout.list_item_text_view, parent, false);
                return new CustomTextViewHolder(listItem, 0);
            case 1:
                listItem = layoutInflater.inflate(R.layout.list_item_button, parent, false);
                return new CustomButtonViewHolder(listItem, 1);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder holder, final int position) {
        Log.e(TAG, "onBindViewHolder" + position);
        switch (holder.getItemViewType()) {
            case 0:
                if (holder instanceof CustomTextViewHolder) {
                    CustomTextViewHolder textViewHolder = (CustomTextViewHolder) holder;
                    textViewHolder.textView.setText(list.get(position).getText());
                }
                break;
            case 1:
                if (holder instanceof CustomButtonViewHolder) {
                    CustomButtonViewHolder buttonViewHolder = (CustomButtonViewHolder) holder;
                    buttonViewHolder.button.setText(list.get(position).getText());
                }
                break;
        }
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        private int viewType;

        CustomViewHolder(@NonNull View itemView, int viewType) {
            super(itemView);
            this.viewType = viewType;
        }
    }

    public class CustomTextViewHolder extends CustomViewHolder {
        private final TextView textView;

        CustomTextViewHolder(@NonNull View itemView, int viewType) {
            super(itemView, viewType);
            this.textView = (TextView) itemView.findViewById(R.id.tvMo);
        }
    }

    public class CustomButtonViewHolder extends CustomViewHolder {

        TextView button;

        CustomButtonViewHolder(@NonNull View itemView, int viewType) {
            super(itemView, viewType);
            this.button = itemView.findViewById(R.id.tvButton);
        }
    }
}
