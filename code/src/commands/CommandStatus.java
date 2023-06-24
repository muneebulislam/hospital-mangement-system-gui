package commands;

public class CommandStatus {
    /** Specification of whether  the command was successfully executed. */
    protected boolean
            successful = false;
    /** If the command was not successful, an appropriate error message. */
    protected String
            errorMessage;
    public boolean wasSuccessful()
    {
        return
                successful;
    }
    /**
      * @return the errorMessage */
    public String getErrorMessage()
    {
        if(wasSuccessful()) throw new RuntimeException("The last execution must have been "
                + "unsuccessful in order to retrieve its error message.");
        return
                errorMessage;
    }
}

