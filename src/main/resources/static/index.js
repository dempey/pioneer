import React from 'react';
import { render } from 'react-dom';
import App from 'components/app';
import BrowserRouter from 'react-router-dom/BrowserRouter';
import Header from 'components/common/header';
import Footer from 'components/common/footer';

render(
       <div>
           <Header />
           <BrowserRouter>
               <App />
           </BrowserRouter>
           <Footer />
       </div>,
       document.getElementById('app')
      );