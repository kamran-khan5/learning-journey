import { Outlet, Link } from "react-router-dom";

const Layout = () => {
  return (
    <>
      <div className="w-100 bg-danger">
        <Link to="/" className="ms-5 me-5 text-decoration-none text-white">Home</Link>
        <Link to="/mylist" className="ms-5 me-5 text-decoration-none text-white">Mylist</Link>
        <Link to="/todolist" className="ms-5 me-5 text-decoration-none text-white">TodoList</Link>
        <Link to="/accordian" className="ms-5 me-5 text-decoration-none text-white">Accordian</Link>
        <Link to="/registration" className="ms-5 me-5 text-decoration-none text-white">Registration</Link>
        <Link to='/test' className="ms-5 me-5 t text-decoration-none text-white bg-danger">Test</Link> 
      </div>

      <Outlet />
    </>
  )
};

export default Layout;