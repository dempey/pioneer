import React from 'react';

export default class Header extends React.Component {

    render() {
        var subHeaderStyle = {
            textIndent: "1em"
        };

        return (

            <header className="people-walker-header">
                <h1 className="people-walker-slogan">People Walker</h1>
                <h3 style={subHeaderStyle}>You&apos;ll never walk alone</h3>
            </header>

        )

    }

}