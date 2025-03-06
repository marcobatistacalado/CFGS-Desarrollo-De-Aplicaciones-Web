import React from "react";

function CharacterCard({ character }) {
  return (
    <div className="card">
      <img src={character.image} alt={character.name} /> 
      <h3>{character.name}</h3> 
      <p>Status: {character.status}</p> 
      <p>Species: {character.species}</p>
    </div>
  );
}

export default CharacterCard;
