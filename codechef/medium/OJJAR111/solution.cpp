                                    return () => {
                                          clearTimeout(timeoutId);
                                                window.removeEventListener("resize", handleResize);
                                                    };
                                                      }, [delay]);

                                                        return width;
                                                        };


                                                        const ResponsiveComponent = () => {
                                                          const width = useWindowWidth();

                                                            return (

                                window.addEventListener("resize", handleResize);

                            };
                  clearTimeout(timeoutId);
                        timeoutId = setTimeout(() => setWidth(window.innerWidth), delay);

            const handleResize = () => {
  const [width, setWidth] = useState(window.innerWidth);

    useEffect(() => {
        let timeoutId = null;
import { useState, useEffect } from "react";

const useWindowWidth = (delay = 200) => {
import React from "react";