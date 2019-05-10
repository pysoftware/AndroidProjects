package com.example.swipecards.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.swipecards.Model.Model;
import com.example.swipecards.R;
import com.huxq17.swipecardsview.BaseCardAdapter;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CardAdapter extends BaseCardAdapter {


    private List<Model> modelList;
    private Context context;

    public CardAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public int getCardLayoutId() {
        return R.layout.card_item;
    }

    @Override
    public void onBindData(int position, View cardview) {
        if (modelList == null || modelList.size() == 0){
            return;
        }

        ImageView imageView = cardview.findViewById(R.id.imageView);
        TextView textView = cardview.findViewById(R.id.textView);
        Model model = modelList.get(position);
        textView.setText(model.getTitle());
        Picasso.with(context).load(model.getImage()).into(imageView);
    }
}
