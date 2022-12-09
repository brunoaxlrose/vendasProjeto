package br.com.projeto.model;

import br.com.projeto.jdbc.ConnectionFactory;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTable;


public class Utilitarios {

    // Informa qual o painel ele percorre cada campo e coloca como null.
    public void limparTela(JPanel container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
        }
    }
    
  


        
    }



