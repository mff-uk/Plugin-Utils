package cz.cuni.mff.xrg.uv.boost.dpu.advanced;

import cz.cuni.mff.xrg.uv.boost.dpu.context.Context;
import eu.unifiedviews.dpu.DPUContext;
import eu.unifiedviews.dpu.DPUException;

/**
 *
 * @author Škoda Petr
 */
public class ExecContext<CONFIG> extends Context<CONFIG> {

    /**
     * Owner DPU instance.
     */
    protected final AbstractDpu<CONFIG> dpu;

    /**
     * Execution context.
     */
    protected DPUContext dpuContext = null;

    /**
     * DPU's configuration.
     */
    protected CONFIG dpuConfig = null;

    /**
     * Cause given DPU initialization. Must not be called in constructor!
     *
     * @param dpuClass
     * @param dpuInstance
     * @param ontology
     * @throws DPUException
     */
    public ExecContext(AbstractDpu<CONFIG> dpuInstance) {
        super((Class<AbstractDpu<CONFIG>>) dpuInstance.getClass(), dpuInstance);
        this.dpu = dpuInstance;
    }

    public CONFIG getDpuConfig() {
        return dpuConfig;
    }

    public void setDpuConfig(CONFIG config) {
        this.dpuConfig = config;
    }

    public DPUContext getDpuContext() {
        return dpuContext;
    }

    public AbstractDpu<CONFIG> getDpu() {
        return dpu;
    }

    /**
     * Initialize context before first use.
     * 
     * @param configAsString
     * @param dpuContext
     * @throws DPUException
     */
    protected void init(String configAsString, DPUContext dpuContext) throws DPUException {
        this.dpuContext = dpuContext;
        init(configAsString, dpuContext.getLocale(), this.dpu.getClass().getClassLoader());
    }

}
