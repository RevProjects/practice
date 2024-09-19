
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Hello from './pages/Hello'
import AddUser from './pages/AddUser'
import UserList from './pages/UserList'
import Set from './pages/Set'


//pages


function App() {
  

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/hello' element={<Hello />} />
          <Route path='/user/adduser' element={<AddUser />} />
          <Route path='/user/listusers' element={<UserList />} />
          <Route path='/' element={<Set />} />
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
