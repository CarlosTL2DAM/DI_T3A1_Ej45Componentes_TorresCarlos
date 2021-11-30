/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;

import java.io.IOException;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 * FXML Controller class
 *
 * @author Carlos Torres Liñán
 */
public class Temporizador extends AnchorPane {

    @FXML
    private Label cuentaRegresiva;
    private final IntegerProperty tiempo;

    public Temporizador() {
        //Inicializamos tiempo
        tiempo = new SimpleIntegerProperty(0);
        
        //Cargamos la vista para el FXML
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("temporizadorView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

    }

    /*Introducimos el tiempo*/
    public void setTiempo(final int tiempo) {
        this.tiempo.set(tiempo);
        
        cuentaRegresiva.setText(tiempo + "");
    }

    /*Obtenemos el tiempo*/
    public final int getTiempo() {
        return tiempo.get();
    }

    /*Obtenemos el integer property de tiempo*/
    public final IntegerProperty tiempoProperty() {
        return tiempo;
    }
    

    /*Disminuimos el tiempo*/
    public void disminuyeTiempo() {
        Timeline timeline = new Timeline();
        Duration duration = Duration.seconds(getTiempo());
        KeyValue kv = new KeyValue(tiempoProperty(), 0);
        EventHandler onFinished = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                timeline.stop();
                fireEvent(t);
            }
        };
        

        KeyFrame kf = new KeyFrame(duration, onFinished, kv);
        timeline.getKeyFrames().add(kf);

        cuentaRegresiva.textProperty().bind(tiempoProperty().asString());
        timeline.play();
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
            return Temporizador.this;
        }

        @Override
        public String getName() {
            return "onAction";
        }
    };

}
