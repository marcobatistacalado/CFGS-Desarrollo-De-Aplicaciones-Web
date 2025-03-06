import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "./pages/Home"; // Importamos la página principal

function App() {
  return (
    <Router> {/* Envolvemos la app con el Router para manejar la navegación */}
      <Routes> {/* Definimos las rutas de la aplicación */}
        <Route path="/" element={<Home />} /> {/* Ruta para la página principal */}
      </Routes>
    </Router>
  );
}

export default App;
