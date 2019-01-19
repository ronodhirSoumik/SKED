package thread.application;

import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class GIF_main extends Application {
    
     static Stage primaryStage; // **Declare static Stage**
    public static  Image icon;
    public Scene scene;
    
    private void setPrimaryStage(Stage stage) {
      GIF_main.primaryStage = stage;   
    }
            
     void getwork() throws Exception{
            start(primaryStage);
        }

    @Override
    public void start(Stage stage) throws Exception {
        setPrimaryStage(stage);
        Parent root = FXMLLoader.load(getClass().getResource("Gif.fxml"));
        
        FileInputStream icon_inp = new FileInputStream("E:\\Java\\Thread Application\\src\\thread\\application\\App_icon-02.png");     
       icon = new Image(icon_inp);
        ImageView iconView = new ImageView(icon);
        
         scene = new Scene(root);
                  
         primaryStage.setScene(scene);
         primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Sked");
          stage.show();
     //     sleep(5000);
          
       //   getstart();
         
    }
        static public Stage getPrimaryStage() {
       
         primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Sked");
  
        return GIF_main.primaryStage;
    }


}
