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