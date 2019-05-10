package com.example.swipecards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.swipecards.Adapter.CardAdapter;
import com.example.swipecards.Model.Model;
import com.huxq17.swipecardsview.SwipeCardsView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SwipeCardsView swipeCardsView;
    private List<Model> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeCardsView = findViewById(R.id.swipe);
        swipeCardsView.retainLastCard(false);
        swipeCardsView.enableSwipe(true);
        getData();
    }

    private void getData() {

        modelList.add(new Model("Spider-Man", "https://avatars.mds.yandex.net/get-pdb/1221986/aa0fdf59-91af-41b4-a995-f82f9ae52355/s1200?webp=false"));
        modelList.add(new Model("Mpider-Man", "https://wdb.space/media/2016-4-13/fXVSkBPOkU_scale_300x500.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));
        modelList.add(new Model("Bpider-Man", "https://i.pinimg.com/474x/f1/f7/35/f1f735a350045fd4457b624fdc3b010e--art-pop-spiderman.jpg"));

        CardAdapter cardAdapter = new CardAdapter(modelList, this);
        swipeCardsView.setAdapter(cardAdapter);
    }
}
