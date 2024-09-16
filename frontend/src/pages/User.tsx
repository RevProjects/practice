import { useRef, useState } from "react";
import { useNavigate } from "react-router-dom";
import axiosInstance from "../axios/AxiosInstance";

interface User {
  id: number | undefined;
  username: string | undefined;
}

export default function AddUser() {
  const navigate = useNavigate();
  const [userList, setUserList] = useState<User[]>([]);
  const [newUser, setNewUser] = useState<User>({
    id: undefined,
    username: undefined,
  });

  const usernameRef = useRef<HTMLInputElement>(null);
  
  const save = async () => {
    try {
      const response = await axiosInstance.post("/user", {
        username: usernameRef.current!.value,
      });
      console.log(response);
      setUserList(response.data);
      navigate("/");
    } catch (error) {
      console.error("Failed to add user:", error);
    }
  };

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setNewUser({ ...newUser, [name]: value });
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    save();

    const newUserRecord = {
      ...newUser,
      id: userList.length + 1,
    };

    setUserList([...userList, newUserRecord]);

    // Clear the form
    setNewUser({
      id: undefined,
      username: undefined,
    });
  };

  return (
    <>
      <form onSubmit={handleSubmit}>
        <div>
          <label>
            Username:
            <input
              type="text"
              name="username"
              ref={usernameRef}
              onChange={handleInputChange}
              required
            />
          </label>
        </div>
        
        <button>Add User</button>
      </form>
      <button onClick={() => navigate("/")}>Cancel</button>
    </>
  );
}
