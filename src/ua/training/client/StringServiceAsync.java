package ua.training.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StringServiceAsync {

	void checkInput(String input, AsyncCallback<String> callback);
}
