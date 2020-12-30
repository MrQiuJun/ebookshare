package com.wuwang.ebookshare.DAO;

import com.wuwang.ebookshare.pojo.Ebook;
import com.wuwang.ebookshare.utils.GetConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EbookDAO {
    public ArrayList findEbooksBySql(String sql) throws SQLException {
        ArrayList<Ebook> ebooks = new ArrayList<Ebook>();
        Connection conn= GetConnection.getConn();
        Statement stmt = conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()) {
            Ebook ebook = new Ebook();
            ebook.setBook_id(rs.getInt("Book_id"));
            ebook.setBook_name(rs.getString("book_name"));
            ebook.setBook_formate(rs.getString("book_formate"));
            ebook.setBook_descriptions(rs.getString("Book_descriptions"));
            ebook.setBook_url(rs.getString("book_url"));
            ebook.setBook_url_from(rs.getString("Book_url_from"));
            ebook.setBook_url_code(rs.getString("Book_url_code"));
            ebook.setBook_url_status(rs.getInt("Book_url_status"));
            ebook.setUser_message(rs.getString("User_message"));
            ebooks.add(ebook);
        }
        conn.close();
        stmt.close();
        return ebooks;
    }

    public void updateEmpBySql(String sql) throws SQLException {
        Connection conn=GetConnection.getConn();
        Statement stmt=conn.createStatement();
        stmt.execute(sql);
        conn.close();
        stmt.close();
    }
}
