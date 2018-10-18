package com.internship.model;

public class Knowledge {
    private int id;
    private int level;

    public Knowledge(int id, int level) {
        this.id = id;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "id=" + id +
                ", level=" + level +
                '}';
    }
}
