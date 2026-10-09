# OJJAR113

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Complete the Newsletter Subscription Form

Let's build a newsletter subscription form using React! Your task is to complete the existing template by filling in the missing code pieces. Follow these steps carefully:

#### Step 1: Initialize State Variables
- Fix the email state initialization: Complete the commented / *email state* / with email Complete the setEmail state updater
- Initialize error state: Set initial value to null (instead of / *initial value* /)
#### Step 2: Handle Form Submission
- In the fetch() call: Set HTTP method to 'POST' Create request body using { name, email }
- After successful submission: Clear form fields using setName('') and setEmail('')
#### Step 3: Error Handling
- For non-OK responses: Throw error using throw new Error(data.message || 'Submission failed')
- In catch block: Update status to 'error' Set error message using setError(err.message)

 **To test the error message, change the ENDPOINT and observe the result.** 

#### Step 4: Form Reset
- In resetForm(): Reset all states: setName(''); setEmail(''); setStatus('idle'); setError(null);
#### Step 5: Email Input Binding
- Complete email input's onChange handler: Use (e) => setEmail(e.target.value)

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T16:24:47.376Z  

```cpp
                                                                                                                                                                                                                                                                                                                                                                                              required
                                                                                                                                                                                                                                                                                                                                                                                                      />
                                                                                                                                                                                                                                                                                                                                                                                                            </div>

                                                                                                                                                                                                                                                                                                                                                                                                                  <button type="submit" disabled={status === 'loading'}>
                                                                                                                                                                                                                                                                                                                                                                                                                          {status === 'loading' ? (
                                                                                                                                                                                                                                                                                                                                                                                                                                    <>
                                                                                                                                                                                                                                                                                                                                                                                                                                                <span className="spinner"></span> Sending...
                                                                                                                                                                                                                                                                                                                                                                                                                                                          </>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ) : (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            'Subscribe'
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    )}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          </button>

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                {status === 'error' && (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        <div className="error-container">
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  <p>⚠️ {error || 'Submission error'}</p>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            <button onClick={resetForm}>Try Again</button>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    </div>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          )}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              </form>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                );
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                export default NewsletterForm;

```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR113)