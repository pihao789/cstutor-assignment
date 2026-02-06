/**
 * Base class for all assessments.
 */
public abstract class Assessment implements IAssessment {
    private final String name;
    private final String description;
    private final int maxPoints;
    private String dueDate;

    /**
     * Constructs an assessment with basic information.
     *
     * @param name assessment name
     * @param description assessment description
     * @param maxPoints maximum credit points
     * @param dueDate due date
     */
    protected Assessment(String name, String description, int maxPoints, String dueDate) {
        this.name = name;
        this.description = description;
        this.maxPoints = maxPoints;
        this.dueDate = dueDate;
    }

    /**
     * Gets the assessment name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the assessment description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the maximum credit points.
     *
     * @return maximum points
     */
    public int getMaxPoints() {
        return maxPoints;
    }

    /**
     * Gets the due date.
     *
     * @return due date
     */
    @Override
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the due date.
     *
     * @param dueDate due date
     */
    @Override
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Gets the assessment type.
     *
     * @return assessment type
     */
    protected abstract AssessmentType getType();

    /**
     * Generates the assessment info as a String.
     *
     * @return assessment info
     */
    @Override
    public String generateAssessmentInfo() {
        StringBuilder builder = new StringBuilder();
        generateAssessmentInfo(builder);
        return builder.toString();
    }

    /**
     * Appends the assessment info to the provided StringBuilder.
     *
     * @param builder builder to append to
     */
    @Override
    public void generateAssessmentInfo(StringBuilder builder) {
        builder.append("Type: ").append(getType()).append('\n');
        builder.append("Name: ").append(name).append('\n');
        builder.append("Description: ").append(description).append('\n');
        builder.append("Points: ").append(maxPoints).append('\n');
        builder.append("Due: ").append(dueDate).append('\n');
    }
}
