
package thread.application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calender implements Initializable {
         void work() throws IOException  {
             Stage stage = GIF_main.getPrimaryStage();
             Parent root = FXMLLoader.load(getClass().getResource("FXMLCalenderNew.fxml"));
          

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