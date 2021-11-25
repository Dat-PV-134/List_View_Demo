package com.android45.foodlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterFood extends BaseAdapter {
    List<Food> foodList;

    public AdapterFood(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return foodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_food, parent, false);

        ImageView imgFood = view.findViewById(R.id.imgFood);
        TextView tvFoodName = view.findViewById(R.id.tvFoodName);
        TextView tvDes = view.findViewById(R.id.tvDes);
        TextView tvShip = view.findViewById(R.id.tvShip);
        TextView tvMinMoney = view.findViewById(R.id.tvMinMoney);

        Food food = foodList.get(position);

        imgFood.setImageResource(food.getImg());
        tvFoodName.setText(food.getFoodName());
        tvDes.setText(food.getDescription());
        tvShip.setText(food.getShip());
        tvMinMoney.setText(food.getMinMoney());
        return view;
    }
}
