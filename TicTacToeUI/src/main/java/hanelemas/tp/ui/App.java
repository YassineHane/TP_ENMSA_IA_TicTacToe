package hanelemas.tp.ui;

import hanelemas.tp.ui.composants.compocase.CasePresentation;
import hanelemas.tp.ui.composants.compocase.CaseVue;
import hanelemas.tp.ui.composants.compoplateau.PlateauPresentation;
import hanelemas.tp.ui.composants.compoplateau.PlateauVue;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
	private FlowPane root;
	private PlateauPresentation lePlateau;
	
    @Override
    public void start(Stage primaryStage) {
    	primaryStage.setTitle("Convertisseur Euros<->Dollars");
    	root = new FlowPane(Orientation.HORIZONTAL,10, 10);
    	lePlateau = new PlateauPresentation();
    	root.getChildren().add((PlateauVue)lePlateau.getPlateauVue());
    	Scene scene = new Scene(root, 600, 100);
		primaryStage.setScene(scene);
		primaryStage.setMinWidth(600);
		primaryStage.setMinHeight(120);
		primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}