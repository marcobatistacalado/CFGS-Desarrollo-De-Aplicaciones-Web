export interface IRootNasa {
  copyright: string;
  version: number;
  property: string;
  objects: IObjeto[];
}

export interface IObjeto {
  categoria: string;
  titulo: string;
  nasaId: string;
  descripcion: string;
  Fecha: string;
  Centro: string;
  imagen: string;
}