import React from 'react';
import $ from 'jquery';

export default class App extends React.Component {

    render() {

        return (

            <div>
                <h3>Welcome to the People Walker application</h3>
                <p>This is the first page of the people walker application.</p>
                <ul>
                    <li>Schedule a people walker.</li>
                    <li>Pick your route.</li>
                    <li>Give a review of your experience.</li>
                </ul>
            </div>

        )

    }

}