package ch.liip.jcr.davex;

import org.apache.jackrabbit.jcr2spi.config.CacheBehaviour;
import org.apache.jackrabbit.spi.RepositoryService;
import org.apache.jackrabbit.spi.IdFactory;
import org.apache.jackrabbit.spi.NameFactory;
import org.apache.jackrabbit.spi.PathFactory;
import org.apache.jackrabbit.spi.QValueFactory;
import org.apache.jackrabbit.spi.commons.conversion.PathResolver;
import org.apache.jackrabbit.spi.commons.identifier.IdFactoryImpl;
import org.apache.jackrabbit.spi.commons.name.NameFactoryImpl;
import org.apache.jackrabbit.spi.commons.name.PathFactoryImpl;
import org.apache.jackrabbit.spi.commons.value.QValueFactoryImpl;
import org.apache.jackrabbit.spi.spi2davex.BatchReadConfig;
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
		IdFactory idFactory = IdFactoryImpl.getInstance();
		NameFactory nFactory = NameFactoryImpl.getInstance();
		PathFactory pFactory = PathFactoryImpl.getInstance();
		QValueFactory vFactory = QValueFactoryImpl.getInstance();

		BatchReadConfig batchReadConfig = new BatchReadConfig() {


			public int getDepth(Path path, PathResolver resolver)
			throws NamespaceException {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		return new RepositoryServiceImpl(uri, batchReadConfig);
	}

	public RepositoryService getRepositoryService() throws RepositoryException {
		return service;
	}
}
