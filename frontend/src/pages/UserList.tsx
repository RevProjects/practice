import React, { useEffect, useState } from "react";
import axiosInstance from "../axios/AxiosInstance";
import { useNavigate } from "react-router-dom";

// Define the User interface
interface User {
  id: number | undefined;
  username: string | undefined;
}

export default function UserList() {
  const navigate = useNavigate();

  // Set initial state for users
  const [users, setUsers] = useState<User[]>([]);

  // Fetch all users
  useEffect(() => {
    const getUsersData = async () => {
      try {
        const response = await axiosInstance.get("/user/listusers"); // Call your API to get all users
        if (response === null) throw new Error("No response from the server");

        setUsers(response.data); // Set the state with the fetched users
        console.log(response.data);
      } catch (error) {
        console.error("Error fetching users: ", error);
      }
    };

    getUsersData();
  }, []);

  return (
    <div>
      <h2>All Users</h2>
      {/* Map through users and display them */}
      {users.length > 0 ? (
        users.map((user, id) => (
          <div key={id}>
            <p>
              <strong>Username:</strong> {user.username}
            </p>
          </div>
        ))
      ) : (
        <p>Loading...</p>
      )}

      {/* Button to navigate to a form for adding a new user */}
      <button onClick={() => navigate("/user/adduser")}>Add New User</button>
    </div>
  );
}
