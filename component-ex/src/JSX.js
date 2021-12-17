import React, { Component } from 'react';

class JSX extends Component {
    render() {
        const footer = {
            company : 'apple',
            tel : 123-1234,
            address : '강원도 속초'
        };

        function getFooter(){
            return footer.company+ ","+
                    footer.tel+ ","+
                    footer.address;
        }

        return (
            <div>
                <dix>{getFooter()}<br/></dix>
            </div>
        );
    }
}

export default JSX;