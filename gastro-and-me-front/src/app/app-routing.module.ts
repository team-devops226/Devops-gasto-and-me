import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RestaurantComponent } from './restaurant/restaurant.component';

const routes: Routes = [
  { path: '',   redirectTo: '/restaurant', pathMatch: 'full' },
  { path: "restaurant", component: RestaurantComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
