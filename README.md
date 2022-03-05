# Flix
Flix is an app that allows users to browse movies from the [The Movie Database API](https://themoviedb.docs.apiary.io/#).

📝 `NOTE - PASTE PART 2 SNIPPET HERE:` Paste the README template for part 2 of this assignment here at the top. This will show a history of your development process, which users stories you completed and how your app looked and functioned at each step.

----------------------------

## Flix Part 1

User Stories
A user story is a way to capture requirements for an app from an end-user perspective. It is a common practice in app development and helps to simplify the way requirements are specified.

Required Stories
The following **required** functionality is completed:
* [x] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS 
- [ ] (2pts) Views should be responsive for both landscape/portrait mode.
   - [ ] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [ ] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

- [ ] (2pts) Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
- [ ] (2pts) Improved the user interface by experimenting with styling and coloring.
- [ ] (2pts) For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.
## Flix Part 1
Required Stories
Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity. (8 points)
💡Concept guide
 Assignment Intro - Activities & Intents
 Details Screen Implementation
Allow video posts to be played in full-screen using the YouTubePlayerView (2 points)
 YoutubePlayerView
💡Concept guide
See the videos API for video information. Here's a sample request.
If your Android device or emulator is running on API 30+, you will likely see an error with the Youtube initialization. Check out Hint #7 on the hints tab for how to resolve this issue.

### App Walkthough GIF
`TODO://` Add the URL to your animated app walkthough `gif` in the image tag below, ``TODO://` Add the URL to your animated app walkthough `gif` in the image tag below, `https://github.com/aalnobel/Flixter/blob/master/FlixWalkTrough.gif`. Make sure the gif actually renders and animates when viewing this README. 
`. Make sure the gif actually renders and animates when viewing this README.

<img src="https://github.com/aalnobel/Flixter/blob/master/FlixWalkTroughPart2.gif" width=250><br>

### Notes
Describe any challenges encountered while building the app.

### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
