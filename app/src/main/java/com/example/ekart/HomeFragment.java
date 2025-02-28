package com.example.ekart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.ArrayList;



import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    private ViewPager2 carouselViewPager;
    private GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Carousel setup
        //carouselViewPager = view.findViewById(R.id.carousel_viewpager);
        //CarouselAdapter carouselAdapter = new CarouselAdapter(getCarouselItems());
        //carouselViewPager.setAdapter(carouselAdapter);

        // GridView setup
        gridView = view.findViewById(R.id.grid_view);
        GridAdapter gridAdapter = new GridAdapter(getContext(), getGridItems());
        gridView.setAdapter(gridAdapter);

        return view;
    }

    private ArrayList<Integer> getCarouselItems() {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(R.drawable.carousel1);
        items.add(R.drawable.carousel2);
        items.add(R.drawable.carousel3);
        return items;
    }

    private ArrayList<Object> getGridItems() {
        ArrayList<Object> items = new ArrayList<>();
        items.add(new GridItem(R.drawable.ic_home, "Item 1"));
        items.add(new GridItem(R.drawable.ic_menu_search, "Item 2"));
        items.add(new GridItem(R.drawable.ic_cart, "Item 3"));

        return items;
    }
}

