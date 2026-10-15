  // State to track which item index is currently expanded (null = all closed)
    const [activeIndex, setActiveIndex] = useState(null);

      // Toggle handler: close if already open, otherwise open the clicked index
        const handleClick = (index) => {
            setActiveIndex((prevIndex) => (prevIndex === index ? null : index));
              };

                return (
                    <div className="accordion">
                          {items.map((item, index) => (
                                  <AccordionItem
                                            key={index}
                                                      title={item.title}
                                                                content={item.content}
                                                                          isActive={activeIndex === index}
                                                                                    onClick={() => handleClick(index)}
                                                                                            />
                                                                                                  ))}
                                                                                                      </div>
                                                                                                        );
                                                                                                        }

                                                                                                        export default Accordion;