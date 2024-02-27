import React, { useState } from 'react';
import './App.css';

function App() {
  // State for the counter value
  const [counter, setCounter] = useState(0);

  // Function to increment the counter
  const incrementCounter = () => {
    setCounter(counter + 1);
  };

  // Function to decrement the counter
  const decrementCounter = () => {
    if (counter > 0) {
      setCounter(counter - 1);
    }
  };

  // Function to reset the counter
  const resetCounter = () => {
    setCounter(0);
  };

  return (
    <div className="App">
      <h1>Counter App</h1>
      <div className="counter">{counter}</div>
      <div className="buttons">
        <button onClick={incrementCounter}>Increment</button>
        <button onClick={decrementCounter}>Decrement</button>
        <button onClick={resetCounter}>Reset</button>
      </div>
    </div>
  );
}

export default App;
