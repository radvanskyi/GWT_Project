package ua.training.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtProject implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();
	private Button button1 = new Button("Button 1");
	private Button button2 = new Button("Button 2");
	private Button button3 = new Button("Button 3");

	@Override
	public void onModuleLoad() {

		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);

		RootPanel.get("mainContainer").add(mainPanel);

	}

}
