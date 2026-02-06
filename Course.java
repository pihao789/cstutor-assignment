import java.util.ArrayList;

/**
 * Represents a college course and its assessments.
 */
public class Course {
    private final String name;
    private String semester;
    private final ArrayList<IAssessment> assessments;

    /**
     * Constructs a course with a name.
     *
     * @param name course name
     */
    public Course(String name) {
        this.name = name;
        this.assessments = new ArrayList<>();
    }

    /**
     * Gets the course name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the course semester.
     *
     * @return semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * Sets the course semester.
     *
     * @param semester semester
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * Adds an assessment to the course.
     *
     * @param assessment assessment to add
     */
    public void addAssessment(IAssessment assessment) {
        assessments.add(assessment);
    }

    /**
     * Builds a printable course summary.
     *
     * @return course info
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append('\n');
        if (semester != null) {
            builder.append(semester);
        }
        builder.append('\n');
        builder.append("Assessments:\n");
        for (IAssessment assessment : assessments) {
            builder.append(assessment.generateAssessmentInfo());
        }
        return builder.toString();
    }
}
