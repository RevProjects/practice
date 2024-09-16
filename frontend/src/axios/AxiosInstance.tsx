import axios from 'axios';

// Create an Axios instance
const axiosInstance = axios.create({
    //Can change this later with environmental variables to dynamically be production or development server
    baseURL: 'http://localhost:8080/',
});

export default axiosInstance;