/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Tapu Das
 */
public class GifController implements Initializable {

    @FXML
     private ImageView imageview;
    public static ImageView Imageview;
    
   
    @FXML
    private void actiontap(ActionEvent event) throws Exception {
        StartPage startpage = new StartPage();
             startpage.work();
       
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//     Image i = new Image(new File("thread.application/file.gif").toURI().toString());
//            imageview.setImage(i);        
        Imageview = imageview;
    }
}
