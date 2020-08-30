package ua.training.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtProject implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();
	private Button button = new Button("Button");
	private Label label = new Label();
	private TextArea textArea = new TextArea();

	@Override
	public void onModuleLoad() {

		button.addClickHandler(event -> buttonClick(event.getSource().toString()));
		button.setStyleName("redButton");

		label.setStyleName("labelStyle");
		textArea.setStyleName("textStyle");
		textArea.addKeyPressHandler(event -> label.setText(textArea.getValue().length() + ""));

		mainPanel.add(label);
		mainPanel.add(textArea);
		mainPanel.add(button);

		RootPanel.get("mainContainer").add(mainPanel);

	}

	private void buttonClick(String message) {
		Window.alert(message);
	}

}
