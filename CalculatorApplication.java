/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package calculatorapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CalculatorApplication extends Application { 
    double FirstNum=0;
    double SecondNum=0;
    String Operator="";
    @Override
    public void start( Stage PrimaryStage){
        TextField display=new TextField();
        display.setEditable(false);
        GridPane grid=new GridPane();
        
        //buttons        
        Button bt0=new Button("0");
        bt0.setPrefSize(70,70);
        Button bt1=new Button("1");
        bt1.setPrefSize(70,70);
        Button bt2=new Button("2");
        bt2.setPrefSize(70,70);
        Button bt3=new Button("3");
        bt3.setPrefSize(70,70);
        Button bt4=new Button("4");
        bt4.setPrefSize(70,70);
        Button bt5=new Button("5");
        bt5.setPrefSize(70,70);
        Button bt6=new Button("6");
        bt6.setPrefSize(70,70);
        Button bt7=new Button("7");
        bt7.setPrefSize(70,70);
        Button bt8=new Button("8");
        bt8.setPrefSize(70,70);
        Button bt9=new Button("9"); 
        bt9.setPrefSize(70,70);
        Button btAdd=new Button("+");
        btAdd.setPrefSize(70,70);
        Button btSub=new Button("-");
        btSub.setPrefSize(70,70);
        Button btMul=new Button("*");
        btMul.setPrefSize(70,70);
        Button btDiv=new Button("/");
        btDiv.setPrefSize(70,70);
        Button btClear=new Button("C");
        btClear.setPrefSize(70,70);
        Button btEqu=new Button("=");
        btEqu.setPrefSize(70,70);
        
        //button->Grid
        
        grid.add(bt7,0,0);
        grid.add(bt8,1,0);
        grid.add(bt9,2,0);
        grid.add(btSub,3,0);
        grid.add(bt4,0,1);
        grid.add(bt5,1,1);
        grid.add(bt6,2,1);
        grid.add(btAdd,3,1);
        grid.add(bt1,0,2);
        grid.add(bt2,1,2);
        grid.add(bt3,2,2);
        grid.add(btDiv,3,2);
        grid.add(btClear,0,3);
        grid.add(bt0,1,3);
        grid.add(btEqu,2,3);
        grid.add(btMul,3,3);
        
        //btAdd
        btAdd.setOnAction(e -> {
            FirstNum = Double.parseDouble(display.getText());
            Operator = "+";
            display.clear();
        });
        
        //btSub
        btSub.setOnAction(e -> {
            FirstNum=Double.parseDouble(display.getText());
            Operator="-";
            display.clear();
        });
       
        //btDiv
        btDiv.setOnAction(e ->{
            FirstNum=Double.parseDouble(display.getText());
            Operator="/";
            display.clear();
        });
        
        //btMul
        btMul.setOnAction(e ->{
            FirstNum=Double.parseDouble(display.getText());
            Operator="*";
            display.clear();
        });
        
        //btClear
        btClear.setOnAction(e ->{       
        display.clear();
        });

        //btEqu
        btEqu.setOnAction(e ->{
            SecondNum=Double.parseDouble(display.getText());
            double result=0;
            if (Operator.equals("+")) {
                result=FirstNum+SecondNum;
            } else if (Operator.equals("-")){
                result=FirstNum-SecondNum;
            } else if (Operator.equals("*")){
                result=FirstNum*SecondNum;
            }
            display.setText(String.valueOf(result));
        });
        
        //bt_actions
        bt0.setOnAction(e -> display.setText(display.getText() + "0"));
        bt1.setOnAction(e -> display.setText(display.getText() + "1"));
        bt2.setOnAction(e -> display.setText(display.getText() + "2"));
        bt3.setOnAction(e -> display.setText(display.getText() + "3"));
        bt4.setOnAction(e -> display.setText(display.getText() + "4"));
        bt5.setOnAction(e -> display.setText(display.getText() + "5"));
        bt6.setOnAction(e -> display.setText(display.getText() + "6"));
        bt7.setOnAction(e -> display.setText(display.getText() + "7"));
        bt8.setOnAction(e -> display.setText(display.getText() + "8"));
        bt9.setOnAction(e -> display.setText(display.getText() + "9"));
        
        //display
        VBox root=new VBox(display, grid);
        Scene scene=new Scene(root,280,400);
        PrimaryStage.setTitle("Calculator");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
        display.setPrefSize(280,80);
           
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
