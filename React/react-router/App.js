import {Link, Routes, Route} from 'react-router-dom'
import Home from './components/Home';
import About from './components/About';
import Content from './components/Content';
import Book from './components/Book';

function App() {
  return (
    <div className="App">
      <h1></h1>
      <ul>
        <li>
          <Link to="/">홈 화면</Link>
        </li>
        <li>
          <Link to="/about">About 화면</Link>
        </li>
        <li>
          <Link to="/content">도서 정보 출력</Link>
        </li>
        <li>
          <Link to="/book/java">JavaScript</Link>
        </li>
        <li>
          <Link to="/book/html">HTML/CSS</Link>
        </li>
        <li>
          <Link to="/book/react">React따라하기</Link>
        </li>
        <li>
          <Link to="/book/algorithm">알고리즘</Link>
        </li>
      </ul>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="/content" element={<Content />} />
        <Route path="/book/:keyword" element={<Book />} />
      </Routes>
    </div>
  );
}

export default App;
