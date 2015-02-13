package cz.cuni.mff.xrg.uv.boost.serialization;

import eu.unifiedviews.helpers.dataunit.HelperFailedException;

/**
 * Base exception used by serialization module.
 * 
 * @author Škoda Petr
 */
public class SerializationFailure extends HelperFailedException {

    public SerializationFailure(String message) {
        super(message);
    }

    public SerializationFailure(String message, Throwable cause) {
        super(message, cause);
    }

    public SerializationFailure(Throwable cause) {
        super(cause);
    }

}
