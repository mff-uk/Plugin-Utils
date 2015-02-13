package eu.unifiedviews.helpers.cuni.dpu.config;

import eu.unifiedviews.dpu.config.DPUConfigException;

/**
 *
 * @author Škoda Petr
 */
public class ConfigException extends DPUConfigException {

    public ConfigException(String message) {
        super(message);
    }

    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }

}
