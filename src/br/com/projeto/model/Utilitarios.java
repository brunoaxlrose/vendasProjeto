package br.com.projeto.model;

import br.com.projeto.jdbc.ConnectionFactory;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
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
    
    public void gerarPDF() throws DocumentException, FileNotFoundException, IOException{
         //public static void main(String[] args) throws Exception {
         PdfPTable table = new PdfPTable(new float[] { 0.2f, 0.2f, 0.6f }); 
         Document doc = null;
          OutputStream os = null;

          try {
              //cria o documento tamanho A4, margens de 2,54cm
              doc = new Document(PageSize.A4, 72, 72, 72, 72);

              //cria a stream de saída
              os = new FileOutputStream("out.pdf");

              //associa a stream de saída ao 
              PdfWriter.getInstance(doc, os);

              //abre o documento
              doc.open();

              //adiciona o texto ao PDF
              Paragraph p = new Paragraph("Meu primeiro arquivo PDF!");
              doc.add(p);

          } finally {
              if (doc != null) {
                  //fechamento do documento
                  doc.close();
              }
              if (os != null) {
                 //fechamento da stream de saída
                 os.close();
              }
          }
      }

    public void gerarPDF(JTable tabelaCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }



