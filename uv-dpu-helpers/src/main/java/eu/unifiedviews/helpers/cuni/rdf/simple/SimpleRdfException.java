package eu.unifiedviews.helpers.cuni.rdf.simple;

import eu.unifiedviews.dpu.DPUException;

/**
 *
 * @author Škoda Petr
 */
public class SimpleRdfException extends DPUException {

    public SimpleRdfException(String message) {
        super(message);
    }

    public SimpleRdfException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimpleRdfException(Throwable cause) {
        super(cause);
    }

}
