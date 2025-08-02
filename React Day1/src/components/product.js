import React from "react";
import "./prod.css";

function Product(props) {
  return (
    <div className="prodStyle">
      <h3>ProductName: {props.pname}</h3>
      <h3>Price: {props.price}</h3>
      <h3>Sold By: {props.soldby}</h3>
    </div>
  );
}

export default Product;
