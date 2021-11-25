package com.android45.foodlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvFood;
    List<Food> foodList;
    Food food01, food02, food03, food04, food05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodList = new ArrayList<>();

        lvFood = findViewById(R.id.lvFood);

        food01 = new Food(R.drawable.food01, "Món Huế", "Phở-Mì-Bún,Cơm,Ẩm thực miền Bắc", "Miễn phí | 45min", "tối thiểu 50.000đ");
        food02 = new Food(R.drawable.food02, "Joma Bakery cafe", "Bánh ngọt, salad, Sandwich", "Miễn phí | 40min", "tối thiểu 200.000đ");
        food03 = new Food(R.drawable.food03, "Donner Kebab 1995", "Món thổ nhỉ kì, Món châu Á khác", "35.000đ | 30min", "tối thiểu 60.000đ");
        food04 = new Food(R.drawable.food04, "Cơm Đại Vương - Cơm Đài Loan", "Cơm, Món Châu Á khác", "50.000đ | 30min", "tối thiểu 130.000đ");
        food05 = new Food(R.drawable.food05, "pizza", "Đồ ăn nhanh", "13.000đ | 30min", "tối thiểu 100.000đ");

        foodList.add(food01);
        foodList.add(food02);
        foodList.add(food03);
        foodList.add(food04);
        foodList.add(food05);

        AdapterFood adapterFood = new AdapterFood(foodList);

        lvFood.setAdapter(adapterFood);
    }
}