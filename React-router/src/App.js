import logo from "./logo.svg";
import "./App.css";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import EmployeeHome from "./components/EmployeeHome";
import NavBar from "./NavBar";
import { Route, Routes } from "react-router-dom";
import About from "./components/About";
import Product from "./components/Product";
import Mobile from "./components/Mobile";
import LCD from "./components/LCD";
import Book from "./components/Book";
function App() {
  return (
    <>
      <NavBar />
      <Routes>
        <Route path="/" element={<About />}></Route>
        <Route path="home" element={<EmployeeHome />}></Route>
        <Route path="product" element={<Product />}>
          <Route path="mobile" element={<Mobile />}></Route>
          <Route path="lcd" element={<LCD />}></Route>
        </Route>
        <Route path="book" element={<Book />}></Route>
      </Routes>
    </>
  );
}

export default App;
