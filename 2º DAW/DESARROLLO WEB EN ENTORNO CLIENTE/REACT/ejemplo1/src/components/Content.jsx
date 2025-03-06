import React, { useState } from 'react';
import ContadorHijo from './ContadorHijo'; // Importamos el componente hijo

const alumno = {
  name: 'Jerome',
};

const elementos = ['Elemento 1', 'Elemento 2', 'Elemento 3'];

const Content = () => {
  // Estado para el ejemplo de actualización de estado
  const [contador, setContador] = useState(0);
  const [mostrarTexto, setMostrarTexto] = useState(true); // Para el renderizado condicional

  return (
    <main className="content">
      <section id="introduccion">
        <h2>Introducción a React</h2>
        <p>React es una biblioteca de JavaScript para construir interfaces de usuario.</p>
      </section>
      <section id="jsx">
        <h2>JSX</h2>
        <p>JSX es una extensión de sintaxis que permite escribir código similar a HTML en React.</p>
      </section>
      <section id="componentes">
        <h2>Componentes</h2>
        <p>Los componentes en React son bloques de construcción reutilizables.</p>
      </section>
      <section id="props">
        <h2>Props</h2>
        <p>Las props permiten pasar datos de un componente a otro.</p>
        <p>Bienvenido! {alumno.name}</p>
      </section>
      <section id="estado">
        <h2>Estado</h2>
        <p>El estado permite gestionar datos dentro de un componente.</p>
        <p>Contador: {contador}</p>
        <button onClick={() => setContador(contador + 1)}>Incrementar</button>
      </section>
      <section id="eventos">
        <h2>Eventos en React</h2>
        <button onClick={() => alert('¡Evento clic ejecutado!')}>Haz clic aquí</button>
      </section>
      <section id="listas">
        <h2>Listas y Renderizado</h2>
        <ul>
          {elementos.map((item, index) => (
            <li key={index}>{item}</li>
          ))}
        </ul>
      </section>
      <section id="condicional">
        <h2>Renderizado Condicional</h2>
        {mostrarTexto ? <p>Este texto se muestra</p> : <p>El texto ha sido ocultado</p>}
        <button onClick={() => setMostrarTexto(!mostrarTexto)}>Alternar Texto</button>
      </section>
      <section id="estilos">
        <h2>Añadir Estilos</h2> 
        <p style={{ color: 'blue', fontSize: '18px' }}>Este texto tiene estilos en línea. También se puede inyectar desde el css global.</p>
      </section>
      <section id="hooks">
        <h2>Uso de Hooks</h2>
        <p>Los Hooks son funciones especiales en React que te permiten usar el estado y otras características de React sin escribir una clase. Los Hooks siempre comienzan con la palabra use, como useState, useEffect, etc.</p>
      </section>
      <section id="compartir">
        <h2>Compartir Datos entre Componentes</h2>
        <p>Para compartir datos se pueden usar props, contextos o estados globales.</p>
        {/* Ahora pasamos el contador como prop */}
        <ContadorHijo contador={contador} />
      </section>
    </main>
  );
};

export default Content;
