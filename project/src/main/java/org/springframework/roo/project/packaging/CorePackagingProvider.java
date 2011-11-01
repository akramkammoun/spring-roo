package org.springframework.roo.project.packaging;

/**
 * A {@link PackagingProvider} provided by Spring Roo, i.e. not by a third-party
 * addon.
 *
 * @author Andrew Swan
 * @since 1.2.0 
 */
abstract class CorePackagingProvider extends AbstractPackagingProvider {

	/**
	 * Constructor
	 *
	 * @param name the name of this type of packaging as used in the POM (required)
	 * @param pomTemplate the path of this packaging type's POM template,
	 * relative to its own package, as per {@link Class#getResourceAsStream(String)};
	 * this template should contain a "parent" element with its own groupId,
	 * artifactId, and version elements; this parent element will be removed if
	 * not required
	 */
	protected CorePackagingProvider(final String name, final String pomTemplate) {
		/*
		 * Core instances use the Maven packaging type as the ID so that the
		 * user sees intuitively-named packaging options on the command line. If
		 * they implement their own packaging types, they can name them with
		 * any other name that makes sense to them.
		 */
		super(name, name, pomTemplate);
	}
	
	public boolean isDefault() {
		return false;
	}
}