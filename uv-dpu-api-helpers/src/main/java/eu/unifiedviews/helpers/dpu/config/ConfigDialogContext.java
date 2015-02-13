package eu.unifiedviews.helpers.dpu.config;

import java.util.Locale;

/**
 * Context for {@link AbstractConfigDialog}.
 *
 * This class is part of UniviedViews API.
 *
 * @author Petr Škoda
 */
public interface ConfigDialogContext {

    /**
     * @return True if the dialog belongs to template false otherwise
     */
    boolean isTemplate();

    /**
     * Get the current locale
     */
    Locale getLocale();
}
