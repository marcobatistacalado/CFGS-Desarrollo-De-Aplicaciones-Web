// Componente principal de la aplicación

import React from 'react';
//Importar componentes:
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import Content from './components/Content'; 
import Footer from './components/Footer';
import './index.css'; // Importa los estilos globales

// Definimos el componente App
const App = () => {
  return (
    <div className="app-container">
      <Header /> {/* Inyectar los componentes */}
      <div className="main-layout">
        <Sidebar /> 
        <Content />
      </div>
      <Footer />
    </div>
  );
};

export default App;

