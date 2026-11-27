
        } else {

            currentQuestionIndex++;
            displayQuestion();
        }
    }

    private void showResult() {

        // Task completed: Display the final result.
        statusLabel.setText(
                "Quiz Completed! Score: "
                        + score
                        + "/"
                        + questions.size());

        // Task completed: Prevent additional answers.
        for (JRadioButton button : optionButtons) {
            button.setEnabled(false);
        }

        nextButton.setEnabled(false);
    }
}