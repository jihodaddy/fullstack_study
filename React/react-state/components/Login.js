import React, { Component } from 'react';

class Login extends Component {

    state = {
        id:'',
        pass: ''
    }

    dbUser={
        id: 'abcd',
        pw: '1234'
    }
    onIdInput = e => {
        this.setState({
            id: e.target.value
        });
    }

    onPassInput = e => {
        this.setState({
            pass: e.target.value
        });
    }
    onLogin = e => {
        if(this.state.id == this.dbUser.id && this.state.pass == this.dbUser.pw){
            alert('로그인성공')
        }else alert('로그인실패')
    }
    
    render() {
        return (
            <div>
                아이디: <input type='text' name='id' size='10'
                        value={this.state.id}
                        onChange={this.onIdInput} /><br/>
                비밀번호: <input type='password' name='pass' size='10'
                        value={this.state.pass}
                        onChange={this.onPassInput} /> &nbsp;

                <button onClick={this.onLogin}>로그인</button>
            </div>
        );
    }
}

export default Login;  