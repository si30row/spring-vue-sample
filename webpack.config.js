const path = require('path');
const VueLoaderPlugin = require('vue-loader/lib/plugin')

const srcPath = './src/main/js';
const distPath = './src/main/resources/static/build';

module.exports = {
	mode: 'production',
    entry: {
        app01: `${srcPath}/app.js`
    },
    devtool: 'sourcemaps',
    output: {
        path: __dirname,
        filename: `${distPath}/[name].bundle.js`
    },
    optimization: {
        splitChunks: {
            name: 'vendor',
            chunks: 'initial',
        }
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                loader: 'babel-loader',
                query: {
                    presets: ['@babel/preset-env']
                }
            },
            {
                test: /\.vue$/,
                use: {
                    loader: 'vue-loader'
                }
            },
        ]
    },
    resolve: {
        // 
        modules: [path.join(__dirname, 'src'), 'node_modules'],
        // importするときに省略できる拡張子の設定
        extensions: ['.js', '.vue'],
        alias: {
            'vue$': 'vue/dist/vue.esm.js'
        },
        extensions: ['.js', '.vue', '.json', '.css', '.node']
    },
    plugins: [
        new VueLoaderPlugin()
    ],
};