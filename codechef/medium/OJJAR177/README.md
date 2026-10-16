# OJJAR177

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task on Polymorphic Components

In  **`App.jsx`**, we're using the `Text` component to render different HTML elements (`h1`, `h2`, `p`, `label`) by passing the `as` prop. We also want to apply specific CSS classes based on the element type (e.g., `text--h1` for `<h1>`). The `className` prop is used to add extra classes when needed (like `className="label-text"` for the label).

 **Expectations from Text.jsx** 

- Dynamic Element Rendering: Use the as prop to determine which HTML element to render (default to <p>).
- Class Handling: Combine the base class text, a modifier class like text--h1 (based on the as prop), and any additional className passed.
- Prop Forwarding: Pass any extra props (like htmlFor for the label) to the rendered element.

 **Step-by-Step Instructions** 

- Destructure Props Properly: Access as, children, className, and other props correctly.
- Create Dynamic Element: Use the as prop to determine the HTML tag.
- Build Class String: Use template literals to combine classes.
- Pass All Remaining Props: Ensure extra attributes (e.g., htmlFor) are applied.

 **CSS Guidance (Check App.css):** 

- Base class:.text (applies to all Text components).
- Modifier classes:.text--h1,.text--h2, etc. (for specific styling).
- Custom classes:.label-text (added via className prop).

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T15:51:07.522Z  

```cpp
// Renders a dynamic HTML element with combined classes
// Defaults to <p> if 'as' prop is not provided
function Text({
  as: Element = 'p',
    children,
      className = '',
        ...props
        }) {
          const combinedClassName = `text text--${Element} ${className}`.trim();

            return (
                <Element className={combinedClassName} {...props}>
                      {children}
                          </Element>
                            );
                            }

                            export default Text;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR177)