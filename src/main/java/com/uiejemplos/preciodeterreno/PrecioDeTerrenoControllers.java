package com.uiejemplos.preciodeterreno;

import com.uiejemplos.preciodeterreno.modelo.Terreno;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class PrecioDeTerrenoControllers {
    public TextField txtFldAncho;
    public TextField txtFldLargo;
    public TextField txtFldPrecioPorMetro;
    public Button btnCalcular;
    public Button BtnSalir;
    public TextField txtFldPrecio;

    public void onActionBntSalir(ActionEvent actionEvent) {
       Node node = (Node) actionEvent.getSource();
       Stage stg = (Stage)node.getScene().getWindow();
       stg.close();
    }

    public void onActionBtnCalcular(ActionEvent actionEvent) {
     double ancho;
     double largo;
     double precioPorM;
     try {
         ancho = Double.parseDouble(txtFldAncho.getText());
         largo = Double.parseDouble(txtFldLargo.getText());
         precioPorM = Double.parseDouble(txtFldPrecioPorMetro.getText());
         Terreno t = new Terreno( ancho, largo, precioPorM );
         txtFldPrecio.setText(String.valueOf(t.calcularPrecio()));
     } catch (NumberFormatException exc) {
         Alert alert = new Alert(Alert.AlertType.ERROR,"Error en valor numerico", ButtonType.OK);
         alert.setTitle("Error");
         alert.setHeaderText("");
         alert.showAndWait();

     }


    }
}
