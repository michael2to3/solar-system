package solar.system;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(250, 250);
        SolarSystem ss = new SolarSystem(canvas);
        ss.run();

        VBox box = new VBox();
        box.getChildren().addAll(canvas);
        Scene scene = new Scene(box, 250, 250);
        primaryStage.setTitle("title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
