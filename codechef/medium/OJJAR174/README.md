# OJJAR174

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a React App with User Greeting Modal

We're going to work with a simple `Button` component. The goal is to make this button reusable and flexible. We've provided some default styling in `App.css` for a basic button (`.btn`) and variations like a primary (`.btn-primary`) and secondary (`.btn-secondary`) button.

Our component should always apply the base `"btn"` class. Users should then be able to add  *their own*  classes (like `"btn-primary"`) to customize the appearance using the styles defined in `App.css` or even their own custom styles.

Crucially, we also want our button  *always*  to be a `<button>` element with `type="button"` by default. This prevents users from accidentally changing its fundamental behavior (like turning it into a submit button) just by passing a `type` prop. Of course, it should still accept other standard button props like `onClick` or `disabled`.

#### Your Task

You are given a basic `Button` component template and a `App.css` file. The component currently has two problems:

- Type Conflict: If a user passes a type prop (e.g., type="submit"), it will override the component's intended type="button". Fix this so the component's internal type="button" always takes precedence.
- ClassName Merging: The component needs to apply the base "btn" class for fundamental styling. If the user provides their own className prop (e.g., className="btn-primary" to make it look like the primary button style defined in App.css), it should be added alongside "btn". The final result should be class="btn btn-primary", not just class="btn-primary". The current code incorrectly replaces the base class.

 **Your job is to modify the `Button` component in `App.jsx` to:** 

- Ensure the type="button" prop defined inside the component cannot be overridden by props passed from the outside using {...otherProps}.
- Combine the default "btn" class with any className prop the user passes in. Go take a look at the App.css file to see the different styles (.btn,.btn-primary,.btn-secondary) that users might want to apply via the className prop!

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T06:49:42.655Z  

```cpp
            <p>Primary Button (should have classes "btn btn-primary"):</p>
            <Button
            className="btn-primary"
            onClick={() => alert('Primary clicked!')}
            >
            Primary Button
            </Button>
            <p>Button trying to override type (should remain type="button"):</p>
            <Button
            className="btn-secondary"
            type="submit" // This prop is passed but ignored for the 'type' attribute
            onClick={() => alert('Secondary clicked!')}
            >
            Secondary (Still a Button)
            </Button>
            <p>Disabled Button (should have "btn" class and be disabled):</p>
            <Button disabled>
            Disabled Button
            </Button>
            </div>
            );
            }

            export default App;

```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR174)