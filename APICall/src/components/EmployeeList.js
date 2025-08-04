import axios from "axios";
import React, { useEffect, useState } from "react";

function EmployeeList() {
  const [employees, setEmployees] = useState([]);

  const fetchEmployee = async () => {
    // axios.get("http://localhost:8080/employees").then(response=>{
    //      setEmployees(response.data);
    // }).catch(err=>{
    //     console.log(err);
    // })
    const response = await axios.get("http://localhost:8080/employees");
    setEmployees(response.data);
  };
  useEffect(() => {
    fetchEmployee();
  }, []);
  return (
    <div>
      <table border="1" cellPadding="10" style={{ borderCollapse: "collapse" }}>
        <thead>
          <tr>
            <th>EmployeeId</th>
            <th>Name</th>
            <th>Email</th>
            <th>DOB</th>
            <th>Salary</th>
          </tr>
        </thead>
        <tbody>
          {employees.map((e) => (
            <tr>
              <td>{e.empid}</td>
              <td>{e.name}</td>
              <td>{e.email}</td>
              <td>{e.dob}</td>
              <td>{e.salary}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default EmployeeList;
