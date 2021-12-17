import React,{Component} from "react";
// import './App.css'
import Subject from './components/Subject';
import Content from './components/Content';
import NAV from './components/NAV';
import JSX from "./components/JSX";
import Image from "./components/Image";
import Student from "./components/Student";



class App extends Component{
  render(){
    return(
      <div className="App">
        {/* <h3>안녕하세요</h3> */}
        {/* JSX 영역 : 주석 표시 */}
        {/* 위에 추가한 컴포넌트 사용: 태그 형식으로 사용 */}
        {/* <Subject></Subject> 
        <Subject></Subject> 
        <NAV></NAV>
        <Content></Content> */}
        <JSX></JSX>
        <Image></Image>
        <Subject title="제목" sub="부제목"></Subject><br/>
        <Student name="홍길동" age="20" address="서울"></Student>
      </div>
    );
  }
}


export default App;