package sample;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.IOException;

public class Controller_Login {
    @FXML
    JFXTextField txt_usuario;
    @FXML
    JFXPasswordField txt_contrasenia;

    public void accion_inicio(){
        if(txt_usuario.getText().equals("usuario123") && txt_contrasenia.getText().equals("12345")){
            try{
                Parent root = FXMLLoader.load(getClass().getResource("Principal.fxml"));
                Scene scene=new Scene(root,1200,600);
                Main.stage.setScene(scene);
                Main.stage.centerOnScreen();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }else{
            Alert alerta=new Alert(Alert.AlertType.ERROR);
            alerta.setContentText("Datos Incorrectos");
            alerta.show();
        }
    }
    public void accion_mostrar(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "USUARIO:usuario123 \n CONTRASEÑA:12345", ButtonType.OK);
        alert.show();
    }
}
