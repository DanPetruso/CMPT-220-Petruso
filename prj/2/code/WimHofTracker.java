import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.sql.*;


public class WimHofTracker extends Application{
	
	Stage window;
	
	/*
	private static Connection con;
	private static boolean hasData = false;
	
	public ResultSet displayUsers() {
		if(con == null) {
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT round1, round2, round3, pushups, coldShower FROM user");
		return res;
	}
	*/
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Wim Hof Progress Tracker");
		
		Button startSession = new Button("Start Session");
		Session session = new Session();
		startSession.setOnAction(e -> window.setScene(session.setSceneClock()));
		
		Button checkResults = new Button("Check Results");
		Button help = new Button("Help");
		
		Label welcome = new Label("Welcome to the Wim Hof Activity Tracker");
		
		VBox layout = new VBox();
		layout.getChildren().addAll(welcome, startSession, checkResults, help);
		
		Scene scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}
}
