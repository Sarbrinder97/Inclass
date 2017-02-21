/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sarbrinder dhillon
 */
public class FXMLController implements Initializable {
 @FXML private TextField make;
    @FXML private TextField features;
    @FXML private TextField year;
    @FXML private TextField mileage;
    @FXML private TextField price;
    @FXML private TextField model;
    @FXML private Button createNewVehicle;
    @FXML private Label errorMessage;
    
    public void CreateNewCarButtonPushed(){
        try{
        Cars newCar= new Cars(make.getText(),model.getText(), features.getText(),Integer.parseInt(year.getText()),Double.parseDouble(mileage.getText()),
                                Double.parseDouble(price.getText()));
        System.out.printf("The new Car is %s%n", newCar.toString());
        }
        catch (IllegalArgumentException e)
            {
                this.errorMessage.setText(e.getMessage());
                errorMessage.setVisible(true);
            }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        errorMessage.setVisible(false);
        
    }    
    
}
