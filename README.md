## Food Recipes
Android app to search for food recipes by ingredient or category.

## Screenshots
<p>
  <img src="/Screenshots/Screenshot_1582252407.png" width="270" height="400"/>
  <img src="/Screenshots/Screenshot_1582252476.png" width="270" height="400"/>
  <img src="/Screenshots/Screenshot_1582252452.png" width="270" height="400"/>
</p>

## Installation
Git clone the repository, import project in Android Studio, and run on an android device.

## Architecture Overview
This application makes use of the MVVM architectural pattern. 
Our project follows: Activity -> ViewModel -> Repository -> Remote Data Source -> Retrofit -> Webservice.
LiveData is retrieved from the Remote Data Source into our repository, then it trickles down all the way to our ViewModel. The activities do not hold data.

TO DO: Adding a local database cache using Room Persistence Library.

## External Dependencies

- [Recipes API](https://recipesapi.herokuapp.com/api/search)
</br>This is our core API, used to retrieve all the information about recipes.
- [Retrofit](https://square.github.io/retrofit/)
</br>Used to setup a REST API.
- [Gson](https://github.com/google/gson)
</br>A Java serialization/deserialization library to convert Java Objects into JSON and back </p>
- [Glide](https://github.com/bumptech/glide)
</br>Library to display our recipe/food images.
- [CircleImageView](https://github.com/hdodenhof/CircleImageView)
</br>Library used to make circular image views.

## API Reference




## Tests
Describe and show how to run the tests with code examples.

## Credits
Credits to CodingWithMitch for the help in learning to develop an android application using MVVM architecture and Retrofit.

## License
© [Yussef Saidi](https://yussefsaidi.me/)
