import jade.core.behaviours.TickerBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.gui.GuiEvent;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class RoadAgent extends GuiAgent {
	
	@Override
	protected void setup() {
		/*Container gui=(Container) getArguments()[0];
		
		Image image = new Image("/image/city1.png");
		ImageView imageView = new ImageView(image);
		gui.stackPane.getChildren().add(imageView);
		imageView.toBack();*/
		
//		addBehaviour(new TickerBehaviour(this, 10) {
//			@Override
//			protected void onTick() {
//			}
//		});

		System.out.println("I'm roadAgent");
		System.out.println("My Name is " + this.getAID().getName());
		
		
		/*imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
			}
		});*/
	}

	@Override
	protected void beforeMove() {
		System.out.println("Avant de migrer vers une nouvelle location .....");
	}

	@Override
	protected void afterMove() {
		System.out.println("Je viens d'arriver à une nouvelle location .....");
	}

	@Override
	protected void takeDown() {
		System.out.println("avant de mourir .....");
	}

	@Override
	protected void onGuiEvent(GuiEvent guiEvent) {
	}
}