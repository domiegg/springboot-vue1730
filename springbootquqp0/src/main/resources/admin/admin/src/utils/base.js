const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootquqp0/",
            name: "springbootquqp0",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "时间管理系统"
        } 
    }
}
export default base
