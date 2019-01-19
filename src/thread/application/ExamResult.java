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

import javafx.beans.property.SimpleStringProperty;


/**
 *
 * @author jwright
 */
public class ExamResult {
    private SimpleStringProperty examName, yearName,which_year,credit,examRealName;
  
    public ExamResult(String examRealName, String examName, String yearName, String which_year,String credit) {
       this.examRealName = new SimpleStringProperty(examRealName);
        this.examName = new SimpleStringProperty(examName);
        this.yearName = new SimpleStringProperty(yearName);
         this.which_year = new SimpleStringProperty(which_year);
         this.credit = new SimpleStringProperty(credit);
       //  System.out.println(""+credit);
    }

    public String getExamName() {
        return examName.get();
    }

    public String getYearName() {
        return yearName.get();
    }

    public String getWhich_year() {
        return which_year.get();
    }

        public String getCredit() {
        return credit.get();
    }

    public String getExamRealName() {
        return examRealName.get();
    }

   
    public void setExamName(String examName) {
        this.examName = new SimpleStringProperty(examName);
    }

    public void setYearName(String yearName) {
        this.yearName = new SimpleStringProperty(yearName);
    }

    public void setWhich_year(SimpleStringProperty which_year) {
        this.which_year = which_year;
    }

    public void setCredit(SimpleStringProperty credit) {
        this.credit = credit;
    }

    public void setExamRealName(SimpleStringProperty examRealName) {
        this.examRealName = examRealName;
    }


}