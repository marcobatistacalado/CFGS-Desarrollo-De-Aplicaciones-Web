export interface ISerie {
  id: number;
  titulo: string;
  director: string;
  plataforma: string | null;
  temporadas: number;
  imagen: string;
  sinopsis: string;
  anio: number;
  puntuacion: number;
  actores: string[];
}
