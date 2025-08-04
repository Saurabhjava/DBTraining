import React from "react";
import { Link } from "react-router-dom";

function NavBar() {
  return (
    <div>
      <ul className="nav nav-tabs">
        <li>
          <Link to={"/"} className="nav-link">
            About
          </Link>
        </li>
        <li>
          <Link to={"home"} className="nav-link">
            Home
          </Link>
        </li>
        <li>
          <Link to={"product"} className="nav-link">
            Product
          </Link>
        </li>
        <li>
          <Link to={"book"} className="nav-link">
            Book
          </Link>
        </li>
      </ul>
    </div>
  );
}

export default NavBar;
