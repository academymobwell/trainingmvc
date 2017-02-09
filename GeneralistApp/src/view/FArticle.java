/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author dsangui
 */
public class FArticle extends Scene {
    
    Group m_par;
    GridPane gp;
    
    public FArticle(double width, double height) {
        super(new Group(), width, height);
        
        m_par = (Group) this.getRoot();
        
        init();
    }        
    
    
    private void init() {
        gp = new GridPane();
        
                //add spacing
        gp.setPadding(new Insets(20, 20, 20, 20));
        gp.setHgap(10); gp.setVgap(10);
        
        Label lbl1 = new Label("Nome");
        TextField  tx1 = new TextField("");
        
        gp.add(lbl1, 0, 0); gp.add(tx1, 1, 0);
        
        Label lbl2 = new Label("Preco");
        TextField    tx2 = new TextField();        
        
        gp.add(lbl2, 0, 1); gp.add(tx2, 1, 1);
        
        Label lbl3 = new Label("Descricao");
        TextArea    tx3 = new TextArea();  
        tx3.setMaxHeight(50);
        
        gp.add(lbl3, 0, 2); gp.add(tx3, 1, 2);
        

        
        Button btSave = new Button("Gravar");
        btSave.setAlignment(Pos.BOTTOM_RIGHT);
        gp.add(btSave, 1, 3);
         
        m_par.getChildren().add(gp);
    }
}
