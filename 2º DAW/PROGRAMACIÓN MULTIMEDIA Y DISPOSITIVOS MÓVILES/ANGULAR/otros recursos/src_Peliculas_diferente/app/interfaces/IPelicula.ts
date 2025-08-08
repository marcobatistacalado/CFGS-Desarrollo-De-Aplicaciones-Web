export interface IPelicula {
  id: number;
  titulo: string;
  director: string;
  plataforma: null | string;
  anio: number;
  imagen: string;
  sinopsis: string;
  puntuacion: number;
  temporadas: number;
  actores: string[];
}