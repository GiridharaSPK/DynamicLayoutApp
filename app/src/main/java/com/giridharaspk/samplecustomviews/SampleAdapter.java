package com.giridharaspk.samplecustomviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.CustomViewHolder> {
    private static final String TAG = SampleAdapter.class.getSimpleName();
    private ArrayList<CustomViewModel> list;
    private Context context;
    private ArrayAdapter adapter;

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
                listItem = layoutInflater.inflate(R.layout.layout_edittext, parent, false);
                return new CustomEditTextViewHolder(listItem, 1);
            case 3:
                listItem = layoutInflater.inflate(R.layout.layout_spinner, parent, false);
                return new CustomSpinnerViewHolder(listItem, 3);
            case 4:
                listItem = layoutInflater.inflate(R.layout.list_item_button, parent, false);
                return new CustomButtonViewHolder(listItem, 4);
        }
        listItem = layoutInflater.inflate(R.layout.list_item_text_view, parent, false);
        return new CustomViewHolder(listItem, 100);
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
        switch (holder.getItemViewType()) {
            case 0:
                if (holder instanceof CustomTextViewHolder) {
                    CustomTextViewHolder textViewHolder = (CustomTextViewHolder) holder;
                    textViewHolder.textView.setText(list.get(position).getText());
                    textViewHolder.textView.setTextSize(list.get(position).getTextSize());
                }
                break;
            case 1:
                if (holder instanceof CustomEditTextViewHolder) {
                    CustomEditTextViewHolder editTextViewHolder = (CustomEditTextViewHolder) holder;
                    editTextViewHolder.editText.setHint(list.get(position).getHint());
                    editTextViewHolder.editText.setTextSize(list.get(position).getTextSize());
                    String name = editTextViewHolder.editText.getText().toString();
                }
                break;
            case 3:
                if (holder instanceof CustomSpinnerViewHolder) {
                    CustomSpinnerViewHolder spinnerViewHolder = (CustomSpinnerViewHolder) holder;
                    adapter = new ArrayAdapter(context, R.layout.spinner_text_view, list);
                    spinnerViewHolder.spinner.setAdapter(adapter);
                    ArrayList<String> spinnerList = new ArrayList();
                    spinnerList.add("SELECT");
//                    spinnerList.addAll(list.get(position).getStringList());
                }
                break;
            case 4:
                if (holder instanceof CustomButtonViewHolder) {
                    CustomButtonViewHolder buttonViewHolder = (CustomButtonViewHolder) holder;
                    buttonViewHolder.button.setText(list.get(position).getText());
                    buttonViewHolder.button.setTextSize(list.get(position).getTextSize());
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
            this.textView = itemView.findViewById(R.id.tvMo);
        }
    }

    public class CustomEditTextViewHolder extends CustomViewHolder {
        EditText editText;

        CustomEditTextViewHolder(@NonNull View itemView, int viewType) {
            super(itemView, viewType);
            this.editText = itemView.findViewById(R.id.edit_text);
        }
    }

    public class CustomButtonViewHolder extends CustomViewHolder {
        Button button;

        CustomButtonViewHolder(@NonNull View itemView, int viewType) {
            super(itemView, viewType);
            this.button = itemView.findViewById(R.id.button);
        }
    }

    public class CustomSpinnerViewHolder extends CustomViewHolder {
        Spinner spinner;

        CustomSpinnerViewHolder(@NonNull View itemView, int viewType) {
            super(itemView, viewType);
            this.spinner = itemView.findViewById(R.id.spinner);
        }
    }

}
