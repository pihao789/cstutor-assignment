/**
 * Participation quiz assessment.
 */
public class ParticipationQuiz extends Quiz {
    private static final AssessmentType TYPE = AssessmentType.PARTICIPATION;
    private static final String DESCRIPTION =
            "Participation Quizzes test weekly reading and are worth 10% of the grade";

    /**
     * Constructs a participation quiz.
     *
     * @param name quiz name
     * @param maxPoints maximum credit points
     * @param dueDate due date
     * @param minutesToComplete time limit in minutes
     * @param materialCovered class material covered
     */
    public ParticipationQuiz(
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
