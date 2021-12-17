import React,{Component} from "react";
import '../App.css'

class NAV extends Component{
    render(){
      return(
        <nav>
          <ul>
            <li><a href="1.html">HTML</a></li>
            <li><a href="2.html">CSS</a></li>
            <li><a href="3.html">JavaScript</a></li>
          </ul>
        </nav>
      );
    }
  }
  
  export default NAV;