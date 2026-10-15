
    // --- TODO: Remove individual states for form fields ---
    // States for form fields
    const [fullName, setFullName] = useState('');
    const [email, setEmail] = useState('');
    const [phone, setPhone] = useState('');
    const [address, setAddress] = useState('');
    const [jobTitle, setJobTitle] = useState('');
    const [company, setCompany] = useState('');
    const [yearsExperience, setYearsExperience] = useState('0-1');
    const [skills, setSkills] = useState('');
    
    // --- TODO: Create a single state object for formData ---
    
    
    // Keep agreeTerms and isSubmitted as separate states
    const [agreeTerms, setAgreeTerms] = useState(false);
    const [isSubmitted, setIsSubmitted] = useState(false);


    // --- TODO: Remove individual change handlers (except handleAgreeTermsChange) ---
    // Handlers for form fields
    const handleNameChange = (e) => setFullName(e.target.value);
    const isFirstTab = activeTabIndex === 0;
    const isLastTab = activeTabIndex === totalTabs - 1;
import {useState} from 'react';

function Tabs({ activeTabIndex, onPrevious, onNext, onTabClick }) {
    const totalTabs = 3; // Make sure this matches your tab count