}
// Step 7: Run Practice
async function runPractice() {
  await createStudent();
  await readAllStudents();

  // Uncomment this line to test reading by ID:
  // await readStudentById('REPLACE_WITH_ACTUAL_OBJECT_ID');

  mongoose.connection.close();
}
// Step 7: Run Practice
async function runPractice() {
  await createStudent();
  await readAllStudents();

  // Uncomment this line to test reading by ID:
  // await readStudentById('REPLACE_WITH_ACTUAL_OBJECT_ID');

  }
    console.error('❌ Error finding student by ID:', error);
  } catch (error) {
    }
      console.log('⚠️ No student found with that ID');
    } else {
      console.log('🔍 Student Found by ID:', student);
    if (student) {
    const student = await Student.findById(id);
  try {