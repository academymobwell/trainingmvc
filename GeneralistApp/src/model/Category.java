/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dsangui
 */
public class Category {
    private String m_sName;
    private ArrayList<Article> m_Articles;

    public Category(String m_sName) {
        this.m_sName = m_sName;
        m_Articles = new ArrayList<>();
    }
    
    public void addArticle(Article a) {
        this.m_Articles.add(a);
    }

    public String getM_sName() {
        return m_sName;
    }

    public void setM_sName(String m_sName) {
        this.m_sName = m_sName;
    }

    public ArrayList<Article> getM_Articles() {
        return m_Articles;
    }

    public void setM_Articles(ArrayList<Article> m_Articles) {
        this.m_Articles = m_Articles;
    }        
}
