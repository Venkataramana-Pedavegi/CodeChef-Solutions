// TASK 2: Create the 'courses' collection
db.createCollection('courses');

// TASK 3: Drop the 'courses' collection
db.courses.drop();

// TASK 4: Drop the current database.
// Keep this line commented while verifying your collections.
// Uncomment it after verification to remove the database.
db.dropDatabase();

print("Database operations completed successfully.");