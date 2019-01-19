
package thread.application;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class StartPage implements Initializable {
         void work() throws IOException  {
             Stage stage = GIF_main.getPrimaryStage();
             Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
          
              FileInputStream icon_inp = new FileInputStream("E:\\Java\\Thread Application\\src\\thread\\application\\App_icon-02.png");
        Image icon = new Image(icon_inp);
        //ImageView iconView = new ImageView(icon);

                Scene scene2 = new Scene(root, 600, 400);
                stage.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

                stage.getIcons().add(icon);
                stage.setTitle("Sked");
               stage.setScene(scene2);
              stage.show();  
              
    }
        private void closeProgram() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Sked");
        alert.setContentText("Are you sure to exit");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        }
    }
         
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
