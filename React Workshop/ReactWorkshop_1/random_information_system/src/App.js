import "./App.css";
import { ChoresList } from "./components/Chores";
import { MovieList } from "./components/MoviesList";
import { ImageComponent } from "./components/ImageComponent";
import img1 from "./assets/images/CSS_ICON.png"
import img2 from "./assets/images/flower.jfif"
import img3 from "./assets/images/headphones.jfif"

function App() {
  return (
    <div className="App">
      <h1>Welcome To Aashay's Rookie Attempt at React</h1>
      <marquee>This is the work of Aashay</marquee>
      <div className="container">
        <div id="chores">
          <ChoresList
            list={[
              "Empty Dishwasher",
              "Complete LaunchCode prep work",
              "Buy groceries",
              "Sleep Tight",
            ]}
          />
        </div>
        <div id="img">
          <ImageComponent imgSrc={[img1,img2,img3]} />
        </div>
        <div>
          <MovieList
            list={[
              "The Manchurian Candidate",
              "Oceans 8",
              "The Incredibles",
              "Hidden Figures",
            ]}
          />
        </div>
      </div>
    </div>
  );
}

export default App;
