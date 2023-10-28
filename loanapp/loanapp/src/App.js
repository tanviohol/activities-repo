import logo from './logo.svg';
import './App.css';
import { ApplicationLogin, ApplicationRegistration } from './Application';

function App() {
  return (
    <div className='container-fluid'>
      <div className='alert alert-secondary'>
      <h2 className='text-center'>Loan Application</h2>
    </div>
    <div>
      <Routes>
        <Route path='' element={<ApplicationLoginLogin/>}></Route>
        <Route path='/login' element={<ApplicationLoginLogin/>}></Route>
        <Route path='/register' element={<ApplicationRegistrationRegistration/>}></Route>
         
      </Routes>
    </div>
    </div>
  );
}

export default App;
