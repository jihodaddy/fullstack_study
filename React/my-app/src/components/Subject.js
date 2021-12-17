import React,{Component} from "react";

// 컴포넌트 생성
// 컴포넌트 : 사용자 정의 태그
class Subject extends Component{
    //방법1: 디폴트 props설정
    static defaultProps = {
      date: '2021-12-17'
    }
    render(){
      return(
        <header>
          <h1>{this.props.title}</h1>
          {this.props.sub}<br/>
          {this.props.date}<br/>
          {this.props.year}<br/>
        </header>
      );
    }
  }
  //방법2: 디폴트 props 설정
  Subject.defaultProps = {
    year: 2021
  }

  export default Subject;