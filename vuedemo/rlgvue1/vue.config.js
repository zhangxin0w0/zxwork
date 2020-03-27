module.exports = {
  lintOnSave: false,

  devServer: {
    proxy: {
      '/rlg/portal': {
        target: 'http://localhost:8089',
        ws: true,
        changeOrigin: true
      }
    }
  },

};
