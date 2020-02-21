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
Our project follows: Activity -> ViewModel -> Repository -> Client API -> Network.
Data is retrieved through an API call, stored in LiveData in our 

## Technology and libraries

- [Android Studio](https://developer.android.com/studio)
- [Retrofit](https://square.github.io/retrofit/)
- [Gson](https://github.com/google/gson)
- [Glide](https://github.com/bumptech/glide)
- [CircleImageView](https://github.com/hdodenhof/CircleImageView)

## API Reference
- [Recipes API](https://recipesapi.herokuapp.com/api/search)



## Tests
Describe and show how to run the tests with code examples.

## Credits
Credits to CodingWithMitch for the help in learning to develop an android application using MVVM architecture and Retrofit.

## License
© [Yussef Saidi](https://yussefsaidi.me/)
