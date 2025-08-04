import React from "react";
import { Link, Outlet } from "react-router-dom";

function Product() {
  return (
    <div>
      <h1>Product Page</h1>
      <ul className="nav nav-tabs">
        <li>
          <Link to={"mobile"} className="nav-link">
            Mobile
          </Link>
        </li>
        <li>
          <Link to={"lcd"} className="nav-link">
            LCD
          </Link>
        </li>
      </ul>
      <Outlet />
    </div>
  );
}

export default Product;
