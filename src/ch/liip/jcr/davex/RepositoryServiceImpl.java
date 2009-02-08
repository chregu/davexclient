package ch.liip.jcr.davex;

import java.util.Map;

import javax.jcr.RepositoryException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.jackrabbit.spi.SessionInfo;
import org.apache.jackrabbit.spi.spi2davex.BatchReadConfig;
import org.apache.jackrabbit.spi2dav.SessionInfoImpl;

public class RepositoryServiceImpl extends
		org.apache.jackrabbit.spi.spi2davex.RepositoryServiceImpl {

	
    
    public RepositoryServiceImpl(String jcrServerURI,
			BatchReadConfig batchReadConfig) throws RepositoryException {
		super(jcrServerURI, batchReadConfig);
		// TODO Auto-generated constructor stub
	}
    /*public Map getRepositoryDescriptors() throws RepositoryException {
    		return null;
    }*/
}
/*   protected HttpClient getClient(SessionInfo sessionInfo) throws RepositoryException {
HttpClient client = (HttpClient) clients.get(sessionInfo);
if (client == null) {
    client = new HttpClient(connectionManager);
    client.setHostConfiguration(hostConfig);
    // always send authentication not waiting for 401
    client.getParams().setAuthenticationPreemptive(true);
    // NOTE: null credentials only work if 'missing-auth-mapping' param is
    // set on the server
    org.apache.commons.httpclient.Credentials creds = null;
    if (sessionInfo != null) {
        checkSessionInfo(sessionInfo);
        creds = ((SessionInfoImpl) sessionInfo).getCredentials().getCredentials();
    }
    client.getState().setCredentials(AuthScope.ANY, creds);
    clients.put(sessionInfo, client);
    log.debug("Created Client " + client + " for SessionInfo " + sessionInfo);
}
return client;
}
*/