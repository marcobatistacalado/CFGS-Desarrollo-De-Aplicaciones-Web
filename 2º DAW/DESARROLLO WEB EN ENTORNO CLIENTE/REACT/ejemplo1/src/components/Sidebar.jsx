// Componente de barra lateral para navegación con enlaces a cada sección

import React from 'react';

const Sidebar = () => {
  return (
    <aside className="sidebar">
      <nav>
        <ul>
          <li><a href="#introduccion">Introducción</a></li>
          <li><a href="#jsx">JSX</a></li>
          <li><a href="#componentes">Componentes</a></li>
          <li><a href="#props">Props</a></li>
          <li><a href="#estado">Estado</a></li>
          <li><a href="#eventos">Eventos</a></li>
          <li><a href="#listas">Listas y Renderizado</a></li>
          <li><a href="#condicional">Renderizado Condicional</a></li>
          <li><a href="#estilos">Añadir Estilos</a></li>
          <li><a href="#hooks">Hooks</a></li>
          <li><a href="#compartir">Compartir Datos</a></li>
        </ul>
      </nav>
    </aside>
  );
};

export default Sidebar;
