const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmpxwex/",
            name: "ssmpxwex",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmpxwex/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "农场驿站平台小程序"
        } 
    }
}
export default base
