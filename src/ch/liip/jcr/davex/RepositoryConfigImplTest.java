package ch.liip.jcr.davex;

import org.apache.jackrabbit.spi.RepositoryService;
import org.apache.jackrabbit.spi.commons.conversion.PathResolver;
import org.apache.jackrabbit.spi2davex.BatchReadConfig;
import org.apache.jackrabbit.spi2davex.RepositoryServiceImpl;
import org.apache.jackrabbit.spi.Path;

import javax.jcr.NamespaceException;
import javax.jcr.RepositoryException;

public class RepositoryConfigImplTest  extends AbstractRepositoryConfig {

	private final RepositoryService service;

	public RepositoryConfigImplTest(String uri) throws RepositoryException {
		super();
		service = createService(uri);
	}


	private static RepositoryService createService(String uri) throws RepositoryException {
		BatchReadConfig batchReadConfig = new BatchReadConfig() {
			public int getDepth(Path path, PathResolver resolver)
			throws NamespaceException {
				return 0;
			}
		};

		return new RepositoryServiceImpl(uri, batchReadConfig);
	}

	public RepositoryService getRepositoryService() throws RepositoryException {
		return service;
	}
}
