import React, { Component } from 'react';

class Event extends Component {
    state = {
        message: '',
        id: '',
        pass:''
    }

    onChange = e => {
        this.setState({
            message: e.target.value
        });
    }

    //(1)id값 변경하는 이벤트 핸들러
    onIdChange = e => {
        this.setState({
            id: e.target.value
        });
    }

    //(2)pass값 변경하는 이벤트 핸들러
    onPassChange = e => {
        this.setState({
            pass: e.target.value
        });
    }
    //(3)[완료] 버튼 클릭했을 때 이벤트 핸들러
    //id와 pass 값을 alert()로 출력
    onShow = e => {
        alert("id:" +this.state.id + ",pass: " + this.state.pass)

        };
    

    render() {
        return (
            <div>
                <hr/>
           <h3>이벤트 연습</h3> 
           <input type='text' name="message"
                onChange={this.onChange} />
                <h3>{this.state.message}</h3>

                {/* id와 pass 입력받기 위한 input 태그2개 추가 */}
                <input type='text' name='id' size='10'
                        value={this.state.id}
                        onChange={this.onIdChange} /> &nbsp;
                <input type='password' name='pass' size='10'
                value={this.state.pass}
                onChange={this.onPassChange} /> &nbsp;

                <button onClick={this.onShow}>완료</button>
            </div>
        );
    }
}

export default Event;