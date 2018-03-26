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
		
		start.setOnAction(e -> timer.scheduleAtFixedRate(task, 0, 1000));
		stop.setOnAction(e -> {
			long timeToSave = task.getSeconds();
			task.cancel();
		});
		
		//TODO PUT timeToSave INTO SQLITE
		
		stopwatchTime = new Label("0:00");
		
		layout.getChildren().addAll(start, stop, stopwatchTime);
		
		Scene scene = new Scene(layout, 300, 300);
		return scene;
	}
	
	private class StopwatchTimerTask extends TimerTask {

		private long seconds = 0;
		
		@Override
		public void run() {
			seconds++;
			long minutes = seconds / 60;
			long leftoverSeconds = seconds % 60;
			String timer = minutes + ":" + seconds;
			
			Platform.runLater(() -> {
				stopwatchTime.setText(timer);
			});
		}
		
		public long getSeconds() {
			return seconds;
		}
		
	}
}
