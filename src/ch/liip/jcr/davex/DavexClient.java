package ch.liip.jcr.davex;

import javax.jcr.Repository;
import javax.jcr.RepositoryException;


import org.apache.jackrabbit.jcr2spi.RepositoryImpl;
import org.apache.jackrabbit.jcr2spi.config.RepositoryConfig;

public class DavexClient {

	protected static String repoUrl;

	public DavexClient(String url) {

		repoUrl = url; 
	}


	public Repository getRepository()
	throws RepositoryException {
		RepositoryConfig config = new RepositoryConfigImplTest(repoUrl);
		Repository repo = RepositoryImpl.create(config);
		return repo;
	}

}
