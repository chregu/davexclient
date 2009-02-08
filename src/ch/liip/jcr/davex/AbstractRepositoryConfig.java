/**
 * 
 */
package ch.liip.jcr.davex;

import org.apache.jackrabbit.jcr2spi.config.CacheBehaviour;
import org.apache.jackrabbit.jcr2spi.config.RepositoryConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author chregu
 *
 */
public abstract class AbstractRepositoryConfig implements RepositoryConfig {

	private static Logger log = LoggerFactory.getLogger(AbstractRepositoryConfig.class);

	public static final int DEFAULT_ITEM_CACHE_SIZE = 5000;

	private final CacheBehaviour cacheBehaviour;
	private final int itemCacheSize;

	private final int pollTimeout = 1000; // ms

	protected AbstractRepositoryConfig() {
		this(CacheBehaviour.INVALIDATE, DEFAULT_ITEM_CACHE_SIZE);
	}

	protected AbstractRepositoryConfig(CacheBehaviour cacheBehaviour, int itemCacheSize) {
		this.cacheBehaviour = cacheBehaviour;
		this.itemCacheSize = itemCacheSize;
	}

	//---------------------------------------------------< RepositoryConfig >---
	/**
	 * @see RepositoryConfig#getCacheBehaviour()
	 */
	public CacheBehaviour getCacheBehaviour() {
		return cacheBehaviour;
	}

	/**
	 * @see RepositoryConfig#getItemCacheSize() 
	 */
	public int getItemCacheSize() {
		return itemCacheSize;
	}

	public int getPollTimeout() {
		return pollTimeout;
	}


}
