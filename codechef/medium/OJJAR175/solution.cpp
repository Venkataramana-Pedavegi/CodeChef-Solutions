import React, { forwardRef } from "react";

const InputWithLabel = forwardRef(({ label, ...props }, ref) => {
  return (
      <div className="input-wrapper">
            <label>{label}</label>
                  <input ref={ref} {...props} />
                      </div>
                        );
                        });

                        export default InputWithLabel;