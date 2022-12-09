/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Denner Dias
 */
public class EmailTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        Email email = new Email("Email testando biblioteca envio de email.",
                  "Segue anexo, Email testando biblioteca envio de email.", 
                  "jeremiiias1996@gmail.com");
        
        email.getMensagem();
        email.getAssunto();
        email.getDestinatario();
        
        email.enviar();
        

    }
    
}
