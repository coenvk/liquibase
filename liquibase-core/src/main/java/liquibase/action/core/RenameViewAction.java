package liquibase.action.core;

import liquibase.action.AbstractAction;

public class RenameViewAction extends AbstractAction {
    public static enum Attr {
        catalogName,
        schemaName,
        oldViewName,
        newViewName,

    }
}