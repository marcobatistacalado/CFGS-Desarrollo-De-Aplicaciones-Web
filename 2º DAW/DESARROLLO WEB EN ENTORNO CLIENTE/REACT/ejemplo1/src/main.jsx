// Punto de entrada principal de la aplicación React

import React from 'react'; // Importa React
import ReactDOM from 'react-dom/client'; // Importa ReactDOM para renderizar la aplicación en el DOM
import App from './App'; // Importa el componente principal de la aplicación
import './index.css'; // Importa los estilos globales

// Renderiza la aplicación dentro del elemento con id 'root'
ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);