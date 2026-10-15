# OJJAR126

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Populating Experience and Review & Submit Tabs

You've successfully added the static HTML form fields for the "Personal Info" tab. It now looks like a real form section!

 **This Module: Completing the Form's Static Structure**  Now, we'll continue building the form by populating the remaining two tabs: "Experience" (Tab 1) and "Review & Submit" (Tab 2). We'll add their respective HTML form fields (`input`, `select`, `textarea`, `checkbox`) and placeholder content for the review section.

 **Your Task: Add Static Content to "Experience" and "Review" Tabs** 

- Add Experience Fields (Tab 1): Inside the div for currentActiveTab === 1, replace the placeholder paragraph with: A heading (<h2>Work Experience</h2>) and introductory text. (Already added) Add this para - <p>Tell us about your professional background (All fields optional).</p> Add <label> and <input type="text"> for Job Title (id="jobTitle", name="jobTitle"). Add <label> and <input type="text"> for Company Name (id="company", name="company"). Add <label> and <select> for Years of Experience (id="yearsExperience", name="yearsExperience"). Include <option> elements for "0-1 Year", "1-3 Years", "3-5 Years", "5-10 Years", "10+ Years". Make sure each option has a value attribute (e.g., value="0-1"). <label> and <textarea> for Key Skills (id="skills", name="skills"). Set rows="4" and add a placeholder attribute (e.g., "e.g., React, Node.js, Agile"). Wrap each label/input pair in a <div className="form-section">.
- Populate Review & Submit Tab (Tab 2): Locate the conditional rendering block for activeTabIndex === 2. Remove the placeholder paragraph and Add the introductory paragraph: <p>Please check your details carefully before submitting.</p> Add Review Placeholders: Create two divs with className="review-section" to show where reviewed data will go: First review-section: <h4>Personal Information</h4> <p><strong>Full Name:</strong> [Data Will Go Here]</p> <p><strong>Email:</strong> [Data Will Go Here]</p> <p><strong>Phone:</strong> [Data Will Go Here]</p> <p><strong>Address:</strong> [Data Will Go Here]</p> Second review-section: <h4>Experience & Skills</h4> <p><strong>Job Title:</strong> [Data Will Go Here]</p> <p><strong>Company:</strong> [Data Will Go Here]</p> <p><strong>Years of Experience:</strong> [Data Will Go Here]</p> <p><strong>Skills:</strong> [Data Will Go Here]</p> Add Terms and Conditions Checkbox: Add a <div className="form-section terms-section">. Inside it, add <h4>Confirmation *</h4>. Then, add a <label htmlFor="agreeTerms"> that wraps an <input type="checkbox" id="agreeTerms" name="agreeTerms" /> and the text: I confirm that the information provided is accurate and I agree to the company's terms and conditions. (Make sure the text is part of the label for better clickability).

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T15:57:15.942Z  

```cpp
                                          className={`tab-header ${activeTabIndex === 0 ? 'active' : ''}`}
                                                    onClick={() => onTabClick(0)}
                                                            >
                                                                      1. Personal Info
                                                                              </button>
                                                                                      <button
                                                                                                className={`tab-header ${activeTabIndex === 1 ? 'active' : ''}`}
                                                                                                          onClick={() => onTabClick(1)}
                                                                                                                  >
                                                                                                                            2. Experience
                                                                                                                                    </button>
                                                                                                                                            <button
                                                                                                                                                      className={`tab-header ${activeTabIndex === 2 ? 'active' : ''}`}
                                                                                                                                                                onClick={() => onTabClick(2)}
                                                                                                                                                                        >
                                                                                                                                                                                  3. Review
                                                                                                                                                                                          </button>
import React from 'react';

function Tabs({ activeTabIndex, onPrevious, onNext, onTabClick }) {
  const totalTabs = 3;
    const isFirstTab = activeTabIndex === 0;
      const isLastTab = activeTabIndex === totalTabs - 1;

        return (
            <div className="tabs-container">
                  {/* Tab Headers */}
                        <div className="tab-headers">
                                <button
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR126)