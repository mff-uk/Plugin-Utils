package eu.unifiedviews.helpers.cuni.dpu.advanced;

import eu.unifiedviews.helpers.cuni.dpu.context.UserContext;

/**
 * User version of {@link ExecContext}.
 *
 * @author Škoda Petr
 */
public class UserExecContext extends UserContext {

    protected final ExecContext<?> execMasterContext;

    public UserExecContext(ExecContext<?> execContext) {
        super(execContext);
        this.execMasterContext = execContext;
    }

    /**
     *
     * @return True if DPU is cancelled.
     */
    public boolean canceled() {
        return execMasterContext.getDpuContext().canceled();
    }

    public ExecContext<?> getExecMasterContext() {
        return execMasterContext;
    }

}
