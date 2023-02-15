import { Component } from '@angular/core';
import { RestaurantModel } from './restaurant.interface';
import { RestaurantService } from './restaurant.service';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.scss']
})
export class RestaurantComponent {

  
  constructor(private restaurantService: RestaurantService) {
  }
  restaurants: RestaurantModel[] = [];
  ratings = 5;

  ngOnInit() {
    this.getRestaurants();
  }
  getRestaurants() {
    this.restaurantService.getRestaurants().subscribe(
      (result) => {        
        this.restaurants = result as RestaurantModel  [];
        console.log(this.restaurants);
      }
    );
  }

}
