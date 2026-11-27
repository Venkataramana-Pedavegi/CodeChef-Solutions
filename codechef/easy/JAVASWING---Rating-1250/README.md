# JAVASWING - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Quiz Application Using Java Swing

Build a  **Quiz Application using Java Swing**.

The application must display multiple-choice questions one at a time. Each question contains exactly four options, and the user can select only one option. The application must validate the selection, move through the questions, calculate the score, and display the final result.

The quiz must contain at least  **5 questions**.

### Your Task
#### Question.java

Implement the model used to represent one quiz question.

You must:

- Store the question text.
- Store exactly four answer options.
- Store the index of the correct option.
- Implement the constructor.
- Implement getter methods for the question text, options, and correct option index.

The correct option index must use values from `0` to `3`.

#### QuizPanel.java

Implement the Swing interface and quiz logic.

You must:

- Extend JPanel.
- Display the current question number, such as:

```
Question 1 of 5

```

- Display the question text using JLabel.
- Display exactly four answer choices using JRadioButton.
- Use ButtonGroup so that only one option can be selected.
- Display a Next button while more questions remain.
- Display Submit for the final question.
- Handle button clicks using Swing event handling.
- Check whether the selected answer is correct.
- Maintain the user's score.
- Clear the previous radio-button selection when moving to another question.

If the user clicks  **Next**  or  **Submit**  without selecting an option, display:

```
Please select an answer.

```

The quiz must remain on the same question.

After the final answer is submitted, display:

```
Quiz Completed! Score: X/Y

```

where `X` is the number of correct answers and `Y` is the total number of questions.

After the quiz is completed, disable the answer options and the  **Submit**  button.

### Expected Application Flow

Initially, the application may display:

```
Question 1 of 5

Which keyword is used to inherit a class in Java?

() implement
() extends
() inherits
() super

[Next]

```

If no answer is selected:

```
Please select an answer.

```

On the final question:

```
[Submit]

```

After submission:

```
Quiz Completed! Score: 4/5

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T14:06:21.426Z  

```cpp
package com.swingquiz;

public class Question {

    private String questionText;
    private String[] options;
    private int correctOptionIndex;

    public Question(
            String questionText,
            String[] options,
            int correctOptionIndex) {

        // TODO: Store the question text.

        // TODO: Store the four answer options.

        // TODO: Store the correct option index.
    }

    public String getQuestionText() {

        // TODO: Return the question text.
        return null;
    }

    public String[] getOptions() {

        // TODO: Return the four answer options.
        return null;
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASWING)