import React, { Component } from 'react';
import './App.css';
import Counter from './components/Counter';
import Image from './components/image';
import Message from './components/Message';
import Event from './components/Event';
import Login from './components/Login';

class App extends Component {
  render() {
    return (
      <div className='App'>
        <h1>state 연습</h1>
        <Counter></Counter>      
         <Image></Image>
         <Message></Message>
         <Event></Event>
         <Login></Login>
      </div>
    );
  }
}

export default App;