export interface Pedido {
  id?: number;
  numeroNf: string;
  numeroPedido: string;
  status: string;
  dataEntrada: string;
  dataColeta?: string;
}
