/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class FXMLResultShowController implements Initializable {
          @FXML private TableView<ExamResult> tableView;
          @FXML private TableColumn<ExamResult, String> examNameColumn;
           @FXML private TableColumn<ExamResult, String> yearNameColumn;
           @FXML   private Label showExamName;
           @FXML   private Label showExamYear;
           @FXML   private Label showExamCredit;

       
           @FXML
    private void back_home(ActionEvent event) throws IOException  {
               
           StartPage startpage = new StartPage();
             startpage.work();
    }
        
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
        System.out.println(""+showResult.date.toString());
              LocalDate tomorrow = showResult.date.plusDays(1);
	  
	System.out.println("Tomorrow's Date: "+tomorrow);
        
        examNameColumn.setCellValueFactory(new PropertyValueFactory<ExamResult, String>("examName"));
        yearNameColumn.setCellValueFactory(new PropertyValueFactory<ExamResult, String>("yearName"));
        
              try {
                  tableView.setItems(getExams());
                  
        tableView.setEditable(true);
        examNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        yearNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
         tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
              } catch (IOException ex) {
                  Logger.getLogger(FXMLResultShowController.class.getName()).log(Level.SEVERE, null, ex);
              }
    }
        public ObservableList<ExamResult>  getExams() throws FileNotFoundException, IOException
    {
         LocalDate tomorrow = showResult.date.plusDays(0);
        ObservableList<ExamResult> exams = FXCollections.observableArrayList();
         FileReader file = new FileReader("E:\\Java\\Thread Application\\src\\thread\\application\\Doc.txt");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        String text = "";
        while(line != null){
            text += line;
             String[] tokens = text.split("#");
             String examRealName = tokens[0];
            String exam = tokens[1];
            String which_year =  tokens[2];
            String credit = tokens[3];
             String time = tomorrow.toString();
              tomorrow = tomorrow.plusDays(2);
          line = reader.readLine();
             exams.add(new ExamResult(examRealName,exam,time,which_year,credit));
            text = "";
          }
       
        return exams;
    }
                 public void changeFirstNameCellEvent(CellEditEvent edittedCell)
    {
        
        ExamResult examSelected =  tableView.getSelectionModel().getSelectedItem();
        examSelected.setExamName(edittedCell.getNewValue().toString());
    }
                     public void changeExamDateCellEvent(CellEditEvent edittedCell)
    {
        
        ExamResult examSelected =  tableView.getSelectionModel().getSelectedItem();
        examSelected.setYearName(edittedCell.getNewValue().toString());
    }
        public void userClickedOnTable()
    {
          ExamResult examSelected =  tableView.getSelectionModel().getSelectedItem();
          showExamName.setText(examSelected.getExamRealName());
           showExamYear.setText(examSelected.getWhich_year());
            showExamCredit.setText(examSelected.getCredit());
             
    
          
    }
        public void handleSave(ActionEvent event) throws IOException{
            Stage secondaryStage = new Stage();
            FileChooser filechooser = new FileChooser();
            filechooser.setTitle("Save Exam");
            filechooser.setInitialDirectory(new File("E:\\Java\\Thread Application\\src\\thread\\application"));
            File file = filechooser.showSaveDialog(secondaryStage);
            if(file != null){
                saveFile(tableView.getItems(), file);
            }
        }
        public void saveFile(ObservableList<ExamResult> people , File file) {
              try {
             BufferedWriter writer = new BufferedWriter(new FileWriter(file));
             for(ExamResult persons : people){
                 String datafile = "Exam ID: " + persons.getExamName() +"     Exam Date: " + persons.getYearName();
                  writer.write(datafile);
                  
                   writer.newLine();  }
            // System.out.println(""+persons.toString());
            writer.close();
              } catch (IOException ex) {
                  System.out.println("Hoi nai");
                  Logger.getLogger(FXMLResultShowController.class.getName()).log(Level.SEVERE, null, ex);
              }
        }

            
    }    
    

