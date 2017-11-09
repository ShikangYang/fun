<template>
    <div id="register">
        <div id="register_img"><img src="" /></div>
        <div id="register_main">
            <div id="register_main_top">
                <h1>危品辨别系统注册</h1>
            </div><!-- main头部结尾-->
            <div id="register_main_center">
                <el-form :inline="true" :model="ruleForm2" :rules="rules2"  ref="ruleForm2" label-width="70px" class="demo-ruleForm">
                    <el-form-item label="用户名" prop="username" >
                        <el-input type="text" v-model="ruleForm2.username" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="密码" prop="password">
                        <el-input type="password"  v-model="ruleForm2.password" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="单位编号" prop="dept_code" >
                        <el-input type="text" v-model="ruleForm2.dept_code" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="单位名称" prop="dept_name" >
                        <el-input type="text" v-model="ruleForm2.dept_name" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="地址" prop="address" >
                        <el-input type="text" v-model="ruleForm2.address" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="电话" prop="phone" >
                        <el-input type="text" v-model="ruleForm2.phone" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="负责人" prop="principal" >
                        <el-input type="text" v-model="ruleForm2.principal" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="邮箱" prop="email" >
                        <el-input type="text" v-model="ruleForm2.email" auto-complete="off"></el-input>
                    </el-form-item>
                    <el-form-item label="业务范围" prop="business_scope" >
                        <el-select v-model="ruleForm2.business_scope" placeholder="请选择">
                            <el-option label="危险品生产加工" value="危险品生产加工"></el-option>
                            <el-option label="运输" value="运输"></el-option>
                            <el-option label="仓储" value="仓储"></el-option>
                            <el-option label="使用" value="使用"></el-option>
                            <el-option label="其他" value="其他"></el-option>
                        </el-select>
                    </el-form-item >
                    <el-form-item >
                        <span id="register_button_user"><el-button type="primary" @click="doregister">注册</el-button></span>
                        <!--<span id="register_button_admin"><el-button type="success" @click="relogin">返回登录</el-button></span>-->
                        <span id="relogin_button_admin"><el-button type="text" @click="relogin">返回登录</el-button></span>
                    </el-form-item>
                </el-form>

            </div><!-- main中部结尾-->
        </div><!-- main结尾-->
    </div><!-- register结尾-->
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
                ruleForm2: {
                    username: '',
                    password: '',
                    dept_code:'',
                    dept_name:'',
                    address:'',
                    phone:'',
                    principal:'',
                    email:'',
                    business_scope:''

                },
                // 表单验证规则
                rules2: {
                    username: [
                        { validator: validateUsername, trigger: 'blur' }
                    ],
                    password: [
                        { validator: validatePassword, trigger: 'blur' }
                    ]
                }
            };
        },
        methods: {
            errormsg(msgerror) {
                this.$message.error(msgerror);
            },
            doregister(){
                var _this = this;
                // var url='/api/user/regiter'
                // var header={'content-type':'application/x-www-form-urlencoded'}
                // var parameter='username='+this.ruleForm2.username+'&password='+this.ruleForm2.password+
                // '&deptCode='+this.ruleForm2.dept_code+'&deptName='+this.ruleForm2.dept_name+
                // '&address='+this.ruleForm2.address+'&phone='+this.ruleForm2.phone+
                // '&principal='+this.ruleForm2.principal+'&email='+this.ruleForm2.email+
                // '&businessScope='+this.ruleForm2.business_scope;
                this.$http.get('/api/user/regiter'
                    ,{
                        params:{
                            username:_this.ruleForm2.username,
                            password:_this.ruleForm2.password,
                            deptCode:_this.ruleForm2.dept_code,
                            deptName:_this.ruleForm2.dept_name,
                            address:_this.ruleForm2.address,
                            phone:_this.ruleForm2.phone,
                            principal:_this.ruleForm2.principal,
                            email:_this.ruleForm2.email,
                            businessScope:_this.ruleForm2.business_scope
                        },
                    },
                )
                // this.$http.post(url,parameter,{headers:header})
                    .then(function (response) {
                        var errorcode=response.data.errorcode;
                        if(errorcode=="200"){
                            _this.$message({
                                message: '恭喜你，注册成功',
                                type: 'success',
                                duration:8000
                            });
                            _this.$router.back();
                        }else if(errorcode=="500"){
                            console.debug(response);

                            _this.errormsg(response.data.errormsg);
                        }
                    })
                    .catch(function (error) {
                        console.log(error);
                    });
            },
            relogin(){
                this.$confirm('确定返回登录界面吗？','提示',{

                }).then(() =>{
                    this.$router.back();
                }).catch(() =>{
                });
            },
        }
    }
</script>

<style>
    #error1{
        color: red;
    }

    /*登录form*/
    #register{
        width: 100%;
        margin: 0 auto;
        /*position:relative;*/
        /*background-color:black;*/
    }
    /*登录背景*/
    #register_img{
        height: 720px;
        position:absolute
    }

    /*输入框*/
    #register_main{
        width: 800px;
        margin:50px 50px 10px 250px;
        border:1px solid #C0CCDA;
        opacity:0.8;
        border-radius:10px;
        box-shadow:inset 0 0 1px 1px #C0CCDA;
        position:absolute;
        background-color:#F9FAFC;
    }
    #register_main_top{
        /*background-color:green;*/
        font-family: 'Open Sans',sans-serif;
        text-align: center;
    }
    #register_main_center{
        margin: 0px 30% 0px 0px;
        /*background-color:green;*/
    }

    /*登录按钮*/
    #register_button_user{
        margin-left:100px;
    }
    /*管理员登录按钮*/
    #relogin_button_admin{
        margin-left:100px;
    }
    /*注册按钮*/
    /*#reset_button{


    }*/


</style>