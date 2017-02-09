/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dsangui
 */
public class Article {
    private String m_sName;
    private double m_dPrice;
    private String m_sDescription;

    public Article(String m_sName, double m_dPrice, String m_sDescription) {
        this.m_sName = m_sName;
        this.m_dPrice = m_dPrice;
        this.m_sDescription = m_sDescription;
    }

    public String getM_sName() {
        return m_sName;
    }

    public void setM_sName(String m_sName) {
        this.m_sName = m_sName;
    }

    public double getM_dPrice() {
        return m_dPrice;
    }

    public void setM_dPrice(double m_dPrice) {
        this.m_dPrice = m_dPrice;
    }

    public String getM_sDescription() {
        return m_sDescription;
    }

    public void setM_sDescription(String m_sDescription) {
        this.m_sDescription = m_sDescription;
    }        
}
