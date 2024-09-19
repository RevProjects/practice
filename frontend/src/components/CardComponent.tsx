import React from 'react';


// Define the interface for the props
interface CardProps {
  cardId: number | undefined;
  name: string | undefined;
  number: number | undefined;
  color: number | undefined;
  shape: number | undefined;
  fill: number | undefined;
  imageUrl: string | undefined;
}

// Use a lowercase function name `card1`
export default function CardComponent({ cardId, name, number, color, shape, fill, imageUrl }: CardProps) {
  return (
    <>
    <div className="card" key={cardId}>
      <img src={imageUrl} alt={`${name}`} className="card-image" />
      <div className="card-details">
        <h2>{name}</h2>
        <p>Number: {number}</p>
        <p>Color: {color}</p>
        <p>Shape: {shape}</p>
        <p>Fill: {fill}</p>
      </div>
    </div>
    </>
  );
}
