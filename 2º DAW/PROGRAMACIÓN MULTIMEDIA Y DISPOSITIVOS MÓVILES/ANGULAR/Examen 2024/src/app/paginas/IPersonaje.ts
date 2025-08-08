export interface IPersonaje {
  uid: string;
  name: string;
  url: string;
  img: string;
}

export interface IMedia {
  message: string;
  total_records: number;
  total_pages: number;
  results: IPersonaje[];
}
