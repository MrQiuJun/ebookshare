package com.wuwang.ebookshare.service;

import com.wuwang.ebookshare.DAO.EbookDAO;
import com.wuwang.ebookshare.pojo.Ebook;
import com.wuwang.ebookshare.utils.EbooksFindCondition;

import java.sql.SQLException;
import java.util.ArrayList;

public class EbookService {
    EbookDAO ed = new EbookDAO();

    public ArrayList findEbooks(EbooksFindCondition ebooksfindcd) throws SQLException {
        ArrayList<Ebook> ebooks = new ArrayList<Ebook>();
        String sql="select * from qiuj.books where 1=1 and BOOK_URL_STATUS='0'";
        if (ebooksfindcd.bookName != null && ebooksfindcd.bookName != "")
            sql = sql + " and book_name = '" + ebooksfindcd.bookName + "'";
        System.out.println("用户搜索操作生成查询sql:"+sql);
        ebooks = ed.findEbooksBySql(sql);
        return ebooks;
    }

    public void addEbook(Ebook ebook) throws SQLException {
        String sql = String.format("insert into qiuj.books(BOOK_NAME, BOOK_DESCRIPTIONS, BOOK_FORMATE, BOOK_URL_FROM, BOOK_URL, BOOK_URL_STATUS, USER_MESSAGE, BOOK_URL_CODE) values ('%s','%s','%s','%s','%s','%d','%s','%s')",
                ebook.getBook_name(), ebook.getBook_descriptions(), ebook.getBook_formate(), ebook.getBook_url_from(), ebook.getBook_url(), ebook.getBook_url_status(), ebook.getUser_message(), ebook.getBook_url_code());
        System.out.println("用户添加操作生成添加sql:"+sql);
        ed.updateEmpBySql(sql);
    }

}
