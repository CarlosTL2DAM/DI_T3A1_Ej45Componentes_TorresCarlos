/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectordeslizamiento;

import java.io.IOException;
import java.util.ArrayList;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Carlos Torres Liñán
 */
public class SelectorDeslizamiento extends AnchorPane {

    @FXML
    private Button previousButton;
    @FXML
    private Label label;
    @FXML
    private Button nextButton;
    ArrayList<String> items;
    int selectedIndex;
    private boolean repetitive;

    public SelectorDeslizamiento() {
        //Cargamos la vista para el FXML
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("selector_deslizamiento.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        
        //Creamos la lista de items 
        items = new ArrayList<>();
        selectedIndex = 0;
        //Le añadimos una acción al botón previousButton y lo lanzamos con un fireEvent
        previousButton.setOnAction((ActionEvent event) -> {
            setPrevious();
            fireEvent(event);
        });
        //Le añadimos una acción al botón nextButton y lo lanzamos con un fireEvent
        nextButton.setOnAction((ActionEvent event) -> {
            setNext();
            fireEvent(event);
        });
    }

    //Añadimos los distintos valores que se van a añadir.
    public void setItems(ArrayList<String> items) {
        this.items = items;
        //Seleccionamos el primer valor
        selectFirst();
    }

    //Actualizamos al valor previo de la lista
    public void setPrevious() {
        updateItem(selectedIndex - 1);
    }

    //Actualizamos al valor siguiente de la lista
    public void setNext() {
        updateItem(selectedIndex + 1);
    }

    //Seleccionamos el primer valor de la lista
    public void selectFirst() {
        updateItem(0);
    }

    //Seleccionamos el último valor de la lista.
    private void selectLast() {
        updateItem(items.size() - 1);
    }

    /*Método para actualizar el valor*/
    private void updateItem() {
        //En caso de que no existan valores, se pondrá al valor a "vacio"
        if (items.isEmpty()) {
            label.setText("Vacio");
        } 
        //En caso de que no esté vacio la lista de valores
        else {
            //En caso de que se llegue al primer valor
            if (selectedIndex < 0) {
                //En caso de que repetitive sea verdad (permite que al darle al botón 
                //de anterior vaya al último valor y sea cíclico), se escoge el último valor
                if (repetitive) {
                    selectedIndex = items.size() - 1;
                } 
                //En caso repetitive sea falso, selectedIndex será 0 y no permite que sea cíclico
                else {
                    selectFirst();
                }
            }
            //En caso de que el item seleccionado sea superior al tamaño de la lista
            if (selectedIndex >= items.size()) {
                //En caso de que repetitive sea verdad (permite que al darle al botón 
                //de siguiente vaya al primer valor y sea cíclico), se escoge el primer valor
                if (repetitive) {
                    selectedIndex = 0;
                }
                //En caso de que no sea repetitivo se pone al últimmo valor y no permite que sea cíclico.
                else {
                    selectLast();
                }
            }
            //Muestra el valor del item
            label.setText(items.get(selectedIndex));
        }
    }
    
    //Actualiza la lista de items
    private void updateItem(int selectedIndex) {
        this.selectedIndex = selectedIndex;
        updateItem();
    }

    //Introduce el valor de repetitivo o no,es decir permite que sea ciclico, que desde el primero vaya al último y viceversa
    public void setRepetitive(boolean cyclesThrough) {
        this.repetitive = cyclesThrough;
    }

    //Proporciona a que se pueda utilizar la acción "onAction" por parte de la app que utilice el control
    public final ObjectProperty<EventHandler<ActionEvent>> onActionProperty() {
        return onAction;
    }

    //Añade la acción onAction, y pone el valor que se le añade.
    public final void setOnAction(EventHandler<ActionEvent> value) {
        onActionProperty().set(value);
    }

    //Obtiene el valor del onAction
    public final EventHandler<ActionEvent> getOnAction() {
        return onActionProperty().get();
    }

    //Manejador de evento para cuando se active el evento onAction, señalamos como actua
    private ObjectProperty<EventHandler<ActionEvent>> onAction = new ObjectPropertyBase<EventHandler<ActionEvent>>() {
        @Override
        protected void invalidated() {
            setEventHandler(ActionEvent.ACTION, get());
        }

        @Override
        public Object getBean() {
            return SelectorDeslizamiento.this;
        }

        @Override
        public String getName() {
            return "onAction";
        }
    };

}
