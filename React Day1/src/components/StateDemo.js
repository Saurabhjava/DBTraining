import React, { useEffect, useState } from "react";

function StateDemo() {
  const [counter, setCounter] = useState(0);
  const [msg, setMessage] = useState("Hello React");

  function incr() {
    setCounter(counter + 1);
    console.log(counter);
  }
  function changeMessage() {
    setMessage("Message changed By Button Clicked");
  }

  useEffect(() => {
    document.title = `You clicked ${counter}`;
  }, [counter]);

  useEffect(() => {
    document.title = `Message State changed`;
  }, [msg]);

  return (
    <div>
      <h2>{counter}</h2>
      <h2>{msg}</h2>
      <button onClick={incr}>Incr Counter</button>
      <button onClick={changeMessage}>ClickToChange</button>
    </div>
  );
}

export default StateDemo;
