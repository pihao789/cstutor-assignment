/**
 * Final exam assessment.
 */
public class FinalExam extends Quiz {
    private static final AssessmentType TYPE = AssessmentType.FINAL;
    private static final String DESCRIPTION =
            "Comprehensive Final covering all class material and worth 20% of the grade";

    /**
     * Constructs a final exam.
     *
     * @param name exam name
     * @param maxPoints maximum credit points
     * @param dueDate due date
     * @param minutesToComplete time limit in minutes
     * @param materialCovered class material covered
     */
    public FinalExam(
            String name,
            int maxPoints,
            String dueDate,
            int minutesToComplete,
            String materialCovered
    ) {
        super(name, DESCRIPTION, maxPoints, dueDate, minutesToComplete, materialCovered);
    }

    /**
     * Gets the assessment type.
     *
     * @return assessment type
     */
    @Override
    protected AssessmentType getType() {
        return TYPE;
    }
}
