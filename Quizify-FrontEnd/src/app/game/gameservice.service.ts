import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Game } from '../pclasses/game';

@Injectable({
  providedIn: 'root'
})
export class GameserviceService {

  private url :string;
 private format:string;
  private game: Game;

  constructor(private http: HttpClient) { 

    this.format = '&format=json';
    
    this.url = 'http://localhost:8102/api/v1/';

   // this.tracksSubject = new BehaviorSubject(this.tracks);
  }

  getGameService() {
    return this.http.get(`${this.url}/gameservice`);
  }
  getGameServiceById(id) {
    return this.http.get(`${this.url}/gameservice/${id}`);
  }

  addGame(game: Game) {
    console.log(game);
    return this.http
    .post(this.url + 'games/game', game, { observe: 'response' })
    //.pipe(catchError(this.handleError));
  }

  updateAddedGame(game: Game) {
    return this.http
    .put(this.url + 'games/game', game, { observe: 'response' })
    //.pipe(catchError(this.handleError));
  }

  deleteGame(game: Game) {
    console.log( game);
    return this.http.delete(this.url + 'tracks/track/' + game, { observe: 'response' })
    //.pipe(catchError(this.handleError));
  }



}
