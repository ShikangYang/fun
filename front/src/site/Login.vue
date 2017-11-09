<template>
    <div id="login">
        <div id="login_img"><img src="" /></div>
        <div id="login_main">
            <div id="login_main_top">
                <h1>危品辨别系统</h1>
                <a>用户名密码都是123 </a>
            </div><!-- main头部结尾-->
            <div id="login_main_center">
                <el-form :model="loginForm" :rules="rules2"  ref="loginForm" label-width="60px" class="demo-ruleForm">
                    <el-form-item label="用户名" prop="username" >
                        <el-input type="text" v-model="loginForm.username" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="密码" prop="password">
                        <el-input type="password"  v-model="loginForm.password" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item>
                        <div id="login_button_user"><el-button type="primary" @click="doLogin" :loading="loading">登录</el-button></div>
                        <span id="login_button_admin"><el-button type="success" @click="adminLogin">管理员登录</el-button></span>
                        <span id="reset_button"><el-button type="text" @click="register">注册</el-button></span>
                    </el-form-item>
                </el-form>
            </div><!-- main中部结尾-->
        </div><!-- main结尾-->
    </div><!-- login结尾-->
</template>
<script>
    export default {
        data() {

            var validateUsername = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请输入用户名'));
                }
                callback();
            };
            var validatePassword = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请输入密码'));
                }
                callback();
            };
            return {
                loginForm: {
                    username: '',
                    password: ''
                },
                // 表单验证规则
                rules2: {
                    username: [
                        { validator: validateUsername, trigger: 'blur' }
                    ],
                    password: [
                        { validator: validatePassword, trigger: 'blur' }
                    ]
                },
                loading:false,
            };
        },
        methods: {
            //错误封装方法
            errormsg(msgerror) {
                this.$message.error(msgerror);
            },
            //把获取参数加入全局store中
            change(id,username,password,dept_code,dept_name,address,phone,principal, email,business_scope,islogin){
                this.$store.state.user_id=id;
                this.$store.state.username=username;
                this.$store.state.password=password;
                this.$store.state.dept_code=dept_code;
                this.$store.state.dept_name=dept_name;
                this.$store.state.address=address;
                this.$store.state.phone=phone;
                this.$store.state.principal=principal;
                this.$store.state.email=email;
                this.$store.state.business_scope=business_scope;
                this.$store.state.islogin=islogin;
            },
            //登录加载过渡效果的方法
            load(){
                this.loading = true;
                setTimeout(() => {this.loading = false; }, 1000);
                this.$Loading.start();
                setTimeout(() => {this.$Loading.finish();}, 1000);
            },
            doLogin(){
                var _this = this;
                this.$http.get('/api/user/login'
                    ,{
                        params:{
                            username:_this.loginForm.username,
                            password:_this.loginForm.password
                        },
                    }
                )
                    .then(function (response) {
                        var errorcode=response.data.errorcode;
                        if(errorcode=="200"){
                            //  console.debug(response.data.data);
                            //进去主界面的过渡效果方法
                            _this.load();
                            //把获取到的参数存入store
                            _this.change(response.data.data.id,_this.loginForm.username,_this.loginForm.password,response.data.data.deptCode,
                                response.data.data.deptName,response.data.data.address,response.data.data.phone,response.data.data.principal
                                ,response.data.data.email,response.data.data.businessScope,true);
                            setTimeout(() => {_this.$router.push({ path: '/Main' });}, 1500);

                        }else if(errorcode=="500"){

                            //如果返回500，就在页面上方弹出错误信息
                            _this.errormsg(response.data.errormsg);
                        }
                    })
                    .catch(function (error) {
                        console.log(error);
                    });
            },
            // 测试post登录,成功，传的参数必须是字符串类型
            // doLogin(){
            //   var _this = this;
            //   var data='username='+_this.loginForm.username+'&password='+_this.loginForm.password;
            //         this.$http.post('/api/user/login2',data)
            //         .then(function (response) {
            //           var errorcode=response.data.errorcode;
            //              if(errorcode=="200"){
            //                console.debug(response);
            //                   _this.load();
            //                   _this.change(_this.loginForm.username,_this.loginForm.password);
            //                   setTimeout(() => {_this.$router.push({ path: '/Main' });}, 3000);
            //             }else if(errorcode=="500"){
            //                 // console.debug(response);
            //                 //如果返回500，就在页面上方弹出错误信息
            //                 _this.errormsg(response.data.errormsg);
            //             }
            //           })
            //         .catch(function (error) {
            //             console.log(error);
            //         });
            // },
            adminLogin(){
                this.$router.push({ path: '/LoginAdmin' });
            },
            register(){
                this.$router.push({ path: '/Register' });
            }
        }
    }
</script>

<style>
    /*登录form*/
    #login{
        width: 100%;
        margin: 0 auto;
        /*position:relative;*/
        /*background-color:black;*/
    }
    /*登录背景*/
    #login_img{
        height: 720px;
        position:absolute
    }

    /*输入框*/
    #login_main{
        width: 400px;
        margin:250px 50px 200px 450px;
        border:1px solid #C0CCDA;
        opacity:0.8;
        border-radius:10px;
        box-shadow:inset 0 0 1px 1px #C0CCDA;
        position:absolute;
        background-color:#F9FAFC;
    }
    #login_main_top{
        height: 60px;
        /*background-color:green;*/
        text-align: center;
    }
    #login_main_center{
        margin: 0px 30% 0px 0px;
        /*background-color:green;*/
    }

    /*登录按钮*/
    #login_button_user{
        margin-right:5px;
    }
    /*管理员登录按钮*/
    #login_button_admin{
        margin-left:60px;
        margin-right:15px;
    }
    /*注册按钮*/
    /*#reset_button{


    }*/


</style>