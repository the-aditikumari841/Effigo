import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className='w-full h-screen flex flex-wrap justify-center items-center bg-cover bg-no-repeat' 
    style={{backgroundImage: `url(https://img.freepik.com/free-psd/realistic-money-element_23-2150396392.jpg?size=626&ext=jpg&ga=GA1.1.1395880969.1709078400&semt=ais)`}} > 
      <h1 className='bg-red-300'>Test</h1>
    </div>
  )
}

export default App

