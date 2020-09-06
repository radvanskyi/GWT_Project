package ua.training.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ua.training.client.StringService;

@SuppressWarnings("serial")
public class StringServiceImpl extends RemoteServiceServlet implements StringService {

	public String checkInput(String input) {
		System.out.println("Input - " + input);
		return "Hello " + input;
	}
}
