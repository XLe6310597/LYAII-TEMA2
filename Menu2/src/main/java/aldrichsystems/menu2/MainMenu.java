package aldrichsystems.menu2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenu extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                MainMenu.class.getResource("/aldrichsystems/menu2/main.fxml")
        );
        Scene scene = new Scene(loader.load(), 1000, 700);
        stage.setTitle("Menú principal");
        stage.setScene(scene);
        stage.show();
    }
}
