import React, { useEffect, useState } from 'react';
import axios from 'axios';
import Card1 from '../components/Card1';



export default function Set(){

    const [message, setMessage] = useState<string | null>(null);
    const [loading, setLoading] = useState<boolean>(true);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        axios.get('http://localhost:8080/set') 
            .then(response => {
                setMessage(response.data);
                setLoading(false);
            })
            .catch(err => {
                setError('Failed to fetch data');
                setLoading(false);
            });
    }, []);

    return(
        <>
        <Card1></Card1>
        {loading && <div>Loading...</div>}
            {error && <div>{error}</div>}
            {message && <div>{message}</div>}
            {!loading && !error && !message && <div>No message available</div>}
        </>
    )
}