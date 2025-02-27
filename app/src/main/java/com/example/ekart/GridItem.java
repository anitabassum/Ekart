package com.example.ekart;

public class GridItem {
    private final int imageResource;
    private final String text;

    public GridItem(int imageResource, String text) {
        this.imageResource = imageResource;
        this.text = text;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getText() {
        return text;
    }
}