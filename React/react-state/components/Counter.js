import React, { Component } from 'react';

class Counter extends Component {
    state = {
        number:0
    }
    inCreaseCounter = () => {
        //state 값 1증가
        //state 값을 변경할 때는 setState() 사용: this 붙임
        this.setState({
            number: this.state.number + 1
        });
    }
    decreaseCounter = () => {
        //state 값 1 감소
        //state 값을 변경할 때는 setState() 사용: this 붙임
        this.setState({
            number: this.state.number - 1
        });
    }

    //여기에 이벤트 핸들러 삽입

    render() {
        return (
            <div>
                <h2>카운터</h2>
                <div>값: {this.state.number}</div>
                <button onClick={this.inCreaseCounter}>+</button> &nbsp;
                <button onClick={this.decreaseCounter}>-</button> &nbsp;

                {/* 버튼에 직접 함수 포함 기능 */}
                <button
                    onClick = { () => {
                        this.setState({number: this.state.number + 10 });
                    }}>
                    + 10
                </button>  &nbsp;
                {/* 10감소 */}
                <button
                    onClick = { () => {
                        this.setState({number: this.state.number - 10 });
                    }}>
                    - 10
                </button>
            </div>
        );
    }
}

export default Counter;