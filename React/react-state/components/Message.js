import React, {useState} from 'react';
//{ Component } 클래스 없음
//{useState} 포함
// 단축키 rsc 탭으로 기본 생성

const Message = () => {
    //메세지 출력 state
    const [ message, setMessge] = useState('');
    
    //이벤트 핸들러 추가
    const onClickEnter = () => setMessge('안녕하세요!');
    const onClickLeave = () => setMessge('안녕히 가세요!');
    const onClickClear = () => setMessge('');

    //색상 변경 state
    const [color, setColor] = useState('black');

    const onClickGreen  = () => setColor('green')
    const onClickRed = () => setColor('red')
    const onClickBlue = () => setColor('blue')


    return (
        <div>
            <p/>
            <button onClick ={onClickEnter}>입장</button> &nbsp;
            <button onClick ={onClickLeave}>퇴장</button> &nbsp;
            <button onClick ={onClickClear}>지우기</button> &nbsp;
            <h3 style={{color}}>{message}</h3>
            {/* 출력되는 messagem 색상 변경버튼 추가: green, red, blie */}
            <button onClick ={onClickGreen}>Green</button> &nbsp;
            <button onClick ={onClickRed}>Red</button> &nbsp;
            <button onClick ={onClickBlue}>Blue</button> &nbsp;

            {/* <button style={{color:'green'}} onClick ={() => setColor('green')}>Green</button> &nbsp;   
            <button style={{color:'red'}} onClick ={() => setColor('red')}>Red</button> &nbsp;   
            <button style={{color:'blue'}} onClick ={() => setColor('blue')}>Blue</button> &nbsp;    */}
            
            <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
        </div>
    );
};


export default Message;