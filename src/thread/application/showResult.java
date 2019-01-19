/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.application;

/**
 *
 * @author hp
 */


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class showResult implements Initializable {
              static LocalDate date;
         void work( LocalDate da) throws IOException  {
             date = da;
             Stage stage = GIF_main.getPrimaryStage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLResultShow.fxml"));
    
                Scene scene2 = new Scene(root, 600, 400);

                stage.setTitle("Sked");
               stage.setScene(scene2);
              stage.show();  
              
    }
         
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

