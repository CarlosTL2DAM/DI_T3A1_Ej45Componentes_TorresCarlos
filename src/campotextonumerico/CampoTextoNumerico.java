/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campotextonumerico;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Carlos Torres Liñán
 */
public class CampoTextoNumerico extends TextField {
    public CampoTextoNumerico() {
        super();
        /*Añadimos la vista de campo de texto numérico*/
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoNumerico.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try{
            fxmlLoader.load();
        } catch(IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    /*Método para que cuando se escriba solo se implementen números*/
    @Override
    public void replaceText(int start, int end, String text)
    {
        if(text.matches("[0-9]"))
        {
            super.replaceText(start, end, text);
        }
    }

    /*Método para que cuando se sustituya el contenido se escriban solo numeros*/
    @Override
    public void replaceSelection(String text)
    {
        if(text.matches("[0-9]"))
        {
            super.replaceSelection(text);
        }
    }



}
