/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import static thread.application.GIF_main.icon;
import static thread.application.GIF_main.primaryStage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class FXMLSketchController implements Initializable {
    
     @FXML private TableView<Student> tableView;
       @FXML private TableColumn<Student, String> courseID;
       @FXML private TableColumn<Student, String> year1;
       @FXML private TableColumn<Student, String> year2;
       @FXML private TableColumn<Student, String> year3;
       @FXML private TableColumn<Student, String> year4;
       @FXML ObservableList<Student> people = FXCollections.observableArrayList();
     @FXML private Label label;
      @FXML private Label yearName;
      @FXML DatePicker datepicker;
      

    @FXML
    private void action_Year1(ActionEvent event) throws FileNotFoundException, IOException  {
            label.setText("");
         yearName.setText("First Year");
         people.clear();
         
        FileReader file = new FileReader("E:\\Java\\Thread Application\\src\\thread\\application\\Batch17.txt");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String text = "";
        while(line != null){
            text += line;
             String[] tokens = text.split("#");
            String course = tokens[0];
             String year1 = tokens[1];
             String year2 = tokens[2];
             String year3 = tokens[3];
             String year4 = tokens[4];
          line = reader.readLine();
             people.add(new Student(course,year1,year2,year3,year4));
            text = "";
        }

      tableView.setItems(people);   
    }
    @FXML
    private void action_Year2(ActionEvent event) throws FileNotFoundException, IOException {
        label.setText("");
         yearName.setText("Second Year");
         people.clear();
         
        FileReader file = new FileReader("E:\\Java\\Thread Application\\src\\thread\\application\\Batch16.txt");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String text = "";
        while(line != null){
            text += line;
             String[] tokens = text.split("#");
            String course = tokens[0];
             String year1 = tokens[1];
             String year2 = tokens[2];
             String year3 = tokens[3];
             String year4 = tokens[4];
          line = reader.readLine();
             people.add(new Student(course,year1,year2,year3,year4));
            text = "";
        }

      tableView.setItems(people);   
    }
    @FXML
    private void action_Year3(ActionEvent event) throws FileNotFoundException, IOException {
        label.setText("");
         yearName.setText("Third Year");
         people.clear();
         
        FileReader file = new FileReader("E:\\Java\\Thread Application\\src\\thread\\application\\Batch_15.txt");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String text = "";
        while(line != null){
            text += line;
             String[] tokens = text.split("#");
            String course = tokens[0];
             String year1 = tokens[1];
             String year2 = tokens[2];
             String year3 = tokens[3];
             String year4 = tokens[4];
          line = reader.readLine();
             people.add(new Student(course,year1,year2,year3,year4));
            text = "";
        }

      tableView.setItems(people);   

   }
    @FXML
    private void action_Year4(ActionEvent event) throws FileNotFoundException, IOException {
         label.setText("");
         yearName.setText("Fourth Year");
         people.clear();
         
        FileReader file = new FileReader("E:\\Java\\Thread Application\\src\\thread\\application\\Batch14.txt");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String text = "";
        while(line != null){
            text += line;
             String[] tokens = text.split("#");
            String course = tokens[0];
             String year1 = tokens[1];
             String year2 = tokens[2];
             String year3 = tokens[3];
             String year4 = tokens[4];
          line = reader.readLine();
             people.add(new Student(course,year1,year2,year3,year4));
            text = "";
        }

      tableView.setItems(people);   
       
      
    }
    
    @FXML
    private void action_schedule(ActionEvent event) throws IOException  {
        try {
        LocalDate date = datepicker.getValue();
        showResult show =new showResult();
            show.work(date); }
        catch(Exception e){
             Stage secondaryStage = new Stage();
              Parent root = FXMLLoader.load(getClass().getResource("ErrorShow.fxml"));
    
                Scene scene2 = new Scene(root, 295, 182);
                 FileInputStream icon_inp = new FileInputStream("E:\\Java\\Thread Application\\src\\thread\\application\\App_icon-02.png");     
                icon = new Image(icon_inp);
                ImageView iconView = new ImageView(icon);

                secondaryStage.setTitle("Sked");
               secondaryStage.setScene(scene2);
               secondaryStage.getIcons().add(icon);
              secondaryStage.show();  
        }
    }
    @FXML
    private void action_insert(ActionEvent event)  {

       label.setText("Data inserted successfully!!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
             courseID.setCellValueFactory(new PropertyValueFactory<Student, String>("course"));
              year1.setCellValueFactory(new PropertyValueFactory<Student, String>("one"));
              year2.setCellValueFactory(new PropertyValueFactory<Student, String>("two"));
              year3.setCellValueFactory(new PropertyValueFactory<Student, String>("three"));
              year4.setCellValueFactory(new PropertyValueFactory<Student, String>("four"));
       

    }

    }
    

