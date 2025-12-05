import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Pedido} from '../domain/pedido';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class PedidoService {

  private apiUrl = 'http://localhost:8080/pedidos';

  constructor(private http: HttpClient) { }

  listar(): Observable<Pedido[]> {
    return this.http.get<Pedido[]>(this.apiUrl);
  }

  cadastrar(pedido: Pedido): Observable<Pedido> {
  return this.http.post<Pedido>(this.apiUrl, pedido);
  }
}
