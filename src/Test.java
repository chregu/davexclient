
import javax.jcr.Credentials;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import ch.liip.jcr.davex.DavexClient;

public class Test {


	public static void main(String[] args) {
		try {

			String url = "http://localhost:8080/server/";
			String workspace = "default";

			DavexClient Client = new DavexClient(url);
			Repository repo = Client.getRepository();
			Credentials sc = new SimpleCredentials("admin","admin".toCharArray());
			Session s = repo.login(sc,workspace);
			Node root=s.getRootNode();
			System.out.println("Root node is of type: "+root.getPrimaryNodeType().getName());

		} catch (RepositoryException e) {
			e.printStackTrace();
		}
	}
}
