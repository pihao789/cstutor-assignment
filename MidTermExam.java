/**
 * Midterm exam assessment.
 */
public class MidTermExam extends Quiz {
    private static final AssessmentType TYPE = AssessmentType.MIDTERM;
    private static final String DESCRIPTION = "There are two midterms worth 15% each";

    /**
     * Constructs a midterm exam.
     *
     * @param name exam name
     * @param maxPoints maximum credit points
     * @param dueDate due date
     * @param minutesToComplete time limit in minutes
     * @param materialCovered class material covered
     */
    public MidTermExam(
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
