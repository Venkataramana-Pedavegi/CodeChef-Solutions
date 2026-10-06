              start = 0;
                }

                  for (let i = start; i < end; i += step) {
                      result.push(i);
                        }

                          return result;
                          };

                          function NumberBoxes({ count }) {  
                            return (  
                                <ul>
                                      {range(count).map((num) => (  
                                              <li>
                                                        {num + 1}  
                                                                </li>  
                                                                      ))}  
                                                                          </ul>
                                                                            );  
                                                                            }

                                                                            export default function App() {
                                                                              return (
                                                                                  <NumberBoxes count={3} />
                                                                                    );
                                                                                    }
    let result = [];

      if (typeof end === 'undefined') {
          end = start;
const range = (start, end, step = 1) => {