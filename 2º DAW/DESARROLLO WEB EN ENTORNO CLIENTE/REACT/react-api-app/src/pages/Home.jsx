import React, { useState, useEffect } from "react";
import CharacterCard from "../components/CharacterCard"; // Componente para mostrar cada personaje
import Filter from "../components/Filter"; // Componente para los filtros

function Home() {
  // Estado para almacenar los personajes obtenidos de la API
  const [characters, setCharacters] = useState([]);
  // Estado para los personajes filtrados según el criterio seleccionado
  const [filteredCharacters, setFilteredCharacters] = useState([]);
  // Estado para el filtro de estado de los personajes
  const [status, setStatus] = useState("");

  // Hook useEffect para obtener los datos de la API cuando se carga el componente
  useEffect(() => {
    fetch("https://rickandmortyapi.com/api/character")
      .then(response => response.json()) // Convertimos la respuesta en JSON
      .then(data => {
        setCharacters(data.results); // Guardamos todos los personajes
        setFilteredCharacters(data.results); // Inicialmente, mostramos todos los personajes
      })
      .catch(error => console.error("Error fetching data:", error)); // Manejo de errores
  }, []);

  // Función para manejar el cambio en el filtro
  const handleFilterChange = (selectedStatus) => {
    setStatus(selectedStatus);
    if (selectedStatus === "") {
      setFilteredCharacters(characters); // Si no hay filtro, mostramos todos
    } else {
      const filtered = characters.filter(char => char.status === selectedStatus);
      setFilteredCharacters(filtered); // Mostramos solo los que cumplen el filtro
    }
  };

  return (
    <div>
      <h1>Rick and Morty Characters</h1>
      <Filter status={status} onFilterChange={handleFilterChange} /> {/* Componente de filtro */}
      <div className="grid">
        {filteredCharacters.map(char => (
          <CharacterCard key={char.id} character={char} /> // Renderizamos cada tarjeta de personaje
        ))}
      </div>
    </div>
  );
}

export default Home;
