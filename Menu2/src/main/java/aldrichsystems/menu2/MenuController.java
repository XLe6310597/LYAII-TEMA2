package aldrichsystems.menu2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.StackPane;

public class MenuController {

    @FXML
    private StackPane content;

    // BOTONES definidos en el FXML llaman a estos handlers:
    @FXML
    private void abrirProyecto1() {
        cargarVista("/aldrichsystems/proyecto1/proyecto1.fxml");
    }

    @FXML
    private void abrirProyecto2() {
        cargarVista("/aldrichsystems/proyecto2/proyecto2.fxml");
    }
    @FXML
    private void abrirProyecto3() {
        cargarVista("/aldrichsystems/proyecto3/proyecto3.fxml");
    }
    @FXML
    private void abrirProyecto4() {
        cargarVista("/aldrichsystems/proyecto4/proyecto4.fxml");
    }
    @FXML
    private void abrirProyecto5() {
        cargarVista("/aldrichsystems/proyecto5/proyecto5.fxml");
    }
    @FXML
    private void abrirProyecto6() {
        cargarVista("/aldrichsystems/proyecto6/proyecto6.fxml");
    }
    @FXML
    private void abrirProyecto7() {
        cargarVista("/aldrichsystems/proyecto7/proyecto7.fxml");
    }
    @FXML
    private void abrirProyecto8() {
        cargarVista("/aldrichsystems/proyecto8/proyecto8.fxml");
    }
    @FXML
    private void abrirProyecto9() {
        cargarVista("/aldrichsystems/proyecto9/proyecto9.fxml");
    }
    @FXML
    private void abrirProyecto10() {
        cargarVista("/aldrichsystems/proyecto10/proyecto10.fxml");
    }

    private void cargarVista(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent view = loader.load();
            content.getChildren().setAll(view);
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("No se pudo cargar la vista");
            alert.setContentText("Revisa la ruta del FXML: " + fxmlPath);
            alert.showAndWait();
        }
    }
}
