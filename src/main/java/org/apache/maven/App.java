package org.apache.maven;

import javafx.application.Application;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application
{
	public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ListView Experiment 1");

        ListView listView = new ListView();

        listView.getItems().add("Item 1");
        listView.getItems().add("Item 2");
        listView.getItems().add("Item 3");
        

        HBox hbox = new HBox(listView);
        
        Scene scene = new Scene(hbox, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
}
