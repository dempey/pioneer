var webpack = require('webpack');
var path = require('path');
var versionOutputExtension = require('./package.json').version;

module.exports = {
    devtool: 'inline-source-map',
    entry: [
        'webpack/hot/only-dev-server',
        './src/main/resources/static'
    ],
    output: {
        path: path.join(__dirname, 'src/main/resources/static/libraries/'),
        filename: 'react-bundle.js'
    },
    resolve: {
        modules: ['node_modules', 'src/main/resources/static'],
        extensions: ['.js']
    },
    module: {
        loaders: [
            {
                test: /\.json$/, loader: 'json-loader'
            },
            {
                test: /\.jsx?$/,
                exclude: /node_modules/,
                loaders: [ 'babel-loader?presets[]=react,presets[]=es2015']
            }
        ]
    },
    plugins: [
        new webpack.HotModuleReplacementPlugin(),
        //new CopyWebpackPlugin([
            // for usage notes, refer to https://gist.github.com/DarrenN/8c6a5b969481725a4413
            // copy index.html to {output}/index.html
        //    {from: 'index.html'},
            // copy contents of src/ to {output}/src/
        //    {from: 'src', to: 'src'}
        //])
    ]

}