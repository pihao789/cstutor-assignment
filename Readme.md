# COSC 2436 Assignment 3

Java implementation of the college course assessment hierarchy described in
`COSC2436_Assignment3.pdf`.

## Files

- `IAssessment.java`: interface for assessment info and due dates
- `Assessment.java`: abstract base class
- `Quiz.java`: abstract quiz subclass
- `ParticipationQuiz.java`, `MidTermExam.java`, `FinalExam.java`: quiz types
- `CodingAssignment.java`: coding assignment type
- `AssessmentType.java`, `AssignmentDifficulty.java`: enums
- `Course.java`: course container
- `CourseDemo.java`: demo with `main`

## Build and Run

```bash
javac CourseDemo.java
java CourseDemo
```

## Mermaid Class Diagram

```mermaid
classDiagram
    direction TB

    class IAssessment {
        <<interface>>
        +String generateAssessmentInfo()
        +void generateAssessmentInfo(StringBuilder)
        +String getDueDate()
        +void setDueDate(String)
    }

    class AssessmentType {
        <<enum>>
        PARTICIPATION
        CODING
        MIDTERM
        FINAL
    }

    class Difficulty {
        <<enum>>
        EASY
        MEDIUM
        HARD
    }

    class Assessment {
        <<abstract>>
        -final String name
        -final String description
        -final int maxPoints
        -String dueDate
        +Assessment(String, String, int, String)
        +String getName()
        +String getDescription()
        +int getMaxPoints()
        +String getDueDate()
        +void setDueDate(String)
        +String generateAssessmentInfo()
        +void generateAssessmentInfo(StringBuilder)
        +AssessmentType getType()
    }

    class Quiz {
        <<abstract>>
        -final int minutesToComplete
        -final String material
        +Quiz(String, String, int, String, int, String)
        +int getMinutesToComplete()
        +String getMaterial()
        +void generateAssessmentInfo(StringBuilder)
    }

    class ParticipationQuiz {
        -static final AssessmentType TYPE
        -static final String DESCRIPTION
        +ParticipationQuiz(String, int, String, int, String)
        +AssessmentType getType()
    }

    class MidTermExam {
        -static final AssessmentType TYPE
        -static final String DESCRIPTION
        +MidTermExam(String, int, String, int, String)
        +AssessmentType getType()
    }

    class FinalExam {
        -static final AssessmentType TYPE
        -static final String DESCRIPTION
        +FinalExam(String, int, String, int, String)
        +AssessmentType getType()
    }

    class CodingAssignment {
        -static final AssessmentType TYPE
        -static final String DESCRIPTION
        -final Difficulty difficulty
        +CodingAssignment(String, int, String, Difficulty)
        +Difficulty getDifficulty()
        +AssessmentType getType()
        +void generateAssessmentInfo(StringBuilder)
    }

    class Course {
        -final String name
        -String semester
        -final ArrayList~IAssessment~ assessments
        +Course(String)
        +String getName()
        +String getSemester()
        +void setSemester(String)
        +void addAssessment(IAssessment)
        +String toString()
    }

    class CourseDemo {
        +static void main(String[] args)
    }

    IAssessment <|.. Assessment
    Assessment <|-- Quiz
    Quiz <|-- ParticipationQuiz
    Quiz <|-- MidTermExam
    Quiz <|-- FinalExam
    Assessment <|-- CodingAssignment

    Course "1" o-- "many" IAssessment
    AssessmentType <.. Assessment
    Difficulty <.. CodingAssignment


```