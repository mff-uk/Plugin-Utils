package cz.cuni.mff.xrg.uv.test.boost.rdf;

import eu.unifiedviews.dataunit.rdf.WritableRDFDataUnit;
import org.openrdf.repository.RepositoryException;

/**
 * Factory for test RDF data units with limited functionality.
 *
 * @author Škoda Petr
 */
public class RdfDataUnitFactory {

    private RdfDataUnitFactory() {
        
    }

    public static WritableRDFDataUnit createInMemory() throws RepositoryException {
        return new InMemoryRdfDataUnit();
    }

}
