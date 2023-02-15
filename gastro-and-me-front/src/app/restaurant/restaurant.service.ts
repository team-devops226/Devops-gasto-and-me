import { RestaurantModel } from './restaurant.interface';
import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RestaurantService {

    url = "http://localhost:8080/restaurants";
    restaurantModel: RestaurantModel[] = [];
    constructor(private http: HttpClient) { }

  getRestaurants() {
    return this.http.get(this.url);
  }

  getMovieById(id: number) {
    return this.http.get(`${this.url}/${id}`);
  }

  deleteMovieById(id: number) {
    return this.http.delete(`${this.url}/${id}`);
  }

  createMovie(restaurant: RestaurantModel) {
    return this.http.post(`${this.url}`, restaurant);
  }

  updateMovie(id: number, restaurant: RestaurantModel) {
    return this.http.post(`${this.url}/${id}`, restaurant);
  }


}