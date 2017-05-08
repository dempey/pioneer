import React from 'react';
import $ from 'jquery';
import Switch from 'react-router-dom/Switch';
import Route from 'react-router-dom/Route';
import Link from 'react-router-dom/Link';
import Schedule from './schedule';
import Account from './account';
import Contactus from './contactus';
import Faq from './faq';

export default class App extends React.Component {

    render() {

        return (

            <div>
              <div>
                <div>
                  <Link to='/schedule'>Schedule A Walk</Link>
                  <Link to='/account'>Account</Link>
                  <Link to='/contactus'>Contact Us</Link>
                  <Link to='/faq'>FAQs</Link>
                </div>
              </div>
              <main>
                <Switch>
                  <Route path='/schedule' component={Schedule}/>
                  <Route path='/account' component={Account}/>
                  <Route path='/contactus' component={Contactus}/>
                  <Route path='/faq' component={Faq}/>
                </Switch>
              </main>
            </div>

        )

    }

}