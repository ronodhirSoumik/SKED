/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.application;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author hp
 */
public class Student {
    private SimpleStringProperty course,one,two,three,four;
  
    public Student(String course, String one,String two,String three, String four) {
        this.course = new SimpleStringProperty(course);
        this.one = new SimpleStringProperty(one);
        this.two = new SimpleStringProperty(two);
        this.three = new SimpleStringProperty(three);
        this.four = new SimpleStringProperty(four);
        
    }


    public String getCourse() {
        return course.get();
    }


    public String getOne() {
        return one.get();
    }

    public String getTwo() {
        return two.get();
    }

    public String getThree() {
        return three.get();
    }
        public String getFour() {
        return four.get();
    }

    public void setCourse(SimpleStringProperty course) {
        this.course = course;
    }

    public void setOne(SimpleStringProperty one) {
        this.one = one;
    }

    public void setTwo(SimpleStringProperty two) {
        this.two = two;
    }

    public void setThree(SimpleStringProperty three) {
        this.three = three;
    }

    public void setFour(SimpleStringProperty four) {
        this.four = four;
    }

    
}
