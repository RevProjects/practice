import React, { useEffect, useState } from 'react';
import axios from 'axios';

export default function Hello(){

    const [message, setMessage] = useState<string | null>(null);
    const [loading, setLoading] = useState<boolean>(true);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        axios.get('http://localhost:8080/hello') 
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
        {loading && <div>Loading...</div>}
            {error && <div>{error}</div>}
            {message && <div>{message}</div>}
            {!loading && !error && !message && <div>No message available</div>}
        </>
    )
}