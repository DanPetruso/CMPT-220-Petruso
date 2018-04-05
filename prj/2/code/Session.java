import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Session {

	Button start, stop;
	Label stopwatchTime;
	
	public Scene setSceneClock() {
		
		VBox layout = new VBox();
		start = new Button("Start");
		stop = new Button("Stop");
		
		Timer timer = new Timer("Stopwatch");
		StopwatchTimerTask task = new StopwatchTimerTask();

		Button reset = new Button("Reset");
		Button back = new Button("Back");
		
		start.setOnAction(e -> timer.scheduleAtFixedRate(task, 0, 1000));
		stop.setOnAction(e -> {
			long timeToSave = task.getSeconds();
			task.cancel();
		});
		back.setOnAction(e -> WimHofTracker.window.setScene(WimHofTracker.scene));

		reset.setOnAction(e -> task.resetTime());
		
		//TODO PUT timeToSave INTO SQLITE
		
		stopwatchTime = new Label("0:00");
		
		layout.getChildren().addAll(start, stop, stopwatchTime, reset, back);
		
		Scene scene = new Scene(layout, 300, 200);
		return scene;
	}


	private class StopwatchTimerTask extends TimerTask {

		private long seconds = 0;
		
		@Override
		public void run() {
			seconds++;
			long minutes = seconds / 60;
			long leftoverSeconds = seconds % 60;
			String timer = minutes + ":" + leftoverSeconds;
			
			Platform.runLater(() -> {
				stopwatchTime.setText(timer);
			});
		}

		public void resetTime(){
			seconds = 0;
		}
		
		public long getSeconds() {
			return seconds;
		}
		
	}
}
