package com.zinkovsky.Modules;

public class Todo {
    private int userId;
    private int id;
    private String title;
    private String completed;

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed='" + completed + '\'' +
                '}';
    }
}
