import './mystyle.css';
import { NavLink } from "react-router-dom"
const Header = () => {
  return (
    <>
    
        <ul>
            <li><NavLink to='/' >Home</NavLink></li>
            <li><NavLink to='/contact'>Contact</NavLink></li>
            <li><NavLink to='/About'>About</NavLink></li>
        </ul>
   
    </>
  )
}

export default Header