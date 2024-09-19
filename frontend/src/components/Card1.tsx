import React from 'react';
import CardComponent from './cardComponent';
import imagePath from '../assets/card1.png'; // Ensure this path is correct

//export default function Card1 component
export default function Card1() {
  const card = {
    cardId: 1,
    name: 'Card1',
    number: 1,
    color: 1,
    shape: 1,
    fill: 1,
    imageUrl: imagePath
  };

  return (
    <>
      <CardComponent {...card} />
    </>
  );
}

