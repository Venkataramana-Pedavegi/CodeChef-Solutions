import './App.css'; // Make sure styles.css is in the same folder

// 1. Top-level Page Component (Holds the data)
function UserProfilePage() {
  const userData = {
    name: 'Alice Wonderland',
    bio: 'Curious explorer of digital rabbit holes.',
    actionText: 'View Profile',
  };

  // Prop Drilling starts here
  return (
    <MainContentArea
      userName={userData.name}
      userBio={userData.bio}
      profileActionText={userData.actionText}
    />
  );
}

// 2. Intermediate Layout Component (Doesn't use the props)
function MainContentArea({ userName, userBio, profileActionText }) {
  return (
    <div className="main-content">
      <h2>User Section</h2>
      {/* Passes props down */}
      <CardWrapper
        userName={userName}
        userBio={userBio}