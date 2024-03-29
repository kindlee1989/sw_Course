package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// FXML 파일 로딩하는 로더로 파일 읽기
		Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("Sample.fxml"));
		Scene scene = new Scene(root, 400, 400);
		
		String str = getClass().getResource("application.css").toString();
		System.out.println(str);
		
		scene.getStylesheets().add(str);
		
		primaryStage.setScene(scene);
		primaryStage.show();


		//		try {
		//			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		//			Scene scene = new Scene(root,400,400);
		//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//			primaryStage.setScene(scene);
		//			primaryStage.show();
		//		} catch(Exception e) {
		//			e.printStackTrace();
		//		}
	}

	public static void main(String[] args) throws Exception {
		launch(args);
	}
}
