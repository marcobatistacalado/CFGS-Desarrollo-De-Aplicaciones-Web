export interface RootObject {
  status: string;
  autonomias: Autonomia[];
}

export interface Autonomia {
  source: Source;
  provincias: Provincia[];
}

export interface Provincia {
  name: string;
  temp: number;
}

export interface Source {
  id: null;
  name: string;
  description: string;
  select?: boolean; //que pueda sear null
}