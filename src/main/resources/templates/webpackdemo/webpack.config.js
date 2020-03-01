const path = require('path'); // 导入node.js中专门操作路径的模块
const HtmlWebpackPlugin = require('html-webpack-plugin');
const htmlPlugin = new HtmlWebpackPlugin({
    template:'./src/index.html',
    filename:'index.html'
});
module.exports = {
    //编译模式：development/production
    mode: 'production',
    entry: path.join(__dirname, './src/index.js'), // 打包文件入口路径
    output: {
        path:path.join(__dirname, './dist'),
        filename: 'bundle.js'
    }, // 打包文件出口路径
    plugins:[
        htmlPlugin
    ],
    module: {
        rules:[ // loader规则
            {test:/\.css$/,use:['style-loader','css-loader']}
        ]
    }
};