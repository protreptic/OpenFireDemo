package org.javaprotrepticon.android.openfire.activity;

import org.jivesoftware.smack.ConnectionListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()
		  .setUsernameAndPassword("testuser", "123")
		  .setServiceName("qa")
		  .setHost("192.168.1.36")
		  .setPort(5222)
		  .build();

		XMPPConnection connection = new XMPPTCPConnection(config);
		connection.addConnectionListener(new ConnectionListener() {
			
			@Override
			public void reconnectionSuccessful() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void reconnectionFailed(Exception arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void reconnectingIn(int arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void connectionClosedOnError(Exception arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void connectionClosed() {
				
			}
			
			@Override
			public void connected(XMPPConnection arg0) {
				
			}
			
			@Override
			public void authenticated(XMPPConnection arg0, boolean arg1) {
				
			}
		});
		
		if (connection.isConnected()) {
			Toast.makeText(this, "", Toast.LENGTH_LONG).show();
		}
	}
	
}
