package ua.training.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtProject implements EntryPoint, ClickHandler {

	private StringServiceAsync stringService = GWT.create(StringService.class);
	private VerticalPanel mainPanel = new VerticalPanel();

	private Button button = new Button("Button");
	private TextBox textInput = new TextBox();
	private Label label = new Label();
	private Label labelResult = new Label();

	@Override
	public void onModuleLoad() {

		button.addClickHandler(this);
		button.setStyleName("redButton");

		label.setStyleName("counter");
		textInput.setStyleName("textStyle");

		textInput.addKeyPressHandler(event -> label.setText(textInput.getValue().trim().length() + ""));

		mainPanel.add(button);
		mainPanel.add(textInput);
		mainPanel.add(label);
		mainPanel.add(labelResult);

		RootPanel.get("mainContainer").add(mainPanel);

	}

	@Override
	public void onClick(ClickEvent event) {

		stringService.checkInput(textInput.getValue(), new AsyncCallback<String>() {

			@Override
			public void onSuccess(String result) {

				labelResult.setText(result);
			}

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}
		});

	}

}
