import { useState } from "react";

// Custom hook for boolean toggle state
function useToggle(initialValue = false) {
  const [value, setValue] = useState(initialValue);

  const toggle = () => {
    setValue(!value);
  };

  return [value, toggle];
}

// Usage example
function ToggleComponent() {
  const [isToggled, toggle] = useToggle(false);

  return (
    <div>
      <button onClick={toggle}>{isToggled ? "ON" : "OFF"}</button>
      <p>{isToggled ? "The button is ON" : "The button is OFF"}</p>
    </div>
  );
}

export default ToggleComponent;
