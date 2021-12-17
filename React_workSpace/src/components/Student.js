import React, { Component } from 'react';

class Student extends Component {
    static defaultProps = {
        year : 4
    }    
    render() {
        return (
            <div>
                {this.props.name}<br/>
                {this.props.age}<br/>
                {this.props.address}<br/>
                {this.props.year}

            </div>
        );
    }
}

export default Student;