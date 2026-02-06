/**
 * Interface for accessing assessment information.
 */
public interface IAssessment {
    /**
     * Generates the assessment info as a String.
     *
     * @return assessment info
     */
    String generateAssessmentInfo();

    /**
     * Appends the assessment info to the provided StringBuilder.
     *
     * @param builder builder to append to
     */
    void generateAssessmentInfo(StringBuilder builder);

    /**
     * Gets the due date.
     *
     * @return due date
     */
    String getDueDate();

    /**
     * Sets the due date.
     *
     * @param dueDate due date
     */
    void setDueDate(String dueDate);
}
