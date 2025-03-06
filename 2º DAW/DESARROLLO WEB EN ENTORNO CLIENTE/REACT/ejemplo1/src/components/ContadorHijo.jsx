import React from 'react';

const ContadorHijo = ({ contador }) => {
  return (
    <div>
      <h3>Contador desde el componente hijo:</h3>
      <p>El contador es: {contador}</p>
    </div>
  );
};

export default ContadorHijo;
