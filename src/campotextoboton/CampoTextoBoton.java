package campotextoboton;

import java.io.IOException;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class CampoTextoBoton extends HBox {

    @FXML
    private TextField textField;

    @FXML
    private Button boton;
    
    public CampoTextoBoton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoBoton.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    
    
    
    }

    public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }

    public StringProperty textProperty() {
        return textField.textProperty();
    }

    @FXML
    protected void doSomething() {
        //Evento de pulsado al botón
        boton.setOnAction((ActionEvent event) -> {
        fireEvent(event);
    });
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
            return CampoTextoBoton.this;
        }

        @Override
        public String getName() {
            return "onAction";
        }
    };
}
