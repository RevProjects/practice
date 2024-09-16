
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Hello from './pages/Hello'
import User from './pages/User'


//pages


function App() {
  

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/hello' element={<Hello />} />
          <Route path='/user' element={<User />} />
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
