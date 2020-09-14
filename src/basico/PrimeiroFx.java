package basico;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Button botao= new Button("A");
		Button botaoB= new Button("B");
		Button botaoC= new Button("C");
		botao.setOnAction(e -> System.out.println("A"));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0));
		VBox box= new VBox(); // organiza elementos na vertical
		box.setSpacing(10);
	    box.setAlignment(Pos.CENTER);
		box.getChildren().add(botao);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		Scene Cena= new Scene(box,100,150);
		
		primaryStage.setScene(Cena);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
