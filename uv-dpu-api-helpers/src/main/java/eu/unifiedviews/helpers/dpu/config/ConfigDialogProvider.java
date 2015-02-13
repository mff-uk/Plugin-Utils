package eu.unifiedviews.helpers.dpu.config;


/**
 * Interface which provides graphical configuration dialog associated with the
 * given DPU
 * 
 * This class is part of UniviedViews API.
 *
 * @author Petr Škoda
 * @param <C>
 */
public interface ConfigDialogProvider<C> {

    /**
     * @return Configuration dialog.
     */
    public AbstractConfigDialog<C> getConfigurationDialog();

}
