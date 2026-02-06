/**
 * Base class for quiz-type assessments.
 */
public abstract class Quiz extends Assessment {
    private final int minutesToComplete;
    private final String materialCovered;

    /**
     * Constructs a quiz.
     *
     * @param name quiz name
     * @param description quiz description
     * @param maxPoints maximum credit points
     * @param dueDate due date
     * @param minutesToComplete time limit in minutes
     * @param materialCovered class material covered
     */
    protected Quiz(
            String name,
            String description,
            int maxPoints,
            String dueDate,
            int minutesToComplete,
            String materialCovered
    ) {
        super(name, description, maxPoints, dueDate);
        this.minutesToComplete = minutesToComplete;
        this.materialCovered = materialCovered;
    }

    /**
     * Gets the time limit in minutes.
     *
     * @return time limit
     */
    public int getMinutesToComplete() {
        return minutesToComplete;
    }

    /**
     * Gets the class material covered.
     *
     * @return material covered
     */
    public String getMaterialCovered() {
        return materialCovered;
    }

    /**
     * Appends quiz-specific info to the StringBuilder.
     *
     * @param builder builder to append to
     */
    @Override
    public void generateAssessmentInfo(StringBuilder builder) {
        super.generateAssessmentInfo(builder);
        builder.append("Material: ").append(materialCovered).append('\n');
        builder.append("Time limit: ").append(minutesToComplete).append(" min\n");
    }
}
