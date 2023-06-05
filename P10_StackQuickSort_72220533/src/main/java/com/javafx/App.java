package com.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    Text txtJudul = new Text("Quick Sort");
    Label lblInt = new Label("Masukkan bil int");
    TextField txtInt = new TextField();
    TextField txtIsiArray = new TextField();
    Label lblIsiArray = new Label("Isi array");
    Button btnAdd = new Button("_Add");
    Button btnQuickSort = new Button("Quick Sort");
    Button btnClose = new Button("_Close");
    HBox hb1 = new HBox(6);
    HBox hb2 = new HBox(7);
    HBox hb3 = new HBox(6);
    HBox hb4 = new HBox(6);
    TextArea txtArea = new TextArea();
    VBox vb = new VBox(6);
    Region reg = new Region();
    Larik lrk = new Larik(100);

    void add() {
        lrk.add(Integer.parseInt(txtInt.getText()));
        txtInt.clear();
        txtInt.requestFocus();
        txtIsiArray.setText(lrk.getArray());
    }

    void quickSort() {
        txtArea.setText(lrk.quickSortRekursif());
    }

    @Override
    public void start(Stage stage) throws Exception {
        txtInt.setPromptText("Masukkan bilangan int");
        hb1.getChildren().addAll(lblInt,txtInt,btnAdd);
        txtInt.setMaxWidth(50);
        HBox.setHgrow(reg, Priority.ALWAYS);
        txtArea.setMinHeight(500);
        hb2.getChildren().addAll(lblIsiArray, txtIsiArray, btnQuickSort);
        hb3.getChildren().addAll(txtArea);
        hb4.getChildren().addAll(reg,btnClose);
        vb.getChildren().addAll(hb1, hb2, hb3, hb4);
        vb.setPadding(new Insets(10));

        btnClose.setOnAction(e -> stage.close());
        btnAdd.setOnAction(e -> add());
        btnQuickSort.setOnAction(e -> quickSort());
        stage.setScene(new Scene(vb));
        stage.setTitle("Quick Sort");
        stage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
