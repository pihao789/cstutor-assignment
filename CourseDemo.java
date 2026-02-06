/**
 * Demo program for the course assessment hierarchy.
 */
public class CourseDemo {
    /**
     * Entry point for the demo program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Course course = new Course("Programming Fundamentals III");
        course.setSemester("Fall 2021");

        course.addAssessment(new ParticipationQuiz(
                "Week1 Participation Quiz",
                10,
                "Aug 28",
                20,
                "Chapter 6"
        ));

        course.addAssessment(new MidTermExam(
                "Exam 1",
                100,
                "Sep 27",
                75,
                "Chapters 6-11, 15"
        ));

        course.addAssessment(new MidTermExam(
                "Exam 2",
                100,
                "Nov 8",
                75,
                "Chapters 16-19"
        ));

        course.addAssessment(new FinalExam(
                "Final Exam",
                100,
                "Dec 6",
                120,
                "Chapters 6-11, 15-19"
        ));

        course.addAssessment(new CodingAssignment(
                "Assignment 1c: Marble Fun Facts",
                10,
                "Aug 28",
                AssignmentDifficulty.EASY
        ));

        course.addAssessment(new CodingAssignment(
                "Assignment 2: Cash Register",
                24,
                "Sep 4",
                AssignmentDifficulty.MEDIUM
        ));

        course.addAssessment(new CodingAssignment(
                "Assignment 3: College Course",
                46,
                "Sep 11",
                AssignmentDifficulty.HARD
        ));

        System.out.print(course.toString());
    }
}
