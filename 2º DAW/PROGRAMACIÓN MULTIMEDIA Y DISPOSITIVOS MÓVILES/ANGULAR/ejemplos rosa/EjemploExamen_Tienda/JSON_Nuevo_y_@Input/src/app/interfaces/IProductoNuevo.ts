export interface IProductoNuevo {
  total: number;
  pagina_actual: number;
  productos: IProducto[];
}
export interface IProducto{
  id: number;
  nombre: string;
  categoria: string;
  precio: number;
  imagen: string;
  descripcion: string;
  puntuacion: number;
}


