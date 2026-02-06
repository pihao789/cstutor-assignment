/**
 * Coding assignment assessment.
 */
public class CodingAssignment extends Assessment {
    private static final AssessmentType TYPE = AssessmentType.CODING;
    private static final String DESCRIPTION =
            "Weekly coding assignments are worth 40% of the grade";

    private final AssignmentDifficulty difficulty;

    /**
     * Constructs a coding assignment.
     *
     * @param name assignment name
     * @param maxPoints maximum credit points
     * @param dueDate due date
     * @param difficulty assignment difficulty
     */
    public CodingAssignment(
            String name,
            int maxPoints,
            String dueDate,
            AssignmentDifficulty difficulty
    ) {
        super(name, DESCRIPTION, maxPoints, dueDate);
        this.difficulty = difficulty;
    }

    /**
     * Gets the assignment difficulty.
     *
     * @return difficulty
     */
    public AssignmentDifficulty getDifficulty() {
        return difficulty;
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

    /**
     * Appends coding assignment-specific info to the StringBuilder.
     *
     * @param builder builder to append to
     */
    @Override
    public void generateAssessmentInfo(StringBuilder builder) {
        super.generateAssessmentInfo(builder);
        builder.append("Difficulty: ").append(difficulty).append('\n');
    }
}
