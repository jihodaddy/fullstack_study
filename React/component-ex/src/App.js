import './App.css';
import Content from './Content';
import Header from './Header';
import JSX from './JSX';
import Student from './Student';


function App() {
  return (
    <div>
      <Header></Header>
      <Content></Content>
      <JSX></JSX>
      <Student name="홍길동" age="20" address="서울"></Student>
    </div>
  );
}

export default App;
