import { Link, Routes, Route, useNavigate, useParams } from "react-router-dom";
import { useState } from "react";
import axios from "axios";


//component to register
export function ApplicationRegistration() {
    //profile needs firstname,lastname, emailId, password, phone,dob
    let[firstname, setFirstName]=useState('');
    let[lastname, setLastName]=useState('');
    let [emailId, setEmailId] = useState('');

    let [password, setPassword] = useState('');
    let [dob, setDob] = useState('');
    let [phone, setPhone] = useState('');
    let navigate = useNavigate();
    let handleSubmit = (e) => {
        e.preventDefault();
        
        //oncedata goes to backend you need to navigate to login
        let profile={"name":name ,"emailId":emailId,"password":password ,"dob":dob}
        navigate('/login');
    }
    return (<div className="container">
        <h3>REGISTRATION FORM</h3>
        <form onSubmit={handleSubmit}>
            <div className="w-25">
                <label>ENTER EMAILID</label>
                <input className="form-control mb-2 mt-3" type="email" onChange={e => setEmailId(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label>ENTER firstname</label>
                <input className="form-control mb-2 mt-3"  type="text" onChange={e => setFirstName(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label>ENTER lastname</label>
                <input className="form-control mb-2 mt-3"  type="text" onChange={e => setLastName(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label>ENTER password</label>
                <input className="form-control mb-2 mt-3" type="text" onChange={e => setPassword(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label>ENTER Birthday</label>
                <input className="form-control mb-2 mt-3" type="date" onChange={e => setDob(e.target.value)}></input>
            </div>

            <div className="w-25">
                <label>ENTER Phone</label>
                <input className="form-control mb-2 mt-3"  type="number" onChange={e => setPhone(e.target.value)}></input>
            </div>
            <div className="w-25">
                <input type="submit" value='Register'></input>
            </div>
        </form>
        <div>
            <Link to='/login'>LOGIN</Link>
        </div>
    </div>)
}

//component to login
export function ApplicationLogin() {

    let [emailId, setEmailId] = useState('');
    let [password, setPassword] = useState('');
    //to programmatically navigate
    let navigate = useNavigate();
    //authenticate the emailId and password
    let handleSubmit = (e) => {
        e.preventDefault();
        navigate('/success/' + emailId); //url:/success/:emailId
    };
    return (<div className="container">
        <h3>login form</h3>
        <form onSubmit={handleSubmit}>


            <div className="w-25">
                <input type="text" placeholder="Enter email"
                    className="form-control"
                    onChange={e => setEmailId(e.target.value)}></input>
            </div>
            <div className="w-25">
                <input type="password" placeholder="Enter password"
                    className="form-control"
                    onChange={e => setPassword(e.target.value)}></input>
            </div>


            <input type="submit" className="btn btn-secondary" value="login"></input>

            <div>
                <Link to="/register">Create Profile</Link>
            </div>
        </form>
        <div>

        </div>
    </div>)
}
