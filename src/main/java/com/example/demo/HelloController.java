package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    Label answer;
 @FXML
    Button add,sub,mul,div;
 @FXML
    TextField par1,par2;
 @FXML
 public void initialize()
 {
     add.setDisable(true);
     sub.setDisable(true);
     mul.setDisable(true);
     div.setDisable(true);
 }

 @FXML
    protected void onHelloButtonClick(ActionEvent e)
 {
     String s=par1.getText();
     String s2=par2.getText();
     long n1=Long.parseLong(s);
     long n2=Long.parseLong(s2);
     Object source=e.getSource();
     if (source.equals(add)) {
         answer.setText("Addition Of Numbers:="+ (n1 + n2));
     }
     if(source.equals(sub)) {
         answer.setText("Subtraction of Numbers  " + (n1 - n2));
     }
     if(source.equals(mul))
     {
         answer.setText("Multiplication of Numbers  "+ n1 * n2);
     }
     if(source.equals(div))
     {

         answer.setText("Division of Numbers  "+ n1 / n2);
     }

 }

@FXML
    public void parametersCheck() {
     String s=par1.getText();
     String s2=par2.getText();
     if(s.trim().isEmpty()||s2.trim().isEmpty()||!s.matches("^0|[1-9]\\d*")||!s2.matches("0|[1-9]\\d*"))
     {
         add.setDisable(true);
         sub.setDisable(true);
         mul.setDisable(true);
         div.setDisable(true);
         answer.setText("");
         return;
     }

     add.setDisable(false);
     sub.setDisable(false);
     mul.setDisable(false);
     div.setDisable(false);
    if(s2.matches("0*"))div.setDisable(true);
    }
}