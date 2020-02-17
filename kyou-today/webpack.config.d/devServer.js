// SPA用にすべてのリクエストをindex.htmlへリダイレクト
// noinspection JSUnresolvedVariable
config.devServer.historyApiFallback = true;
// SourceMapの設定
// noinspection JSUnresolvedVariable
config.devtool = "inline-source-map";