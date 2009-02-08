package ch.liip.jcr.davex;

import javax.jcr.Credentials;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;


import org.apache.jackrabbit.jcr2spi.RepositoryImpl;
import org.apache.jackrabbit.jcr2spi.config.RepositoryConfig;

public class DavexClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			String url ="http://localhost:8080/server/";

			RepositoryConfig config = new RepositoryConfigImplTest(url);
			Repository repo = RepositoryImpl.create(config);


			Credentials sc = new SimpleCredentials("admin","admin".toCharArray());
			Session s = repo.login(sc,"default");
			Node root=s.getRootNode();
			System.out.println("Root node is of type: "+root.getPrimaryNodeType().getName());
			System.out.println("Root node name: "+root.getName());



		} catch (RepositoryException e) {
			e.printStackTrace();
		}
	}

}
