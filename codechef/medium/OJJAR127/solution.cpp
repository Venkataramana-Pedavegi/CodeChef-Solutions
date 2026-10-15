import React, { useState } from 'react';

function Tabs({ activeTabIndex, onPrevious, onNext, onTabClick }) {
    const totalTabs = 3;
        const isFirstTab = activeTabIndex === 0;
            const isLastTab = activeTabIndex === totalTabs - 1;

                // --- State variables ---
                    const [fullName, setFullName] = useState('');
                        const [email, setEmail] = useState('');
                            const [phone, setPhone] = useState('');
                                const [address, setAddress] = useState('');
                                    const [jobTitle, setJobTitle] = useState('');
                                        const [company, setCompany] = useState('');
                                            const [yearsExperience, setYearsExperience] = useState('0-1');
                                                const [skills, setSkills] = useState('');
                                                    const [agreeTerms, setAgreeTerms] = useState(false);

                                                        // --- Handler functions ---
                                                            const handleFullNameChange = (e) => setFullName(e.target.value);
                                                                const handleEmailChange = (e) => setEmail(e.target.value);
                                                                    const handlePhoneChange = (e) => setPhone(e.target.value);
                                                                        const handleAddressChange = (e) => setAddress(e.target.value);
                                                                            const handleJobTitleChange = (e) => setJobTitle(e.target.value);
                                                                                const handleCompanyChange = (e) => setCompany(e.target.value);
                                                                                    const handleYearsExperienceChange = (e) => setYearsExperience(e.target.value);
                                                                                        const handleSkillsChange = (e) => setSkills(e.target.value);
                                                                                            const handleAgreeTermsChange = (e) => setAgreeTerms(e.target.checked);
