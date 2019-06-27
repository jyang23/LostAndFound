package com.pair;


public class Item {
    private String item_id;
    private String name;
    private String category;
    private boolean lost;


    public Item(String id, String n, String cat, boolean state)
    {
        item_id = id;
        name = n;
        category = cat;
        lost = state;
    }

    @Override
    public String toString() {
        return  "Item ID:        " + item_id + "\n" +
                "Name:           " + name + "\n" +
                "Category:       " + category + "\n" +
                "Lost:           " + lost + "\n";
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }
}
