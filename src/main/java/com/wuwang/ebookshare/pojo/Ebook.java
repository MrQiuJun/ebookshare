package com.wuwang.ebookshare.pojo;

public class Ebook {
    private int book_id;
    private String book_name;
    private String book_descriptions;
    private String book_formate;
    private String book_url_from;
    private String book_url;
    private int book_url_status;
    private String user_message;
    private String book_url_code;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_descriptions() {
        return book_descriptions;
    }

    public void setBook_descriptions(String book_descriptions) {
        this.book_descriptions = book_descriptions;
    }

    public String getBook_formate() {
        return book_formate;
    }

    public void setBook_formate(String book_formate) {
        this.book_formate = book_formate;
    }

    public String getBook_url_from() {
        return book_url_from;
    }

    public void setBook_url_from(String book_url_from) {
        this.book_url_from = book_url_from;
    }

    public String getBook_url() {
        return book_url;
    }

    public void setBook_url(String book_url) {
        this.book_url = book_url;
    }

    public int getBook_url_status() {
        return book_url_status;
    }

    public void setBook_url_status(int book_url_status) {
        this.book_url_status = book_url_status;
    }

    public String getUser_message() {
        return user_message;
    }

    public void setUser_message(String user_message) {
        this.user_message = user_message;
    }

    public String getBook_url_code() {
        return book_url_code;
    }

    public void setBook_url_code(String book_url_code) {
        this.book_url_code = book_url_code;
    }
}
