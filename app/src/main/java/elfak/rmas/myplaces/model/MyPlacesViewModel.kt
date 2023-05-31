package elfak.rmas.myplaces.model

import androidx.lifecycle.ViewModel
import elfak.rmas.myplaces.data.MyPlace

class MyPlacesViewModel: ViewModel() {
    var myPlacesList: ArrayList<MyPlace> = ArrayList<MyPlace>()
    fun addPlace(place:MyPlace){
        myPlacesList.add(place)
    }
}