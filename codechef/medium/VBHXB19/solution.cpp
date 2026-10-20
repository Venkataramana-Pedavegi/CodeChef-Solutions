      setTimeout(() => {
      resolve("Sandwich wrapped!");
      }, 500); // Simulate wrapping for 0.5 seconds
      });
      }

      async function prepareSandwich() {
      const step1 = await prepareBread();
      console.log(step1); // Log: Bread prepared!

      const step2 = await addFilling();
      console.log(step2); // Log: Filling added!
      return new Promise(resolve => {
      function wrapSandwich() {

      }
      }, 2000); // Simulate adding filling for 2 seconds
      });
      resolve("Filling added!");
    setTimeout(() => {
  return new Promise(resolve => {
  function addFilling() {

function prepareBread() {
  return new Promise(resolve => {
  setTimeout(() => {
  resolve("Bread prepared!");
  }, 1000); // Simulate preparing bread for 1 second
  });
  }