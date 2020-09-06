package ua.training.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("check")
public interface StringService extends RemoteService {

	String checkInput(String input);
}
