
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Hello from './pages/Hello'


//pages


function App() {
  

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/hello' element={<Hello />} />
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
