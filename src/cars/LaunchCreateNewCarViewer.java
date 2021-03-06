/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cars;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author sarbrinder dhillon
 */
public class LaunchCreateNewCarViewer extends Application{

    
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXML.fxml"));
        AnchorPane createCarLayout = loader.load();
        
        Scene createCarScene = new Scene(createCarLayout);
        primaryStage.setScene(createCarScene);
        primaryStage.show();
}
    
    
}
