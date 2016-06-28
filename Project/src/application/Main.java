package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	
	private Stage stage;
	private Scene scene;
	private FlowPane pane;
	private Label label;
	
	@Override
	public void start(Stage stage) {
		try {
			/*this.stage = stage;
			pane = new FlowPane();
			
			label = new Label("Hello World!");
			pane.getChildren().add(label);
			
			scene = new Scene(pane, 640, 480);
			
			stage.setScene(scene);
			stage.show();
			*/
			
			//Parent panel = FXMLLoader.load(getClass().getResource("MyStyle.fxml").toExternalForm());
			//scene.getStylesheets().add(getClass().getResource("MyStyle.fxml").toExternalForm());
			//scene = new Scene(panel, 640, 480);
			/*stage.setTitle("Hello world!");
			stage.setScene(scene);
			stage.show();
			*/
					//scene.getStylesheets().add(getClass().getResource("MyStyle.fxml").toExternalForm());
			Parent root = FXMLLoader.load(getClass().getResource("MyStyle.fxml"));

		    Scene scene = new Scene(root, 300, 275);
		    stage.setTitle("FXML Welcome");
		    stage.setScene(scene); 
		    stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
