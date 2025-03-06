import React from "react";

function Filter({ status, onFilterChange }) {
  return (
    <div>
      <label>Filtrar por estado: </label>
      <select value={status} onChange={(e) => onFilterChange(e.target.value)}>
        <option value="">Todos</option>
        <option value="Alive">Vivo</option>
        <option value="Dead">Muerto</option>
        <option value="unknown">Desconocido</option>
      </select>
    </div>
  );
}

export default Filter;
