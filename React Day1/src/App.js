import logo from "./logo.svg";
import "./App.css";
import Product from "./components/product";
import ProductClass from "./components/ProductClass";
import StateDemo from "./components/StateDemo";
import StateDemoWithClass from "./components/StateDemoWithClass";
import ToggleComponent from "./components/ToggleDemo";
import Counter from "./components/Counter";

function App() {
  const products = [
    { pname: "Java Book", price: 850, soldBy: "Amazon" },
    { pname: "IPhone", price: 99850, soldBy: "FlipKart" },
    { pname: "LCD", price: 55850, soldBy: "Paytm" },
    { pname: "Laptop", price: 123850, soldBy: "Amazon" },
    { pname: "Car", price: 5678850, soldBy: "Honda" },
  ];
  return (
    <>
      {/* {products.map((p) => (
        <ProductClass pname={p.pname} price={p.price} soldby={p.soldBy} />
      ))} */}
      {/* <StateDemo /> */}
      {/* <StateDemoWithClass />
      <ToggleComponent /> */}

      <Counter />
    </>
  );
}

export default App;
