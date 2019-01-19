/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


/**
 *
 * @author hp
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private void action_startAnew(ActionEvent event) throws IOException {
        Sketch sketch = new Sketch();
        sketch.work();
       
    }
    @FXML
     private void action_calender(ActionEvent event) throws InterruptedException, IOException  {
         Calender calender = new Calender();
         calender.work();   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
